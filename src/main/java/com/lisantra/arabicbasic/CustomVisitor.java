package com.lisantra.arabicbasic;

import java.util.Map;

public class CustomVisitor extends ArabicBASICBaseVisitor<Object> {
  private final Map<String, Value<?>> symbolTable;
  private final boolean showDebug;

  public CustomVisitor(Map<String, Value<?>> symbolTable, boolean showDebug) {
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

  public Object visitAssignment(ArabicBASICParser.AssignmentContext ctx) {
    if (showDebug) System.out.println("I visited Assignment");

    String id = ctx.IDENTIFIER().getText();
    Value<?> val = (Value) visit(ctx.expression());
    // If val is another variable, the value is returned == copy by value

    /* this covers both creation and updating */
    symbolTable.put(id, val);
    if (showDebug) System.out.println(symbolTable);

    return val;
  }

  public Value<?> visitNested(ArabicBASICParser.NestedContext ctx) {
    return (Value) visit(ctx.expression());

    //    return visitChildren(ctx);
  }

  public Value<?> visitUnary(ArabicBASICParser.UnaryContext ctx) {
    Double exprVal = 0.0;
    Value<?> expr = (Value) visit(ctx.expression());
    if ((expr.getVal() instanceof Double)) {
      exprVal = (Double) expr.getVal();
    } else {
      // TODO throw an exception
    }

    // TODO this may only be necessary if there is a variable in the expression
    Value<Double> newExpr = new Value<Double>(-exprVal, "Double");
    // has to be a copy, else it mutates the original like this A = 1, X=-A
    // actually negates A retroactively
    return newExpr;
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
      // TODO provoke an error
    }

    // The symbol table's value is of custom type Value
    return symbolTable.get(id);
  }

  public Value<Double> visitNumber(ArabicBASICParser.NumberContext ctx) {
    // TODO it could be either an Integer or Float; all get treated as Double anyways, but
    // let's track the original type

    return new Value<>(Double.valueOf(ctx.INTEGER().getText()), "Double");
  }

  public Value<String> visitText(ArabicBASICParser.TextContext ctx) {
    return new Value<>(ctx.STRING().getText(), "String");
  }
}
