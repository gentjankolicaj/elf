package elf.lang.type;

public final class Int8Type extends AbstractType {
    public static final String NAME = "int8";
    public static final Int8Type INSTANCE = new Int8Type();

    private Int8Type() {
    }

    @Override
    public String name() {
        return NAME;
    }
}
