package com.lisantra.arabicbasic;

import java.util.*;

public class CustomVisitor extends ArabicBASICBaseVisitor<Object> {
  private final Map<String, Variable> symbolTable;
  private final boolean showDebug;

  public CustomVisitor(Map<String, Variable> symbolTable, boolean showDebug) {
    super();
    this.symbolTable = symbolTable;
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
    symbolTable.put(id, var);
    return null;
  }

  public Void visitArrayAssignment(ArabicBASICParser.ArrayAssignmentContext ctx) {
    if (showDebug) System.out.println("I visited Array Assignment");

    // get identifier
    String id = ctx.IDENTIFIER().getText(); // we don't need to create a new symbol

    // get index
    Integer idx = (Integer) visit(ctx.arrayIndex()); // later, visitArrayIndex()

    // get the stored Variable associated with id
    ArrayVariable existingArray = (ArrayVariable) symbolTable.get(id);

    // visit expression to get value to insert
    Value<?> wrapperOfValToInsert = (Value) visit(ctx.expression());
    Object valToInsert = wrapperOfValToInsert.getVal(); // this should be Double or String

    // TODO check type of value to insert
    // check the Value's originalType? or the Value's attr of element_type?
    // Type erasure means I probably can't get List<Integer> for example...

    // insert a value at the index; this call looks wierd
    List targetArray = (ArrayList) existingArray.getValue().getVal();

    // TODO must test for existing index; add() for new element, and set() for updating
    // TODO will I need to reinsert this, or is it enough to "update" the List reference var?
    try {
      // could just try to get it and deal with exception? expensive in resources (?)
      Object existingElement = targetArray.get(idx);
      // update
      targetArray.set(idx, valToInsert); // TODO enforce consistent typing of elements
    } catch (IndexOutOfBoundsException idxe) {
      /* add new element and enforce array capacity */
      int numberOfElements = existingArray.getUpperBound(); //  targetArray.size();

      if (idx >= numberOfElements) {
        System.out.println(symbolTable);
        throw new ArrayIndexOutOfBoundsException(
            "You tried to add a new element at position: "
                + idx
                + ", but the array '"
                + id
                + "' has only "
                + numberOfElements
                + " elements");
      }
      targetArray.add(idx, valToInsert);
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
      resultType = "Float";
    }

    return resultType;
  }

  public Value<?> visitMulDiv(ArabicBASICParser.MulDivContext ctx) {
    Value left = (Value) visit(ctx.expression(0));
    Value right = (Value) visit(ctx.expression(1));

    Double leftVal = makeNumber(left);
    Double rightVal = makeNumber(right);

    String resultType = getResultType(left, right);

    // TODO can use getType() if I specify the operators as terminals
    if (ctx.op.getText().equals("*")) {
      return new Value<>(leftVal * rightVal, resultType);
    }

    if (rightVal == 0) {
      throw new ArithmeticException("Cannot divide by zero");
    }

    return new Value<>(leftVal / rightVal, resultType);
  }

  /**
   * @param ctx
   * @return the value associated with the var name
   */
  public Value<?> visitName(ArabicBASICParser.NameContext ctx) {
    if (showDebug) System.out.println("I visited Identifier");

    String id = ctx.IDENTIFIER().getText();
    if (!symbolTable.containsKey(id)) {
      throw new NoSuchElementException("Variable '" + id + "' has not yet been declared.");
    }

    // The symbol table's value is of custom type Value
    return symbolTable.get(id).getValue();
  }

  @Override
  public Value<?> visitArrayAccess(ArabicBASICParser.ArrayAccessContext ctx) {
    if (showDebug) System.out.println("I visited array access");

    String id = ctx.IDENTIFIER().getText();
    if (!symbolTable.containsKey(id)) {
      throw new NoSuchElementException("Variable '" + id + "' has not yet been declared.");
    }

    // get index
    Integer idx = (Integer) visit(ctx.arrayIndex());

    Value<?> val = symbolTable.get(id).getValue();
    List targetArray = (ArrayList) val.getVal();

    // TODO check size vs index
    int numberOfElements = targetArray.size();
    if (idx > numberOfElements) {
      System.out.println(symbolTable);
      throw new ArrayIndexOutOfBoundsException(
          "You tried to add a new element at position: "
              + idx
              + ", but the array '"
              + id
              + "' has only "
              + numberOfElements
              + " elements");
    }

    String elementsType = val.getOriginalType();
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

    // 3. wrap in Value
    Value<List<?>> arr = new Value<>(new ArrayList<>(size), "Array");

    Variable var = new ArrayVariable(s, arr);
    symbolTable.put(id, var);
    return null;
  }

  public Integer visitArraySize(ArabicBASICParser.ArraySizeContext ctx) {
    return Integer.valueOf(ctx.INTEGER().getText());
  }

  public Integer visitArrayIndex(ArabicBASICParser.ArrayIndexContext ctx) {
    return Integer.valueOf(ctx.INTEGER().getText());
  }
}
