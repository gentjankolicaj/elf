package elf.lang.ast;

import norswap.autumn.positions.Span;

public abstract class StatementNode extends ElfNode {
    public StatementNode(Span span) {
        super(span);
    }
}
