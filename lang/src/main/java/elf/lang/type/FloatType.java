package elf.lang.type;

public final class FloatType extends Type {
    public static final FloatType INSTANCE = new FloatType();

    private FloatType() {
    }

    @Override
    public String name() {
        return "float";
    }
}
