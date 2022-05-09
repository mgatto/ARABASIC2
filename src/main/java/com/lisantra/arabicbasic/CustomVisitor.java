package com.lisantra.arabicbasic;

import org.antlr.v4.runtime.tree.TerminalNode;

import java.text.Collator;
import java.util.*;

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
    Value<?> val = (Value) visit(ctx.expression());
    Variable var = null;

    switch (val.getOriginalType()) {
      case "String":
        var = new StringVariable(s, val);
        break;

      case "Integer":
      case "Real":
        var = new NumericVariable(s, val);
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
    Value<?> wrapperOfValToInsert = (Value) visit(ctx.expression());
    Object valToInsert = wrapperOfValToInsert.getVal(); // this should be Double or String

    // TODO check type of value to insert
    // check the Value's originalType? or the Value's attr of element_type?
    // Type erasure means I probably can't get List<Integer> for example...

    // insert a value at the index; this call looks wierd
    Value arrayValue = existingArray.getValue();
    arrayValue.setOriginalType(wrapperOfValToInsert.getOriginalType());
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

  public Value<?> visitNested(ArabicBASICParser.NestedContext ctx) {
    return (Value) visit(ctx.expression());
  }

  public Value<?> visitUnary(ArabicBASICParser.UnaryContext ctx) {
    Value<Double> expr = (Value<Double>) visit(ctx.expression());
    Double exprVal = makeNumber(expr);

    // Copy by value here may only be necessary if there is a variable in the expression.
    // Otherwise, it mutates the original like this A = 1, X=-A and negates A retroactively.
    return new Value<>(-exprVal, expr.getOriginalType());
  }

  public Value<Double> visitAddSub(ArabicBASICParser.AddSubContext ctx) {
    // TODO ensure left is a numeric
    // TODO treat all numbers as Double in this Java code?
    Value<Double> left = (Value<Double>) visit(ctx.expression(0));
    Value<Double> right = (Value<Double>) visit(ctx.expression(1));

    // ensure both terms are addable/subtractable
    Double leftVal = makeNumber(left);
    Double rightVal = makeNumber(right);

    String resultType = getResultType(left, right);

    // TODO can use getType() if I specify the operators as terminals
    if (ctx.op.getText().equals("+")) {
      return new Value<>(leftVal + rightVal, resultType);
    }

    return new Value<>(leftVal - rightVal, resultType);
  }

  private Double makeNumber(Value<Double> val) {
    if (val.getVal() instanceof Double) {
      return val.getVal();
    } else {
      throw new IllegalArgumentException(
          "Only numbers can be operated on here. You tried to use: '" + val.getVal() + "'");
    }
  }

  private String getResultType(Value<Double> left, Value<Double> right) {
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

  public Value<Double> visitMulDiv(ArabicBASICParser.MulDivContext ctx) {
    Value left = (Value) visit(ctx.expression(0));
    Value right = (Value) visit(ctx.expression(1));

    Double leftVal = makeNumber(left);
    Double rightVal = makeNumber(right);

    String resultType = getResultType(left, right);

    // TODO can use getType() if I specify the operators as terminals
    if (ctx.op.getText().equals("*")) {
      // TODO use Guava's "int mustNotOverflow = IntMath.checkedMultiply(x, y);"
      return new Value<>(leftVal * rightVal, resultType);
    }

    if (rightVal == 0) {
      throw new ArithmeticException("Cannot divide by zero");
    }

    return new Value<>(leftVal / rightVal, resultType);
  }

  public Value<Double> visitExponentation(ArabicBASICParser.ExponentationContext ctx) {
    Value<Double> base = (Value<Double>) visit(ctx.expression(0));
    Value<Double> exponent = (Value<Double>) visit(ctx.expression(1));

    Double basePrimitive = makeNumber(base);
    Double exponentPrimitive = makeNumber(exponent);

    String resultType = getResultType(base, exponent);

    // Copy by value here may only be necessary if there is a variable in the expression.
    // Otherwise, it mutates the original like this A = 1, X=-A and negates A retroactively.
    return new Value<Double>(Math.pow(basePrimitive, exponentPrimitive), resultType);
  }

  /**
   * Resolves a symbol into its value
   *
   * @param ctx
   * @return the value associated with the var name
   */
  public Value<?> visitName(ArabicBASICParser.NameContext ctx) {
    if (showDebug) System.out.println("I visited Identifier");

    String id = ctx.IDENTIFIER().getText();
    if (!globalScope.containsKey(id)) {
      throw new NoSuchElementException("Variable '" + id + "' has not yet been declared.");
    }

    // The symbol table's value is of custom type Value
    return globalScope.get(id).getValue();
  }

  @Override
  public Value<?> visitArrayAccess(ArabicBASICParser.ArrayAccessContext ctx) {
    if (showDebug) System.out.println("I visited array access");

    String id = ctx.IDENTIFIER().getText();
    if (!globalScope.containsKey(id)) {
      throw new NoSuchElementException("Variable '" + id + "' has not yet been declared.");
    }

    // get index
    Integer idx = (Integer) visit(ctx.subscript());

    Value<?> val = globalScope.get(id).getValue();
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

    return new Value<>(targetArray.get(idx), elementsType);
  }

  public Value<Double> visitNumeric(ArabicBASICParser.NumericContext ctx) {
    // all get treated as Double anyways, but let's track the original type
    //  ...this is why I had a "number" rule in the grammar...
    if (null != ctx.INTEGER()) {
      return new Value<>(Double.valueOf(ctx.INTEGER().getText()), "Integer");
    } else {
      return new Value<>(Double.valueOf(ctx.REAL().getText()), "Real");
    }
  }

  public Value<String> visitText(ArabicBASICParser.TextContext ctx) {
    return new Value<>(ctx.STRING().getText(), "String");
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
    Value<List<?>> arr = new Value<>(new ArrayList<>(size), "Array");
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
      Value<?> indexVal = globalScope.get(id).getValue();

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
    /* determine state of the ArabicBASIC test expression */

    // TODO may need Apache Commons library BooleanUtils class
    Boolean condition = null;
    Object conditionalExpr =
        visit(ctx.booleanExpression()); // it could be Boolean or Value from atomicBoolean rule
    if (conditionalExpr instanceof Boolean) {
      condition = (Boolean) conditionalExpr;
      // special condition for an atomic of a constant or variable all by itself in the condition
    } else if (conditionalExpr instanceof Value) {
      // any non-null value true; else we'd get an undefined exception
      condition = true;
    }

    /* how many blocks are here? */
    int blockCount = ctx.block().size();
    if (showDebug) System.out.println("There are " + blockCount + " blocks in this IF statement.");
    /* with named keyword tokens, I can do this:
    if (ctx.start.getType() == YourLexer.BOOL) {
      // it's a BOOL token
    }
    or this (this is python?) myLexer.getVocabulary.getSymbolicName(myTerminalNode.getSymbol.getType)
    Those vocabulary methods seem to be the preferred way get at the tokens in Antlr 4.5, and tokenNames appears to be deprecated.

    ctx.start.getLine();
    */

    if (showDebug)
      System.out.println("condition: " + ctx.booleanExpression().getText() + " is " + condition);
    // This is VERY specific to a simple IF/optional ELSE statement
    if (Boolean.TRUE.equals(condition)) {
      visit(ctx.block(0));
    } else if (blockCount == 2) {
      // if condition is false, and there is an else block, then visit it.
      visit(ctx.block(1));
    }

    // TODO how can I tell in ANTLR4 if there is a specific, optional token I need
    //    ctx.getText() contains "ELSE"? or by naming the token?
    return null;
  }

  @Override
  public Boolean visitComparitiveBoolean(ArabicBASICParser.ComparitiveBooleanContext ctx) {
    // TODO bad for assuming a type already...
    Value<Double> left = (Value<Double>) visit(ctx.booleanExpression(0));
    Value<Double> right = (Value<Double>) visit(ctx.booleanExpression(1));

    if (showDebug)
      System.out.println(
          "left: " + left.getVal() + " " + ctx.comp.getText() + " right: " + right.getVal());

    //TODO What if one is a string and the other term is not? Check for this!

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

      return left.getVal() > right.getVal();
    } else if (ctx.comp.getText().equals(">=")) {
      if (strComparison != null) {
        if (strComparison > 0) return true;
        return false;
      }

      return left.getVal() >= right.getVal();
    } else if (ctx.comp.getText().equals("<")) {
      if (strComparison != null) {
        if (strComparison < 0) return true;
        return false;
      }

      return left.getVal() < right.getVal();
    } else if (ctx.comp.getText().equals("<=")) {
      if (strComparison != null) {
        if (strComparison < 1) return true;
        return false;
      }

      return left.getVal() <= right.getVal();
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
  public Value<?> visitAtomicBoolean(ArabicBASICParser.AtomicBooleanContext ctx) {
    /* it could be visitName(), visitNumeric() or visitText() */
    //    Object x = visit(ctx.variable(ctx));
    // TODO how to tell if it should return a value or be evaulated as a Boolean??

    return (Value) visitChildren(ctx);
  }
}
