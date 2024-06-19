package elf.lang.ast;

import norswap.autumn.positions.Span;

public class SimpleTypeNode extends TypeNode {

  private final String name;

  public SimpleTypeNode(Span span, String name) {
    super(span);
    this.name = name;
  }
}
