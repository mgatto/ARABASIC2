package com.lisantra.arabicbasic;

import java.util.Map;

public class CustomVisitor extends ArabicBASICBaseVisitor<Object> {
  private final Map<String, Object> symbolTable;
  private final boolean showDebug;

  public CustomVisitor(Map<String, Object> symbolTable, boolean showDebug) {
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
    Object val = visit(ctx.expression());
    // If val is another variable, the value is returned == copy by value

    /* this covers both creation and updating */
    symbolTable.put(id, val);
    //    if (!symbolTable.containsKey(id)) {}

    if (showDebug) System.out.println(symbolTable);

    return val;
  }

  public Integer visitAddsub(ArabicBASICParser.AddsubContext ctx) {
    // TODO ensure left is an int | Integer
    Object left = visit(ctx.expression(0));
    Object right = visit(ctx.expression(1));

    // TODO ensure left is an int | Integer
    if (!(left instanceof Integer && right instanceof Integer)) {
      // TODO throw language exception
    }

    // TODO the casting seems amateurish?
    if (ctx.op.getText().equals("+")) {
      // TODO can use getType() if I specify the operators as terminals
      return (Integer) left + (Integer) right;
    }
    return (Integer) left - (Integer) right;
  }

  // eventually, return the Value class from the Symbol table?
  public Object visitName(ArabicBASICParser.NameContext ctx) {
    if (showDebug) System.out.println("I visited Identifier");

    String id = ctx.IDENTIFIER().getText();

    /* return the value associated with the var name */
    if (symbolTable.containsKey(id)) {
      // TODO what to return? It could be int, float or string or array?
      return symbolTable.get(id);
    } else {
      // TODO provoke an error?
    }

    return new Object(); // TODO this seems bunk
  }

  public Integer visitNumber(ArabicBASICParser.NumberContext ctx) {
    return Integer.valueOf(ctx.INTEGER().getText());
  }
}
