package elf.lang.type;

public final class NullType extends AbstractType {
    public static final String NAME = "null";
    public static final NullType INSTANCE = new NullType();

    private NullType() {
    }


    @Override
    public String name() {
        return NAME;
    }
}
