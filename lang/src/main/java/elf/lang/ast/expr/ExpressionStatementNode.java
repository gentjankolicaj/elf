package elf.lang.ast.expr;

import elf.lang.ast.ExpressionNode;
import norswap.autumn.positions.Span;
import norswap.utils.Util;

public class ExpressionStatementNode extends ExpressionNode {

  public final ExpressionNode expression;

  public ExpressionStatementNode(Span span, Object expression) {
    super(span);
    this.expression = Util.cast(expression, ExpressionNode.class);
  }

  @Override
  public String contents() {
    return expression.contents();
  }
}
