package elf.lang.ast.operator;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum AssignmentOperator {
  ASSIGN("="),
  ADD_ASSIGN("+="),
  SUBTRACT_ASSIGN("-="),
  MULTIPLY_ASSIGN("*="),
  DIVIDE_ASSIGN("/="),
  REMAINDER_ASSIGN("%="),
  AND_ASSIGN("&="),
  OR_ASSIGN("|="),
  POW_ASSIGN("^=");

  private String symbol;
}
