package elf.lang.type;

public final class CharType extends Type {
    public static final CharType INSTANCE = new CharType();

    private CharType() {
    }

    @Override
    public String name() {
        return "char";
    }
}
