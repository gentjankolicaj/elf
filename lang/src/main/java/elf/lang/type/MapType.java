package elf.lang.type;

public final class MapType extends AbstractType {
    public static final String NAME = "map";
    private static final MapType INSTANCE = new MapType();

    private MapType() {
    }

    @Override
    public String name() {
        return NAME;
    }
}
