package elf.lang.type;

public final class LongType extends Type {

    public static final LongType INSTANCE = new LongType();

    private LongType() {
    }

    @Override
    public String name() {
        return "long";
    }
}
