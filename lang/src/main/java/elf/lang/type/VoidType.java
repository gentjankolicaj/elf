package elf.lang.type;

public final class VoidType extends AbstractType {
    public static final String NAME = "void";
    public static final VoidType INSTANCE = new VoidType();

    private VoidType() {
    }

    @Override
    public String name() {
        return NAME;
    }
}
