package elf.lang.ast;

import norswap.autumn.positions.Span;

public abstract class DeclarationNode extends StatementNode {
    public DeclarationNode(Span span) {
        super(span);
    }
}
