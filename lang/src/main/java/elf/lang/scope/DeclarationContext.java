package elf.lang.scope;

import elf.lang.ast.DeclarationNode;

public final class DeclarationContext {
    private final Scope scope;
    private final DeclarationNode node;

    public DeclarationContext(Scope scope, DeclarationNode node) {
        this.scope = scope;
        this.node = node;
    }
}
