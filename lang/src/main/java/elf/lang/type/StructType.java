package elf.lang.type;

public final class StructType extends AbstractType {
    public static final String NAME = "struct";
    public static final StructType INSTANCE = new StructType();

    private StructType() {
    }

    @Override
    public String name() {
        return NAME;
    }
}
