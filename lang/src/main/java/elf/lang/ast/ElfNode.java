package elf.lang.ast;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Objects;
import norswap.autumn.positions.Span;
import norswap.uranium.Attribute;

public abstract class ElfNode {

    public final Span span;

    public ElfNode(Span span) {
        this.span = span;
    }

  /**
   * The size that the string returned by {@link #toString} should not exceed.
   */
  public static int TO_STRING_CUTOFF = 40;

  public final Attribute attribute(String name) {
    return new Attribute(this, name);
  }

  public abstract String contents();

  @Override
  public final String toString() {
    String clazz = getClass().getSimpleName().replace("Node", "");
    String contents = contents();
    return clazz.length() + contents.length() + 2 <= TO_STRING_CUTOFF
        ? String.format("%s(%s)", clazz, contents)
        : clazz + "(...)";
  }


  public int contentsBudget() {
    return TO_STRING_CUTOFF - getClass().getSimpleName().length() - 2;
    // 2 == "()".length() - "Node".length
  }

  private Field[] getFields() {
    return Arrays.stream(this.getClass().getFields())
        .filter(f -> Modifier.isPublic(f.getModifiers()))
        .toArray(Field[]::new);
  }

  @Override
  public int hashCode() {
    try {
      Field[] fields = getFields();
      int hash = 7;
      for (Field field : fields) {
        hash *= 31;
        Object value = field.get(this);
        if (value != null) {
          hash += value.hashCode();
        }
      }
      return hash;
    } catch (IllegalAccessException e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public boolean equals(Object obj) {
    return equals(obj, true);
  }

  public boolean equals(Object obj, boolean ignoreSpan) {
    if (obj == null) {
      return false;
    }
    if (obj.getClass() != this.getClass()) {
      return false;
    }
    try {
      Field[] fields = getFields();
      for (Field field : fields) {
        if (ignoreSpan && field.getName().equals("span")) {
          continue;
        }
        if (!Objects.equals(field.get(this), field.get(obj))) {
          return false;
        }
      }
      return true;
    } catch (IllegalAccessException e) {
      throw new RuntimeException(e);
    }
  }
}
