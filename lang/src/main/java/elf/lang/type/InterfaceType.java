package elf.lang.type;

public final class InterfaceType extends AbstractType {
    public static final String NAME = "interface";
    public static final InterfaceType INSTANCE = new InterfaceType();

    private InterfaceType() {
    }

    @Override
    public String name() {
        return NAME;
    }
}
