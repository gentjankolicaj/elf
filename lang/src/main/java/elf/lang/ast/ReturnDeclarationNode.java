package elf.lang.ast;


import norswap.autumn.positions.Span;

public class ReturnDeclarationNode extends DeclarationNode {

  public ReturnDeclarationNode(Span span) {
    super(span);
  }

  @Override
  public String name() {
    return null;
  }

  @Override
  public String declaredThing() {
    return null;
  }

  @Override
  public String contents() {
    return null;
  }
}
