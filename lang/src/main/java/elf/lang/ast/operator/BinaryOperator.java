package elf.lang.ast.operator;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum BinaryOperator {
  ADD("+"),
  SUBTRACT("-"),
  MULTIPLY("*"),
  DIVIDE("/"),
  REMAINDER("%"),
  EQUALITY("=="),
  NOT_EQUALITY("!="),
  GREATER(">"),
  SMALLER("<"),
  GREATER_EQUAL(">="),
  SMALLER_EQUAL("<="),
  AND("&"),
  AND_CONDITIONAL("&&"),
  OR("|"),
  OR_CONDITIONAL("||");

  private String symbol;
}
