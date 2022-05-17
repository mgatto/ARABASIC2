package com.lisantra.arabicbasic;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.Collator;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class CustomVisitor extends ArabicBASICBaseVisitor<Object> {
  private final Map<String, Variable> globalScope;
  private final boolean showDebug;

  public CustomVisitor(Map<String, Variable> globalScope, boolean showDebug) {
    super();
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

    String id = ctx.IDENTIFIER().getText();

    // really should be an enum?
    Symbol s = new VariableSymbol(id);

    /* If val is another variable [A = B], then a new value is returned; is "copy by value" */
    Value val = (Value) visit(ctx.expression());
    Variable var = null;

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

        // TODO this must be from a FN call
      case "Function":
        var = new Variable(s, val);
        break;

      default:
        System.out.println("Value's original type was " + val.getOriginalType());
    }

    /* this covers both creation and updating */
    globalScope.put(id, var);
    return null;
  }

  public Void visitArrayAssignment(ArabicBASICParser.ArrayAssignmentContext ctx) {
    if (showDebug) System.out.println("I visited Array Assignment");

    String id = ctx.IDENTIFIER().getSymbol().getText(); // we don't need to create a new symbol
    Integer index = (Integer) visit(ctx.subscript());

    // get the widened, stored Variable associated with id. It should be an Array,
    // better to not cast it and test for class type
    Variable existingArray = globalScope.get(id);
    if (!existingArray.getClass().getSimpleName().equals("ArrayVariable")) {
      throw new IllegalArgumentException(id + " is not an Array");
    } else {
    }

    // visit expression to get value to insert
    Value newElement = (Value) visit(ctx.expression());
    Object valToInsert = newElement.getVal(); // this should be Double or String

    // TODO check type of value to insert
    // check the Value's originalType? or the Value's attr of element_type?
    // Type erasure means I probably can't get List<Integer> for example...

    // insert a value at the index; this call looks wierd
    Value arrayValue = existingArray.getValue();
    arrayValue.setOriginalType(newElement.getOriginalType());
    ArrayList targetArray = (ArrayList) arrayValue.getVal();

    // TODO must test for existing index; add() for new element, and set() for updating
    // TODO will I need to reinsert this, or is it enough to "update" the List reference var?
    try {
      // could just try to get it and deal with exception? expensive in resources (?)
      Object existingElement = targetArray.get(index);
      // update
      targetArray.set(index, valToInsert); // TODO enforce consistent typing of elements
    } catch (IndexOutOfBoundsException idxe) {
      /* add new element and enforce array capacity */
      int maxIndex = ((ArrayVariable) existingArray).getUpperBound(); //  targetArray.size();

      if (index > maxIndex) {
        System.out.println(globalScope);
        throw new ArrayIndexOutOfBoundsException(
            "You tried to add a new element at position: "
                + index
                + ", but the array '"
                + id
                + "' only has elements from position 0 to position "
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

    // Copy by value here may only be necessary if there is a variable in the expression.
    // Otherwise, it mutates the original like this A = 1, X=-A and negates A retroactively.
    return new Value(-exprVal, expr.getOriginalType());
  }

  public Value visitAddSub(ArabicBASICParser.AddSubContext ctx) {
    // TODO ensure left is a numeric
    // TODO treat all numbers as Double in this Java code?
    Value left = (Value) visit(ctx.expression(0));
    Value right = (Value) visit(ctx.expression(1));

    // Can't rely on getOriginalType here...
    if (left.getVal() instanceof ArrayList && right.getVal() instanceof ArrayList) {
      if (ctx.op.getText().equals("+")) {
        ArrayList<?> combined = new ArrayList<>();
        //        System.out.println(combined);
        combined.addAll((ArrayList) left.getVal());
        //        System.out.println(combined);

        combined.addAll((ArrayList) right.getVal());
        //        System.out.println(combined);

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

    // TODO can use getType() if I specify the operators as terminals
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
    // what if left and right have different original types? Widen the result
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

  public Value visitMulDiv(ArabicBASICParser.MulDivContext ctx) {
    Value left = (Value) visit(ctx.expression(0));
    Value right = (Value) visit(ctx.expression(1));

    Double leftVal = makeNumber(left);
    Double rightVal = makeNumber(right);

    String resultType = getResultType(left, right);

    // TODO can use getType() if I specify the operators as terminals
    if (ctx.op.getText().equals("*")) {
      // TODO use Guava's "int mustNotOverflow = IntMath.checkedMultiply(x, y);"
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

    // TODO check size vs index
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

    //    System.out.println(targetArray.get(idx));
    //    System.out.println(elementsType);

    return new Value(targetArray.get(idx), elementsType);
  }

  public Value visitNumeric(ArabicBASICParser.NumericContext ctx) {
    // all get treated as Double anyways, but let's track the original type
    //  ...this is why I had a "number" rule in the grammar...
    if (null != ctx.INTEGER()) {
      return new Value(Double.valueOf(ctx.INTEGER().getText()), "Integer");
    } else {
      return new Value(Double.valueOf(ctx.REAL().getText()), "Real");
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

    // TODO probably should decide the type here for the Generic! Double or String
    //    No, probably not! An empty array is OK!

    // 3. wrap in Value; the type of List's elements are unknowable at this stage.
    List<Value> newArray = new ArrayList<>(size);
    for (int i = 0; i < size; i++) {
      // add blank Value as placeholder
      newArray.add(new Value(null, ""));
    }

    Value arr = new Value(newArray, "Array");
    // TODO switch to primitive "array"

    ArrayVariable var = new ArrayVariable(s, arr);
    var.setUpperBound((size > 0) ? size - 1 : 0);

    globalScope.put(id, var);
    return null;
  }

  public Integer visitArraySize(ArabicBASICParser.ArraySizeContext ctx) {
    return Integer.valueOf(ctx.INTEGER().getText());
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
      Object conditionalExpr =
          visit(ctx.booleanExpression(i)); // it could be Boolean or Value from atomicBoolean rule
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

    // HERE, all the conditions evaluated to false, so let's see if there is an ELSE
    // this would be when
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

    // TODO What if one is a string and the other term is not? Check for this!

    Integer strComparison = null;
    if (Objects.equals(left.getOriginalType(), "String")
        && Objects.equals(right.getOriginalType(), "String")) {
      Collator englishCollator = Collator.getInstance(new Locale("en", "US"));
      strComparison = englishCollator.compare(left.getVal(), right.getVal());
    }

    if (ctx.comp.getText().equals("=")) {
      // TODO deal with string comparisons!
      return Objects.equals(left.getVal(), right.getVal());
    } else if (ctx.comp.getText().equals("<>")) {
      return !Objects.equals(left.getVal(), right.getVal());
    } else if (ctx.comp.getText().equals(">")) {
      if (strComparison != null) {
        if (strComparison > 1) return true;
        return false;
      }

      return (Double) left.getVal() > (Double) right.getVal();
    } else if (ctx.comp.getText().equals(">=")) {
      if (strComparison != null) {
        if (strComparison > 0) return true;
        return false;
      }

      return (Double) left.getVal() >= (Double) right.getVal();
    } else if (ctx.comp.getText().equals("<")) {
      if (strComparison != null) {
        if (strComparison < 0) return true;
        return false;
      }

      return (Double) left.getVal() < (Double) right.getVal();
    } else if (ctx.comp.getText().equals("<=")) {
      if (strComparison != null) {
        if (strComparison < 1) return true;
        return false;
      }

      return (Double) left.getVal() <= (Double) right.getVal();
    } else {
      // TODO throw error
    }

    return false;
  }

  @Override
  public Boolean visitLogicalAnd(ArabicBASICParser.LogicalAndContext ctx) {
    // TODO what if
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
    // TODO how to tell if it should return a value or be evaulated as a Boolean??

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

      Object boxedPrimitive = exprToPrint.getVal();
      if (Objects.equals(exprToPrint.getOriginalType(), "Integer")) {
        // reformat integers; below feels a bit overdone...
        boxedPrimitive = ((Double) exprToPrint.getVal()).intValue();
      }

      System.out.print(boxedPrimitive + spacingSeparator);
    }

    // print blank line following any output
    System.out.println();
    return null;
  }

  @Override
  public Void visitInput(ArabicBASICParser.InputContext ctx) {
    /* TODO Maybe a "next?" default non-first prompt would be nice? */

    //    if (showDebug) System.out.println(ctx.prompt.getText());

    ListIterator<Token> varTokenIter = ctx.var.listIterator();
    while (varTokenIter.hasNext()) {
      //      if (showDebug) System.out.println(varTokenIter.nextIndex());

      // the prompt should apply to each variable in the list, but only printed once
      if (ctx.prompt != null && varTokenIter.nextIndex() == 0) {
        System.out.print(ctx.prompt.getText() + " ");
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
          Value val = new Value(intInput, "Integer");
          variable = new NumericVariable(s, val);

        } catch (NumberFormatException ne0) {
          // try to get float/real
          try {
            floatInput = Double.parseDouble(input);
            // make Value and Variable here
            Value val = new Value(floatInput, "Real");
            variable = new NumericVariable(s, val);

          } catch (IllegalArgumentException e) {
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

    //    ctx.spacer.getText();
    // loop the "var"s and do virtual assignments based on read in input
    // in loop , do the scan/buffered input reader

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
      // 4.  store updated value
      controlVal.setVal((double) counter);
      globalScope.put(id, controlVar);

      visit(ctx.block());

      if (showDebug) System.out.printf("counter=%d%n", counter);

      // 3. increment control var by 1 or step
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
        // return null;
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
    //    ParseTree arg = ctx.getChild(0); // I think this is the "arg"
    String argumentPlaceholder = ctx.variable().getText();

    // 3. get the body/expression
    //    ParseTree body = ctx.getChild(1); // I think this is the "block"
    // But, maybe I shouldn't use that? "Normally you would use the generated accessor methods
    // instead."
    // like, "expression"
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

    // 3. run the arg context to get a value, the passed-in value
    Value argValue = (Value) visit(ctx.variable());
    //    Object actualArgumentContent = argValue.getVal();
    if (showDebug) System.out.println(argValue);

    // 2. check it has the argument (s) <-- grammar takes care of it,
    // and any type mismatch will be caught by visitNumeric/visitText() etc

    // 3. copy the current arg value into a new var whose symbol was originally defined as a
    // function arg symbol and set the value of the arg into the Symbol table so the visit*() can
    // get to it
    String argSymbol = fnVar.getArg();
    globalScope.put(fnVar.getArg(), new Variable(new VariableSymbol(fnVar.getArg()), argValue));
    // ?? TODO needs to replicate switch to make it the right sub-type of Variable

    // 4. apply the raw value to the functionExpression context
    // let it run now, looking for the value of the ARG variable just recently added to the variable
    // table
    Value fnResult2 = (Value) visit(fnVar.getbody()); // should return a Value() instance
    if (showDebug) System.out.println(fnResult2);

    // 5. Destroy the arg variable in the symbol table
    globalScope.remove(fnVar.getArg());

    // 6. return the raw result wrapped, or just forward the Value class, actually...
    return fnResult2;
  }

  @Override
  public Value visitStringFunction(ArabicBASICParser.StringFunctionContext ctx) {
    // 1. Get value to operate upon
    // multiple args are allowed such as for RIGHT, so now it's a List
    Value argValue1 = (Value) visit(ctx.variable(0));
    String str = (String) argValue1.getVal();

    // if there's a 2nd arg, it has to be numeric
    Value argValue2 = null;
    if (null != ctx.variable(1)) {
      argValue2 = (Value) visit(ctx.variable(1));

      if (!argValue2.getOriginalType().equals("Integer")) {
        throw new IllegalArgumentException("argument: '" + argValue2 + "' should be a number.");
      }
    }

    // 2. ensure it is a string
    if (!argValue1.getOriginalType().equals("String")) {
      throw new IllegalArgumentException("argument: '" + argValue1 + "' is not a string.");
    }

    // 2. construct a default return value
    Value retValue = new Value("", "String");

    // 4. get name
    String operation = ctx.name.getText();
    //    if (showDebug) System.out.println("Function = " + operation);

    switch (operation) {
        // 'MID' | 'CHR' | 'ORD'
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

      case "CHR":
        break;

      case "ORD":
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

    // 0. Rare, special case: Arg may be null, since RND() for example takes no args.
    if (null == ctx.variable() && operation.equals("RND")) {
      retValue.setVal(ThreadLocalRandom.current().nextInt(0, 1));
      return retValue;
    } else if (null == ctx.variable()) {
      // this is a problem!
      throw new IllegalArgumentException(
          "This function requires a number as an argument, but none was given.");
    }

    // 1. Get value to operate upon
    Value argValue = (Value) visit(ctx.variable());

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

      case "EXP":
        break;

      default:
        throw new IllegalArgumentException("I do not recognize the function: '" + operation + "'.");
    }

    return retValue;
  }
}
