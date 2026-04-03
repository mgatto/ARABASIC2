package com.lisantra.arabicbasic;

import java.util.Objects;

/** */
public class Variable {
  /** */
  private final Symbol symbol;

  /** */
  private Value value;

  /** Current runtime type tag; this may change when the variable is reassigned. */
  private RuntimeType runtimeType;

  /** Classification for future scope/call-frame behavior. */
  private final Lifetime lifetime;

  /** Whether this binding has been assigned a value at least once. */
  private boolean initialized;

  /** Most recent assignment site; may be {@link DeclarationSite#UNKNOWN} for synthetic writes. */
  private DeclarationSite lastWriteSite;

  /**
   * @param symbol
   * @param value
   */
  public Variable(Symbol symbol, Value value) {
    this(symbol, value, Lifetime.GLOBAL, DeclarationSite.UNKNOWN);
  }

  /**
   * Source-driven construction; requires a concrete write site.
   */
  public Variable(Symbol symbol, Value value, DeclarationSite sourceWriteSite) {
    this(symbol, value, Lifetime.GLOBAL, requireConcreteSite(sourceWriteSite));
  }

  /**
   * @param lifetime defaults to {@link Lifetime#GLOBAL} in current interpreter creation paths.
   * @param writeSite source site for source-driven writes, or {@link DeclarationSite#UNKNOWN} for
   *     explicit synthetic/system writes.
   */
  public Variable(Symbol symbol, Value value, Lifetime lifetime, DeclarationSite writeSite) {
    this.symbol = Objects.requireNonNull(symbol, "symbol");
    this.value = Objects.requireNonNull(value, "value");
    this.runtimeType = this.value.getRuntimeType();
    this.lifetime = Objects.requireNonNull(lifetime, "lifetime");
    this.lastWriteSite = Objects.requireNonNull(writeSite, "writeSite");
    this.initialized = true;
  }

  /**
   * @return
   */
  public Symbol getSymbol() {
    return symbol;
  }

  /**
   * @return
   */
  public Value getValue() {
    return value;
  }

  public Lifetime getLifetime() {
    return lifetime;
  }

  public RuntimeType getRuntimeType() {
    return runtimeType;
  }

  public boolean isInitialized() {
    return initialized;
  }

  public DeclarationSite getLastWriteSite() {
    return lastWriteSite;
  }

  /** Source-driven assignment path; requires a concrete (non-UNKNOWN) site. */
  public void assignFromSource(Value value, DeclarationSite sourceWriteSite) {
    this.value = Objects.requireNonNull(value, "value");
    this.runtimeType = this.value.getRuntimeType();
    this.lastWriteSite = requireConcreteSite(sourceWriteSite);
    this.initialized = true;
  }

  /** Synthetic/system assignment path; may use {@link DeclarationSite#UNKNOWN}. */
  public void assignSynthetic(Value value, DeclarationSite syntheticWriteSite) {
    this.value = Objects.requireNonNull(value, "value");
    this.runtimeType = this.value.getRuntimeType();
    this.lastWriteSite = Objects.requireNonNull(syntheticWriteSite, "syntheticWriteSite");
    this.initialized = true;
  }

  /** Source-driven write marker when underlying value mutates in place. */
  public void markWriteFromSource(DeclarationSite sourceWriteSite) {
    this.lastWriteSite = requireConcreteSite(sourceWriteSite);
    this.initialized = true;
  }

  /**
   * @param value
   */
  public void setValue(Value value) {
    // Compatibility path for older call sites.
    assignSynthetic(value, DeclarationSite.UNKNOWN);
  }

  /**
   * @return
   */
  @Override
  public String toString() {
    return value.toString();
  }

  private static DeclarationSite requireConcreteSite(DeclarationSite site) {
    DeclarationSite resolved = Objects.requireNonNull(site, "site");
    if (resolved.isUnknown()) {
      throw new IllegalArgumentException("sourceWriteSite must be concrete (not UNKNOWN)");
    }
    return resolved;
  }
}
