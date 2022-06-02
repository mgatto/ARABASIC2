package com.lisantra.arabicbasic;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.Collator;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class InterpreterVisitor extends ArabicBASICBaseVisitor<Object> {
  private Locale arabicLocale;
  private final Map<String, Variable> globalScope;
  private final boolean showDebug;

  public InterpreterVisitor(Locale locale, Map<String, Variable> globalScope, boolean showDebug) {
    super();
    this.arabicLocale = locale;
    this.globalScope = globalScope;
    this.showDebug = showDebug;
  }

  public Object visitProgram(ArabicBASICParser.ProgramContext ctx) {
    if (showDebug) System.out.println("I visited Program");

    return visitChildren(ctx);
  }

  /* This is where we'd implement lexical block scope if we wanted */
  public Object visitBlock(ArabicBASICParser.BlockContext ctx) {
    if (showDebug) System.out.println("I visited Block");

    return visitChildren(ctx);
  }

  public Object visitStatement(ArabicBASICParser.StatementContext ctx) {
    if (showDebug) System.out.println("I visited Statement");

    return visitChildren(ctx);
  }

  public Void visitSimpleAssignment(ArabicBASICParser.SimpleAssignmentContext ctx) {
    if (showDebug) System.out.println("I visited Simple Assignment");

    /* If val is another variable [A = B], then a new value is returned; is "copy by value" */
    Value val = (Value) visit(ctx.expression());
    Variable var = null;

    int varCount = ctx.name.size();
    for (int i = 0; i < varCount; i++) {
      String id = ctx.IDENTIFIER(i).getText();

      Symbol s = new VariableSymbol(id);

      switch (val.getOriginalType()) {
        case "String":
          var = new StringVariable(s, val);
          break;

        case "Integer":
        case "Real":
          var = new NumericVariable(s, val);
          break;

        case "Array":
          var = new ArrayVariable(s, val);
          break;

        case "Function":
          var = new Variable(s, val);
          break;

        default:
          System.out.println("Value's original type was " + val.getOriginalType());
      }

      /* this covers both creation and updating a variable */
      globalScope.put(id, var);
    }

    return null;
  }

  public Void visitArrayAssignment(ArabicBASICParser.ArrayAssignmentContext ctx) {
    if (showDebug) System.out.println("I visited Array Assignment");

    /* we don't need to create a new symbol for element assignment */
    String id = ctx.IDENTIFIER().getSymbol().getText();
    Integer index = (Integer) visit(ctx.subscript());

    // get the widened, stored Variable associated with id. It should be an Array,
    // but better to not cast it and instead to test for class type
    Variable existingArray = globalScope.get(id);
    if (!existingArray.getClass().getSimpleName().equals("ArrayVariable")) {
      throw new IllegalArgumentException(id + " is not an Array");
    }

    // visit expression to get value to insert
    Value newElement = (Value) visit(ctx.expression());
    Object valToInsert = newElement.getVal(); // this should be Double or String

    // TODO check type of value to insert; check the Value's originalType
    // Type erasure means I probably can't get List<Integer>, though which would be nice.

    // insert a value at the index; this call looks wierd
    Value arrayValue = existingArray.getValue();
    arrayValue.setOriginalType(newElement.getOriginalType());
    ArrayList targetArray = (ArrayList) arrayValue.getVal();

    /* must test for existing index; add() for new element, and set() for updating */
    try {
      // could just try to get it and deal with exception? expensive in resources (?)
      Object existingElement = targetArray.get(index);
      // update
      targetArray.set(index, valToInsert); // TODO enforce consistent typing of elements
    } catch (IndexOutOfBoundsException idxe) {
      /* add new element and enforce array capacity */
      int maxIndex = ((ArrayVariable) existingArray).getUpperBound();

      if (index > maxIndex) {
        System.out.println(globalScope);
        throw new ArrayIndexOutOfBoundsException(
            "You tried to add a new element at position: "
                + index
                + ", but the array '"
                + id
                + "' only has elements from position: 0 to position: "
                + maxIndex);
      }
      targetArray.add(index, valToInsert);
    }

    return null;
  }

  public Value visitNested(ArabicBASICParser.NestedContext ctx) {
    return (Value) visit(ctx.expression());
  }

  public Value visitUnary(ArabicBASICParser.UnaryContext ctx) {
    Value expr = (Value) visit(ctx.expression());
    Double exprVal = makeNumber(expr);

    /* Copy by value here may only be necessary if there is a variable in the expression.
     * Otherwise, it mutates the original like this A = 1, X=-A and negates A retroactively. */
    return new Value(-exprVal, expr.getOriginalType());
  }

  public Value visitAddSub(ArabicBASICParser.AddSubContext ctx) {
    Value left = (Value) visit(ctx.expression(0));
    Value right = (Value) visit(ctx.expression(1));

    if (left.getVal() instanceof ArrayList && right.getVal() instanceof ArrayList) {
      if (ctx.op.getText().equals("+")) {
        ArrayList<?> combined = new ArrayList<>();

        combined.addAll((ArrayList) left.getVal());
        combined.addAll((ArrayList) right.getVal());

        return new Value(combined, "Array");
      } else {
        throw new IllegalArgumentException("Arrays may not be subtracted.");
      }
    }

    // Are we operating on strings? Only valid for "+"
    if (Objects.equals(left.getOriginalType(), "String")
        && Objects.equals(right.getOriginalType(), "String")) {
      if (ctx.op.getText().equals("+")) {
        return new Value((String) left.getVal() + (String) right.getVal(), "String");
      } else {
        throw new IllegalArgumentException("Strings may not be subtracted.");
      }
    }

    // ensure both terms are addable/subtractable
    Double leftVal = makeNumber(left);
    Double rightVal = makeNumber(right);

    String resultType = getResultType(left, right);

    // TODO can use getType() if I specify the operators as terminals by aliasing them as
    // tokens in the grammar.
    if (ctx.op.getText().equals("+")) {
      return new Value(leftVal + rightVal, resultType);
    }

    return new Value(leftVal - rightVal, resultType);
  }

  private Double makeNumber(Value val) {
    if (val.getVal() instanceof Double) {
      return (Double) val.getVal();
    } else {
      throw new IllegalArgumentException(
          "Only numbers can be operated on here. You tried to use: '" + val.getVal() + "'");
    }
  }

  private String getResultType(Value left, Value right) {
    /* Widen the result in case left and right have different original types */
    String resultType;
    String leftType = left.getOriginalType();
    String rightType = right.getOriginalType();

    if (Objects.equals(leftType, "Integer") && leftType.equals(rightType)) {
      resultType = "Integer";
    } else {
      resultType = "Real";
    }

    return resultType;
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
   * ctx}.
   */
  @Override
  public Value visitModulus(ArabicBASICParser.ModulusContext ctx) {
    Value left = (Value) visit(ctx.expression(0));
    Value right = (Value) visit(ctx.expression(1));

    Double leftVal = makeNumber(left);
    Double rightVal = makeNumber(right);

    return new Value(leftVal % rightVal, "Integer");
  }

  public Value visitMulDiv(ArabicBASICParser.MulDivContext ctx) {
    Value left = (Value) visit(ctx.expression(0));
    Value right = (Value) visit(ctx.expression(1));

    Double leftVal = makeNumber(left);
    Double rightVal = makeNumber(right);

    String resultType = getResultType(left, right);

    // TODO can use getType() if I specify the operators as terminals
    if (ctx.op.getText().equals("*")) {
      // TODO use Google Guava's "int mustNotOverflow = IntMath.checkedMultiply(x, y);"
      return new Value(leftVal * rightVal, resultType);
    }

    if (rightVal == 0) {
      throw new ArithmeticException("Cannot divide by zero");
    }

    return new Value(leftVal / rightVal, resultType);
  }

  public Value visitExponentation(ArabicBASICParser.ExponentationContext ctx) {
    Value base = (Value) visit(ctx.expression(0));
    Value exponent = (Value) visit(ctx.expression(1));

    Double basePrimitive = makeNumber(base);
    Double exponentPrimitive = makeNumber(exponent);

    String resultType = getResultType(base, exponent);

    // Copy by value here may only be necessary if there is a variable in the expression.
    // Otherwise, it mutates the original like this A = 1, X=-A and negates A retroactively.
    return new Value(Math.pow(basePrimitive, exponentPrimitive), resultType);
  }

  /**
   * Resolves a symbol into its value
   *
   * @param ctx
   * @return the value associated with the var name
   */
  public Value visitName(ArabicBASICParser.NameContext ctx) {
    if (showDebug) System.out.println("I visited Identifier");

    String id = ctx.IDENTIFIER().getText();
    if (!globalScope.containsKey(id)) {
      throw new NoSuchElementException("Variable '" + id + "' has not yet been declared.");
    }

    // The symbol table's value is of custom type Value
    return globalScope.get(id).getValue();
  }

  @Override
  public Value visitArrayAccess(ArabicBASICParser.ArrayAccessContext ctx) {
    if (showDebug) System.out.println("I visited array access");

    String id = ctx.IDENTIFIER().getText();
    if (!globalScope.containsKey(id)) {
      throw new NoSuchElementException("Variable '" + id + "' has not yet been declared.");
    }

    // get index
    Integer idx = (Integer) visit(ctx.subscript());

    Value val = globalScope.get(id).getValue();
    List targetArray = (ArrayList) val.getVal();

    // TODO use upperBound instead of size()
    int numberOfElements = targetArray.size();
    if (idx > numberOfElements) {
      System.out.println(globalScope);
      throw new ArrayIndexOutOfBoundsException(
          "You tried to add a new element at position: "
              + idx
              + ", but the array '"
              + id
              + "' only has elements from position 0 to position "
              + numberOfElements);
    }

    String elementsType = val.getOriginalType();
    return new Value(targetArray.get(idx), elementsType);
  }

  public Value visitNumeric(ArabicBASICParser.NumericContext ctx) {
    // all get treated as Double anyways, but let's track the original type

    // Double.valueOf causes NumberFormat exception with Arabic numbers
    // https://stackoverflow.com/questions/60044997/integer-valueof-arabic-number-works-fine-but-float-valueof-the-same-number-gives
    NumberFormat arabicNumberFormat = NumberFormat.getNumberInstance(this.arabicLocale);

    String inputNumerical = "";
    String type = "";

    if (null != ctx.INTEGER()) {

      inputNumerical = ctx.INTEGER().getText();
      type = "Integer";
    } else {
      inputNumerical = ctx.REAL().getText();
      type = "Real";
    }

    //  convert the text to english digits, and then re-Arabicize later on output
    try {
      double parsedArabicNumeral = arabicNumberFormat.parse(inputNumerical).doubleValue();

      return new Value(parsedArabicNumeral, type);
    } catch (ParseException pe) {
      throw new IllegalArgumentException("Number could not be parsed");
    }
  }

  public Value visitText(ArabicBASICParser.TextContext ctx) {
    return new Value(ctx.STRING().getText(), "String");
  }

  public Void visitArrayCreation(ArabicBASICParser.ArrayCreationContext ctx) {
    if (showDebug) System.out.println("I visited Array Creation");

    // 2. get array_size
    Integer size = (Integer) visit(ctx.arraySize());

    // 1. get identifier
    String id = ctx.IDENTIFIER().getText();
    Symbol s = new VariableSymbol(id);

    // 3. wrap in Value; the type of List's elements are unknowable at this stage.
    List<Value> newArray = new ArrayList<>(size);
    for (int i = 0; i < size; i++) {
      // add blank Value as placeholder
      newArray.add(new Value(null, ""));
    }

    Value arr = new Value(newArray, "Array");
    ArrayVariable var = new ArrayVariable(s, arr);
    var.setUpperBound((size > 0) ? size - 1 : 0);

    globalScope.put(id, var);
    return null;
  }

  public Integer visitArraySize(ArabicBASICParser.ArraySizeContext ctx) {
    Value size = (Value) visit(ctx.expression());

    // 2. ensure it is numeric
    if (!(size.getOriginalType().equals("Integer"))) {
      throw new IllegalArgumentException("argument: '" + size + "' is not an integer");
    }

    return ((Double) size.getVal()).intValue();
  }

  public Integer visitSubscript(ArabicBASICParser.SubscriptContext ctx) {
    // OK, there are no children to visit, so work with the Terminals...
    Integer index = null;

    TerminalNode subscriptName = ctx.IDENTIFIER();
    TerminalNode subscriptInt = ctx.INTEGER();

    if (subscriptInt != null) {
      index = Integer.valueOf(subscriptInt.getText());
    } else if (subscriptName != null) {
      String id = subscriptName.getText();
      if (!globalScope.containsKey(id)) {
        throw new NoSuchElementException("Variable '" + id + "' has not yet been declared.");
      }

      // The symbol table's value is of custom type Value
      Value indexVal = globalScope.get(id).getValue();

      /* validate that it's an integer */
      if (!indexVal.getOriginalType().equals("Integer")) {
        throw new IllegalArgumentException(
            ctx.getText() + " is not a valid number for accessing an array element");
      }

      index = ((Double) indexVal.getVal()).intValue();
    }

    return index;
  }

  public Void visitConditionalBlock(ArabicBASICParser.ConditionalBlockContext ctx) {
    // TODO may need Apache Commons library BooleanUtils class
    Boolean condition = null;

    // How many conditions to run?
    int testCount = ctx.booleanExpression().size();
    if (showDebug) System.out.println("There are " + testCount + " IFs and ELSE IFs.");

    /* how many blocks are here? */
    int blockCount = ctx.block().size();
    if (showDebug) System.out.println("There are " + blockCount + " blocks in this IF statement.");

    for (int i = 0; i < testCount; i++) {
      // it could be Boolean or Value from atomicBoolean rule
      Object conditionalExpr = visit(ctx.booleanExpression(i));
      if (conditionalExpr instanceof Boolean) {
        condition = (Boolean) conditionalExpr;
        // special condition for an atomic of a constant or variable all by itself in the condition
      } else if (conditionalExpr instanceof Value) {
        // any non-null value true; else we'd get an undefined exception
        condition = true;
      }
      if (showDebug)
        System.out.println(
            "condition #" + i + ": " + ctx.booleanExpression(i).getText() + " is " + condition);

      if (Boolean.TRUE.equals(condition)) {
        visit(ctx.block(i));
        return null;
      }
    }

    // Up to HERE, all the conditions evaluated to false, so let's see if there is an ELSE
    if (blockCount == testCount + 1) {
      // if condition is false, and there is an else block, then visit it.
      visit(ctx.block(blockCount - 1));
    }

    return null;

    /* with named keyword tokens, I can do this:
    if (ctx.start.getType() == YourLexer.BOOL) {
      // it's a BOOL token
    }
    or this (this is python?) myLexer.getVocabulary.getSymbolicName(myTerminalNode.getSymbol.getType)
    Those vocabulary methods seem to be the preferred way get at the tokens in Antlr 4.5, and tokenNames appears to be deprecated.

    ctx.start.getLine();
    */
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
   * ctx}.
   */
  @Override
  public Void visitSingleLineConditional(ArabicBASICParser.SingleLineConditionalContext ctx) {
    Boolean condition = null;

    Object conditionalExpr =
        visit(ctx.booleanExpression()); // it could be Boolean or Value from atomicBoolean rule
    if (conditionalExpr instanceof Boolean) {
      condition = (Boolean) conditionalExpr;
      // special condition for a constant or variable all by itself in the condition
    } else if (conditionalExpr instanceof Value) {
      // any non-null value true; else we'd get an undefined exception
      condition = true;
    }

    if (showDebug)
      System.out.println(
          "condition " + ": " + ctx.booleanExpression().getText() + " is " + condition);

    if (Boolean.TRUE.equals(condition)) {
      visit(ctx.statement());
      return null;
    }

    return null;
  }

  @Override
  public Boolean visitComparitiveBoolean(ArabicBASICParser.ComparitiveBooleanContext ctx) {
    // TODO bad for assuming a type already...
    Value left = (Value) visit(ctx.booleanExpression(0));
    Value right = (Value) visit(ctx.booleanExpression(1));

    if (showDebug)
      System.out.println(
          "left: " + left.getVal() + " " + ctx.comp.getText() + " right: " + right.getVal());

    //  What if one is a string and the other term is not? Check for this.
    Integer strComparison = null;
    if (Objects.equals(left.getOriginalType(), "String")
        && Objects.equals(right.getOriginalType(), "String")) {
      Collator arabicCollator = Collator.getInstance(new Locale("ar"));
      strComparison = arabicCollator.compare(left.getVal(), right.getVal());
    }

    if (ctx.comp.getText().equals("=")) {
      /* deal with string comparisons */
      return Objects.equals(left.getVal(), right.getVal());
    } else if (ctx.comp.getText().equals("<>")) {
      return !Objects.equals(left.getVal(), right.getVal());
    } else if (ctx.comp.getText().equals(">")) {
      if (strComparison != null) {
        return strComparison > 1;
      }

      return (Double) left.getVal() > (Double) right.getVal();
    } else if (ctx.comp.getText().equals(">=")) {
      if (strComparison != null) {
        return strComparison > 0;
      }

      return (Double) left.getVal() >= (Double) right.getVal();
    } else if (ctx.comp.getText().equals("<")) {
      if (strComparison != null) {
        return strComparison < 0;
      }

      return (Double) left.getVal() < (Double) right.getVal();
    } else if (ctx.comp.getText().equals("<=")) {
      if (strComparison != null) {
        return strComparison < 1;
      }

      return (Double) left.getVal() <= (Double) right.getVal();
    } else {
      // TODO throw error
    }

    return false;
  }

  @Override
  public Boolean visitLogicalAnd(ArabicBASICParser.LogicalAndContext ctx) {
    Boolean left = (Boolean) visit(ctx.booleanExpression(0));
    Boolean right = (Boolean) visit(ctx.booleanExpression(1));

    if (showDebug) System.out.println(left);
    if (showDebug) System.out.println(right);

    return (left && right);
  }

  @Override
  public Boolean visitLogicalOr(ArabicBASICParser.LogicalOrContext ctx) {
    Boolean left = (Boolean) visit(ctx.booleanExpression(0));
    Boolean right = (Boolean) visit(ctx.booleanExpression(1));

    if (showDebug) System.out.println(left);
    if (showDebug) System.out.println(right);

    return (left || right);
  }

  @Override
  public Boolean visitNestedBoolean(ArabicBASICParser.NestedBooleanContext ctx) {
    return (Boolean) visit(ctx.booleanExpression());
  }

  @Override
  public Boolean visitNegatingBoolean(ArabicBASICParser.NegatingBooleanContext ctx) {
    Boolean test = (Boolean) visit(ctx.booleanExpression());
    return !test; // TODO should I copy by value? or does it even matter?
  }

  /**
   * Tests only for existence; a variable is defined or a constant (which is always true)
   *
   * @param ctx
   * @return
   */
  @Override
  public Value visitAtomicBoolean(ArabicBASICParser.AtomicBooleanContext ctx) {
    /* it could be visitName(), visitNumeric() or visitText() */
    //    Object x = visit(ctx.variable(ctx));
    // how to tell if it should return a value or be evaulated as a Boolean??
    // just run visitChildren().

    return (Value) visitChildren(ctx);
  }

  @Override
  public Void visitPrint(ArabicBASICParser.PrintContext ctx) {
    // loop through how many expressions there are
    int exprCount = ctx.expression().size();
    for (int i = 0; i < exprCount; i++) {
      Value exprToPrint = (Value) visit(ctx.expression(i));

      // Pad output with spacing depending on type of separator
      // there will always be size - 1 spacers
      String spacingSeparator = " ";
      int spacerCount = ctx.spacer.size();
      if (i < spacerCount) {
        String spacingController = ctx.spacer.get(i).getText();
        if (Objects.equals(spacingController, ";")) spacingSeparator = "";
      }

      NumberFormat arabicNumberFormat;
      Object boxedPrimitive = exprToPrint.getVal();
      // TODO wait, it could be an array, too!

      switch (exprToPrint.getOriginalType()) {
        case "String":
          System.out.print(boxedPrimitive + spacingSeparator);
          break;
        case "Real":
          arabicNumberFormat = NumberFormat.getNumberInstance(this.arabicLocale);
          System.out.println(arabicNumberFormat.format(boxedPrimitive));
          break;
        case "Integer":
          arabicNumberFormat = NumberFormat.getNumberInstance(this.arabicLocale);

          // truncate it
          /*new DecimalFormat(
          "#,###.##",
          DecimalFormatSymbols.getInstance(customLocale)).format(d))*/
          boxedPrimitive = ((Double) exprToPrint.getVal()).intValue();
          System.out.println(arabicNumberFormat.format(boxedPrimitive));
          break;

        case "Array":
          for (Value element : (ArrayList<Value>) boxedPrimitive) {
            System.out.println(element.getVal());
          }
          break;
        default:
      }
    }

    return null;
  }

  @Override
  public Void visitInput(ArabicBASICParser.InputContext ctx) {
    // TODO Maybe a "next?" default non-first prompt would be nice?

    ListIterator<Token> varTokenIter = ctx.var.listIterator();
    while (varTokenIter.hasNext()) {
      System.out.println(); // blank line before prompt

      // the prompt should apply to each variable in the list, but only printed once
      if (ctx.prompt != null && varTokenIter.nextIndex() == 0) {
        System.out.print(ctx.prompt.getText().replaceAll("^\"|\"$", "") + " ");
      } else {
        // if no prompt, default to "?"
        System.out.print("? ");
      }

      Integer intInput = null;
      Double floatInput = null;
      String textInput = null;
      String id = varTokenIter.next().getText();
      Symbol s = new VariableSymbol(id);
      Variable variable = null;

      try {
        // get line input
        BufferedReader reader =
            new BufferedReader(new InputStreamReader(System.in)); // using java.io.*
        String input = reader.readLine(); // it reads everything into string
        // or, String str = System.console().readLine();

        // Nested exceptions and use of exceptions like this is considered bad style.
        try {
          intInput = Integer.parseInt(input);
          Value val = new Value(Double.valueOf(intInput), "Integer");
          variable = new NumericVariable(s, val);

        } catch (NumberFormatException ne0) {
          // try to get float/real
          try {
            NumberFormat arabicNumberFormat = NumberFormat.getNumberInstance(this.arabicLocale);
            double parsedArabicNumeral = arabicNumberFormat.parse(input).doubleValue();

            // make Value and Variable here
            Value val = new Value(parsedArabicNumeral, "Real");
            variable = new NumericVariable(s, val);

          } catch (IllegalArgumentException | ParseException e) {
            // keep it as a string
            textInput = input;
            // make Value and Variable here
            Value val = new Value(textInput, "String");
            variable = new StringVariable(s, val);
          }
        }

        globalScope.put(id, variable);

      } catch (IOException e) {
        System.out.println(e.toString());
      }
    }

    return null;
  }

  /** If val is another variable [A = B], then a new value is returned; is "copy by value" */
  @Override
  public Void visitForLoop(ArabicBASICParser.ForLoopContext ctx) {

    int lower = Integer.parseInt(ctx.lower.getText());
    int upper = Integer.parseInt(ctx.upper.getText());
    // TODO if I decide to be not inclusive, then either subtract 1 here or change "while" below

    int counter = lower;

    int step = 1;
    if (ctx.step != null) {
      step = Integer.parseInt(ctx.step.getText());
    }

    if (showDebug) System.out.printf("lower=%d%n", lower);
    if (showDebug) System.out.printf("upper=%d%n", upper);

    // 1. instantiate control variable = "lower" and add it to var table
    String id = ctx.control.getText();
    Symbol s = new VariableSymbol(id);

    // temp val using lower, which should be the same as counter...
    Value controlVal = new Value((double) lower, "Integer");
    Variable controlVar = new NumericVariable(s, controlVal);
    //    globalScope.put(id, controlVar);

    // Start Java while loop
    // 2. if control var is less than "upper", then visit(block)
    while (counter >= lower && counter <= upper) {
      // 3.  store updated value FIRST
      controlVal.setVal((double) counter);
      globalScope.put(id, controlVar);

      visit(ctx.block());

      if (showDebug) System.out.printf("counter=%d%n", counter);

      // 4. increment control var by step
      counter += step;
    }

    return null;
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
   * ctx}.
   */
  @Override
  public Void visitWhileLoop(ArabicBASICParser.WhileLoopContext ctx) {
    // assume true, so we can enter the loop; can be "Break"ed if condition evaluates to false
    // before executing "block"
    Boolean condition = true;

    // it could be Boolean or Value from atomicBoolean rule
    while (condition) {
      Object conditionalExpr = visit(ctx.booleanExpression());
      if (conditionalExpr instanceof Boolean) {
        condition = (Boolean) conditionalExpr;
      } else if (conditionalExpr instanceof Value) {
        // special condition for an atomic of a constant or variable all by itself in the condition
        // any non-null value true; else we'd get an undefined exception
        condition = true;
      }
      if (showDebug)
        System.out.println("condition: " + ctx.booleanExpression().getText() + " is " + condition);

      if (Boolean.FALSE.equals(condition)) {
        break;
      }

      visit(ctx.block());
    }

    return null;
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
   * ctx}.
   */
  @Override
  public Void visitDefineSingleLineFunction(ArabicBASICParser.DefineSingleLineFunctionContext ctx) {
    // 1. get funcName
    String id = ctx.funcName.getText();
    Symbol s = new FunctionSymbol(id);

    // 2. get arg and visit(identifier)
    String argumentPlaceholder = ctx.variable().getText();

    // 3. get the body/expression
    ArabicBASICParser.ExpressionContext functionExpression = ctx.expression();

    // 4. save the expression
    globalScope.put(
        id,
        new FunctionVariable(
            s, new Value(null, "Function"), argumentPlaceholder, functionExpression));

    return null;
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
   * ctx}.
   */
  @Override
  public Value visitCallFunction(ArabicBASICParser.CallFunctionContext ctx) {
    // 1. retrieve function from the symbol table
    String fnName = ctx.funcName.getText();
    Object fn = globalScope.get(fnName);

    // should be a FunctionVariable
    FunctionVariable fnVar = null;
    if (fn instanceof FunctionVariable) {
      fnVar = (FunctionVariable) fn;
    } else {
      throw new IllegalArgumentException(fnName + " is not a function");
    }

    // 2. run the arg context to get a value, the passed-in value
    Value argValue = (Value) visit(ctx.variable());
    //    Object actualArgumentContent = argValue.getVal();
    if (showDebug) System.out.println(argValue);

    // 3. check it has the argument (s) <-- grammar takes care of it,
    // and any type mismatch will be caught by visitNumeric/visitText() etc

    // 4. copy the current arg value into a new var whose symbol was originally defined as a
    // function arg symbol and set the value of the arg into the Symbol table so the visit*() can
    // get to it
    String argSymbol = fnVar.getArg();
    globalScope.put(fnVar.getArg(), new Variable(new VariableSymbol(fnVar.getArg()), argValue));
    // ?? TODO needs to replicate switch to make it the right sub-type of Variable

    // 5. apply the raw value to the functionExpression context
    // let it run now, looking for the value of the ARG variable just recently added to the variable
    // table
    Value fnResult2 = (Value) visit(fnVar.getbody()); // should return a Value() instance
    if (showDebug) System.out.println(fnResult2);

    // 6. Destroy the arg variable in the symbol table
    globalScope.remove(fnVar.getArg());

    // 7. return the raw result wrapped, or just forward the Value class, actually...
    return fnResult2;
  }

  @Override
  public Value visitStringFunction(ArabicBASICParser.StringFunctionContext ctx) {
    // 4. get name
    String operation = ctx.name.getText();

    // 1. Get value to operate upon
    // multiple args are allowed such as for RIGHT, so now it's a List
    Value argValue1 = (Value) visit(ctx.variable(0));

    // 2. construct a default return value
    Value retValue = new Value("", "String");

    // special case for CHR()
    if (operation.equals("CHR")) {
      // oh, this casting is a doozey!
      char ch = (char) ((Double) argValue1.getVal()).intValue();
      retValue.setVal(ch);
      return retValue;
    }

    // 2. ensure it is a string
    if (!argValue1.getOriginalType().equals("String")) {
      throw new IllegalArgumentException("argument: '" + argValue1 + "' is not a string.");
    }

    String str = (String) argValue1.getVal();

    // if there's a 2nd arg, it has to be numeric
    Value argValue2 = null;
    if (null != ctx.variable(1)) {
      argValue2 = (Value) visit(ctx.variable(1));

      if (!argValue2.getOriginalType().equals("Integer")) {
        throw new IllegalArgumentException("argument: '" + argValue2 + "' should be a number.");
      }
    }

    switch (operation) {
        // MID
      case "LEN":
        retValue.setVal((double) str.length());
        retValue.setOriginalType("Integer");

        if (showDebug) System.out.println(retValue);
        break;

      case "LEFT":
        // the grammar won't catch an absent 2nd arg
        if (null == argValue2)
          throw new IllegalArgumentException(
              "The second argument is missing. It should be a number.");

        if (((Double) argValue2.getVal()).intValue() > str.length())
          throw new IllegalArgumentException(
              "The second argument is greater than the length of the string.");

        retValue.setVal(str.substring(0, ((Double) argValue2.getVal()).intValue()));
        break;

      case "RIGHT":
        // the grammar won't catch an absent 2nd arg
        if (null == argValue2)
          throw new IllegalArgumentException(
              "The second argument is missing. It should be a number.");

        if (((Double) argValue2.getVal()).intValue() > str.length())
          throw new IllegalArgumentException(
              "The second argument is greater than the length of the string.");
        // will throw IndexOutOfBoundsException
        retValue.setVal(
            str.substring(str.length() - ((Double) argValue2.getVal()).intValue(), str.length()));
        break;

      case "MID":
        break;

      case "ORD":
        int ascii = (int) str.charAt(0);
        retValue.setVal((double) ascii);
        retValue.setOriginalType("Integer");
        break;

      default:
        throw new IllegalArgumentException("I do not recognize the function: '" + operation + "'.");
    }

    return retValue;
  }

  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
   * ctx}.
   */
  @Override
  public Value visitMathFunction(ArabicBASICParser.MathFunctionContext ctx) {
    // 2. construct a return value
    Value retValue = new Value(null, "Real"); // default to REAL

    // 4. get name
    String operation = ctx.name.getText();

    if (null == ctx.expression()) {
      throw new IllegalArgumentException(
          "This function requires a number as an argument, but none was given.");
    }

    // 1. Get value to operate upon
    Value argValue = (Value) visit(ctx.expression());

    // 2. ensure it is numeric
    if (!(argValue.getOriginalType().equals("Integer")
        || argValue.getOriginalType().equals("Real"))) {
      throw new IllegalArgumentException("argument: '" + argValue + "' is not a number");
    }

    // TODO has to be a better way to proxy the calls...
    switch (operation) {
      case "ABS":
        retValue.setVal(Math.abs((double) argValue.getVal()));
        retValue.setOriginalType(argValue.getOriginalType());
        break;

      case "SQR":
        retValue.setVal(Math.sqrt((double) argValue.getVal()));
        break;

      case "LOG":
        if ((double) argValue.getVal() == 0.0)
          throw new IllegalArgumentException("0 (zero) is not allowed for LOG(). ");

        retValue.setVal(Math.log10((double) argValue.getVal()));
        break;

      case "COS":
        retValue.setVal(Math.cos((double) argValue.getVal()));
        break;

      case "SIN":
        retValue.setVal(Math.sin((double) argValue.getVal()));
        break;

      case "TAN":
        retValue.setVal(Math.tan((double) argValue.getVal()));
        break;

      case "INT":
        // this is a really roundabout thing...
        retValue.setVal((double) ((Double) argValue.getVal()).intValue());
        retValue.setOriginalType("Integer");
        break;

      case "RND":
        retValue.setVal(
            (double)
                ThreadLocalRandom.current()
                    .nextInt(0, ((Double) argValue.getVal()).intValue() + 1));
        retValue.setOriginalType("Integer");
        break;

      case "EXP":
        break;

      default:
        throw new IllegalArgumentException("I do not recognize the function: '" + operation + "'.");
    }

    return retValue;
  }
}
