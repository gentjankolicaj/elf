package elf.lang.type;

public final class ShortType extends Type {
    public static final ShortType INSTANCE = new ShortType();

    private ShortType() {
    }

    @Override
    public String name() {
        return "short";
    }
}
