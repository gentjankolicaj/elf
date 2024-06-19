package elf.lang.ast;

import norswap.autumn.positions.Span;

public abstract class ExpressionNode extends ElfNode {
    public ExpressionNode(Span span) {
        super(span);
    }
}
