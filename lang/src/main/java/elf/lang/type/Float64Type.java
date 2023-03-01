package elf.lang.type;

public final class Float64Type extends AbstractType {
    public static final String NAME = "float64";
    public static final Float64Type INSTANCE = new Float64Type();

    private Float64Type() {
    }

    @Override
    public String name() {
        return NAME;
    }
}
