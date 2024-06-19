package elf.lang.type;

public final class Int32Type extends AbstractType {
    public static final String NAME = "int32";
    public static final Int32Type INSTANCE = new Int32Type();

    private Int32Type() {
    }

    @Override
    public String name() {
        return NAME;
    }
}
