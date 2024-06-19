package elf.lang.ast.decl;

import elf.lang.ast.DeclarationNode;
import elf.lang.ast.ExpressionNode;
import elf.lang.ast.TypeNode;
import norswap.autumn.positions.Span;
import norswap.utils.Util;

public class VarDeclarationNode extends DeclarationNode {

  private final TypeNode type;
  private final String name;
  private final ExpressionNode expressionNode;

  public VarDeclarationNode(Span span, TypeNode type, String name, ExpressionNode expressionNode) {
    super(span);
    this.type = Util.cast(type, TypeNode.class);
    this.name = name;
    this.expressionNode = Util.cast(expressionNode, ExpressionNode.class);
  }

  @Override
  public String name() {
    return name;
  }

  @Override
  public String contents() {
    return "var " + name;
  }

  @Override
  public String declaredThing() {
    return "variable";
  }
}
