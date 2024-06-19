package elf.lang.type;

public final class Float32Type extends AbstractType {
    public static final String NAME = "float32";
    public static final Float32Type INSTANCE = new Float32Type();

    private Float32Type() {
    }

    @Override
    public String name() {
        return NAME;
    }
}
