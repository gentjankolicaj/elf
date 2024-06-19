package elf.lang.ast.operator;


import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum UnaryOperator {
  NOT("!"), PLUS("+"), MINUS("-"), INCREMENT("++"), DECREMENT("--");
  private String symbol;

}
