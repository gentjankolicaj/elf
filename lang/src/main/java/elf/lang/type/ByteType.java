package elf.lang.type;

public final class ByteType extends Type {
    public static final ByteType INSTANCE = new ByteType();

    private ByteType() {
    }

    @Override
    public String name() {
        return "byte";
    }
}
