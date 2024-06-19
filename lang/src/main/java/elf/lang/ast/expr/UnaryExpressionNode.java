package elf.lang.ast.expr;

import elf.lang.ast.ExpressionNode;
import elf.lang.ast.operator.UnaryOperator;
import norswap.autumn.positions.Span;
import norswap.utils.Util;


public final class UnaryExpressionNode extends ExpressionNode {

  public final ExpressionNode operand;
  public final UnaryOperator operator;

  public UnaryExpressionNode(Span span, Object operand, Object operator) {
    super(span);
    this.operand = Util.cast(operand, ExpressionNode.class);
    this.operator = Util.cast(operator, UnaryOperator.class);
  }

  @Override
  public String contents() {
    String candidate = operator.getSymbol() + operand.contents();
    return candidate.length() <= contentsBudget()
        ? candidate
        : operator.getSymbol() + "(?)";
  }
}
