package elf.lang.ast.expr;

import elf.lang.ast.ExpressionNode;
import elf.lang.ast.operator.AssignmentOperator;
import norswap.autumn.positions.Span;
import norswap.utils.Util;

public final class AssignmentExpressionNode extends ExpressionNode {

  private final ExpressionNode left;
  private final ExpressionNode right;
  private final AssignmentOperator operator;

  public AssignmentExpressionNode(Span span, Object left, Object right, Object operator) {
    super(span);
    this.left = Util.cast(left, ExpressionNode.class);
    this.right = Util.cast(right, ExpressionNode.class);
    this.operator = Util.cast(operator, AssignmentOperator.class);
  }

  @Override
  public String contents() {
    String candidate = String.format("%s %s %s",
        left.contents(), operator.getSymbol(), right.contents());

    return candidate.length() <= contentsBudget()
        ? candidate
        : String.format("(?) %s (?)", operator.getSymbol());
  }
}
