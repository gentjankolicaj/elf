package elf.lang.scope;

import elf.lang.ast.DeclarationNode;
import elf.lang.ast.ElfNode;

import java.util.HashMap;
import java.util.Map;

public class Scope {

    public final Scope parent;
    public final ElfNode node;

    private final Map<String, DeclarationNode> declarations = new HashMap<>();


    public Scope(ElfNode node, Scope parent) {
        this.node = node;
        this.parent = parent;
    }

    public void declare(String identifier, DeclarationNode node) {
        declarations.put(identifier, node);
    }

    public DeclarationContext lookup(String name) {
        DeclarationNode node = declarations.get(name);
        return node != null ? new DeclarationContext(this, node) : parent != null ? parent.lookup(name) : null;
    }

    public DeclarationNode lookupLocal(String name) {
        return declarations.get(name);
    }

    @Override
    public String toString() {
        return "Scope " + declarations;
    }
}
