package elf.lang.type;

public final class Int16Type extends AbstractType {
    public static final String NAME = "int16";
    public static final Int16Type INSTANCE = new Int16Type();

    private Int16Type() {
    }

    @Override
    public String name() {
        return NAME;
    }
}
