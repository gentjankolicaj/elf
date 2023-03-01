package elf.lang.type;

public abstract class AbstractType {

    public abstract String name();

    boolean isPrimitive() {
        return true;
    }

    public boolean isReference() {
        return !isPrimitive();
    }

}
