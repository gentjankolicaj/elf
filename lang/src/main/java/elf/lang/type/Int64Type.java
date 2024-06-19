package elf.lang.type;

public final class Int64Type extends AbstractType {
    public static final String NAME = "int34";
    public static final Int64Type INSTANCE = new Int64Type();

    private Int64Type() {
    }

    @Override
    public String name() {
        return NAME;
    }
}
