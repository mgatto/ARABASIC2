package com.lisantra.arabicbasic;

public class CustomListener extends ArabicBASICBaseListener {

  @Override
  public void enterProgram(ArabicBASICParser.ProgramContext ctx) {
    System.out.println("I entered the start rule");
  }

  @Override
  public void enterAssignment(ArabicBASICParser.AssignmentContext ctx) {
    System.out.println("I entered the assignment rule");
    //    System.out.println(ctx.Assignment_Operator().getSymbol());
    System.out.println(ctx.Identifier().getText());
    ArabicBASICParser.VariableContext variableType = ctx.variable();
    //    if (variableType.)
    // TODO how to know which rule was set??
    System.out.println(Integer.valueOf(ctx.variable().getText()));
  }
}
