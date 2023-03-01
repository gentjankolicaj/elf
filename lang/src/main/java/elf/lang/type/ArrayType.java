package elf.lang.type;

public final class ArrayType extends AbstractType {
    public static final String NAME = "array";
    public static final ArrayType INSTANCE = new ArrayType();

    private ArrayType() {
    }

    @Override
    public String name() {
        return NAME;
    }
}
