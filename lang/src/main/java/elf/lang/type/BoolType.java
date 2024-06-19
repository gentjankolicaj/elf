package elf.lang.type;

public final class BoolType extends AbstractType {
    public static final String NAME = "bool";
    public static final BoolType INSTANCE = new BoolType();

    private BoolType() {
    }

    @Override
    public String name() {
        return NAME;
    }
}
