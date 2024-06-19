package elf.lang.ast.decl;

import elf.lang.ast.BlockNode;
import elf.lang.ast.DeclarationNode;
import elf.lang.ast.ParameterNode;
import elf.lang.ast.ReturnDeclarationNode;
import java.util.List;
import norswap.autumn.positions.Span;
import norswap.utils.Util;

public class FuncDeclarationNode extends DeclarationNode {

  private final String name;
  private final List<ParameterNode> parameters;
  private final ReturnDeclarationNode returnExpression;
  private final BlockNode block;

  public FuncDeclarationNode(Span span, String name, List<ParameterNode> parameters,
      ReturnDeclarationNode returnExpression, BlockNode block) {
    super(span);
    this.name = Util.cast(name, String.class);
    this.parameters = Util.cast(parameters, List.class);
    this.returnExpression = Util.cast(returnExpression, ReturnDeclarationNode.class);
    this.block = Util.cast(block, BlockNode.class);
  }

  @Override
  public String name() {
    return name;
  }

  @Override
  public String contents() {
    return "fun " + name;
  }

  @Override
  public String declaredThing() {
    return "function";
  }
}
