package elf.lang.type;

public final class DoubleType extends Type {
    public static final DoubleType INSTANCE = new DoubleType();

    private DoubleType() {
    }

    @Override
    public String name() {
        return "double";
    }
}
