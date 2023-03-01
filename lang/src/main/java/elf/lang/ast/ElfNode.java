package elf.lang.ast;

import norswap.autumn.positions.Span;

public abstract class ElfNode {

    public final Span span;

    public ElfNode(Span span) {
        this.span = span;
    }
}
