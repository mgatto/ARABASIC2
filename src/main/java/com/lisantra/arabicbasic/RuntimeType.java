package com.lisantra.arabicbasic;

/** Internal runtime type tag for Variable bindings. */
public enum RuntimeType {
  INT,
  REAL,
  STRING,
  ARRAY,
  STACK,
  FUNCTION,
  BOOLEAN,
  UNKNOWN;

  public static RuntimeType fromLegacyTag(String originalType) {
    if (originalType == null || originalType.isBlank()) {
      return UNKNOWN;
    }
    return switch (originalType) {
      case "Integer" -> INT;
      case "Real" -> REAL;
      case "String" -> STRING;
      case "Array" -> ARRAY;
      case "Stack" -> STACK;
      case "Function" -> FUNCTION;
      case "Boolean" -> BOOLEAN;
      default -> UNKNOWN;
    };
  }
}
