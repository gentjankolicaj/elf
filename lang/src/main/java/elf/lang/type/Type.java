package elf.lang.type;

public abstract class Type {

    public abstract String name();

    boolean isPrimitive() {
        return true;
    }

    public boolean isReference() {
        return !isPrimitive();
    }

}
