package com.lisantra.arabicbasic;

/**
 * Interpreter/runtime failure with an optional source position for CLI and teaching output.
 */
public class ArabicBasicRuntimeException extends RuntimeException {

  private final DeclarationSite site;

  public ArabicBasicRuntimeException(String message, DeclarationSite site) {
    super(message);
    this.site = site != null ? site : DeclarationSite.UNKNOWN;
  }

  public ArabicBasicRuntimeException(String message, DeclarationSite site, Throwable cause) {
    super(message, cause);
    this.site = site != null ? site : DeclarationSite.UNKNOWN;
  }

  public DeclarationSite getDeclarationSite() {
    return site;
  }
}
