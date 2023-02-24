package elf.lang.type;

public final class BoolType extends Type {

    public static final BoolType INSTANCE = new BoolType();

    private BoolType() {
    }

    @Override
    public String name() {
        return "bool";
    }
}
