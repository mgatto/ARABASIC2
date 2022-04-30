package com.lisantra.arabicbasic;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

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

  public Void visitVariableAssignment(ArabicBASICParser.VariableAssignmentContext ctx) {
    if (showDebug) System.out.println("I visited Simple Assignment");

    String id = ctx.IDENTIFIER().getText();

    // really should be an enum?
    Symbol s = new SimpleSymbol(id);
    /* If val is another variable [A = B], then a new value is returned; is "copy by value" */
    Value<Object> val = (Value) visit(ctx.expression());
    Variable<?> var = new Variable<Object>(s, val);

    /* this covers both creation and updating */
    symbolTable.put(id, var);
    return null;
  }

  public Void visitArrayAssignment(ArabicBASICParser.ArrayAssignmentContext ctx) {
    if (showDebug) System.out.println("I visited Array Assignment");

    // get identifier
    String id = ctx.IDENTIFIER().getText(); // we don't need to create a new symbol

    // get index
    Integer idx = (Integer) visit(ctx.arraySize()); // later, visitArrayIndex()

    // get the stored Variable associated with id
    Variable<?> existingArray = symbolTable.get(id);

    // visit expression to get value to insert
    Value<Object> wrapperOfvalToInsert = (Value) visit(ctx.expression());
    Object valToInsert = wrapperOfvalToInsert.getVal(); // this should be Double or String

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
      /* add new element */
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
      targetArray.add(idx, valToInsert);
    }

    return null;
  }

  public Value<?> visitNested(ArabicBASICParser.NestedContext ctx) {
    return (Value) visit(ctx.expression());
  }

  public Value<?> visitUnary(ArabicBASICParser.UnaryContext ctx) {
    Double exprVal = 0.0;

    Value<?> expr = (Value) visit(ctx.expression());
    if ((expr.getVal() instanceof Double)) {
      exprVal = (Double) expr.getVal();
    } else {
      // TODO throw an exception
      // can only negate numbers
    }

    // TODO this may only be necessary if there is a variable in the expression
    // has to be a copy, else it mutates the original like this A = 1, X=-A
    //   actually negates A retroactively
    return new Value<Double>(-exprVal, "Double");
  }

  public Value<Double> visitAddSub(ArabicBASICParser.AddSubContext ctx) {
    // TODO ensure left is a numeric
    // TODO treat all numbers as Double in this Java code?
    Value left = (Value) visit(ctx.expression(0));
    Value right = (Value) visit(ctx.expression(1));

    // this workaround stuff feels really bunk and lame to me
    Double leftVal = 0.0;
    Double rightVal = 0.0;

    // ensure both terms are addable
    if (left.getVal() instanceof Double) {
      leftVal = (Double) left.getVal();
    } else {
      // TODO throw error (language exception)
    }

    if (right.getVal() instanceof Double) {
      rightVal = (Double) right.getVal();
    } else {
      // TODO throw error (language exception)
    }

    // TODO can use getType() if I specify the operators as terminals
    if (ctx.op.getText().equals("+")) {
      return new Value<>(leftVal + rightVal, "Double");
      // No widening: just consider every number a Double [whichever subclass of number is wider,
      // then the result should be that.]
    }
    return new Value<>(leftVal - rightVal, "Double");
  }

  public Value<?> visitMulDiv(ArabicBASICParser.MulDivContext ctx) {
    // TODO ensure left is a numeric
    // TODO treat all numbers as Double in this Java code?
    Value left = (Value) visit(ctx.expression(0));
    Value right = (Value) visit(ctx.expression(1));

    // this workaround stuff feels really bunk and lame to me
    Double leftVal = 0.0;
    Double rightVal = 0.0;

    // ensure both terms are addable
    if (left.getVal() instanceof Double) {
      leftVal = (Double) left.getVal();
    } else {
      // TODO throw error (language exception)
    }

    if (right.getVal() instanceof Double) {
      rightVal = (Double) right.getVal();
    } else {
      // TODO throw error (language exception)
    }

    // TODO can use getType() if I specify the operators as terminals
    if (ctx.op.getText().equals("*")) {
      return new Value<>(leftVal * rightVal, "Double");
      // No widening: just consider every number a Double [whichever subclass of number is wider,
      // then the result should be that.]
    }

    if (rightVal == 0) {
      // TODO throw a divide by zero error
    }
    return new Value<>(leftVal / rightVal, "Double");
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

    // 1. get identifier
    String id = ctx.IDENTIFIER().getText();
    Symbol s = new ContainerSymbol(id);

    // TODO probably should decide the type here for the Generic! Double or String
    //    No, probably not! An empty array is OK!

    // 2. get array_size
    Integer size = (Integer) visit(ctx.arraySize());
    // 3. wrap in Value
    Value<List<?>> arr = new Value<>(new ArrayList<>(size), "Array");
    // TODO set attribute for size...or just use ArrayList.size()?

    Variable<?> var = new Variable<>(s, arr);
    symbolTable.put(id, var);
    return null;
  }

  public Integer visitArraySize(ArabicBASICParser.ArraySizeContext ctx) {
    return Integer.valueOf(ctx.INTEGER().getText());
  }
}
