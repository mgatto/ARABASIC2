package com.lisantra.arabicbasic;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class VariableMetadataTest {

  @Test
  void defaultConstructor_setsGlobalLifetimeAndUnknownWriteSite() {
    Variable v =
        new Variable(
            new VariableSymbol("س", DeclarationSite.UNKNOWN), new Value(1.0, "Integer"));
    assertEquals(Lifetime.GLOBAL, v.getLifetime());
    assertTrue(v.isInitialized());
    assertTrue(v.getLastWriteSite().isUnknown());
  }

  @Test
  void sourceConstructor_requiresConcreteSite() {
    assertThrows(
        IllegalArgumentException.class,
        () ->
            new Variable(
                new VariableSymbol("س", DeclarationSite.UNKNOWN),
                new Value(1.0, "Integer"),
                DeclarationSite.UNKNOWN));
  }

  @Test
  void sourceAssignment_requiresConcreteSite() {
    Variable v =
        new Variable(
            new VariableSymbol("س", DeclarationSite.UNKNOWN), new Value(1.0, "Integer"));
    assertThrows(
        IllegalArgumentException.class,
        () -> v.assignFromSource(new Value(2.0, "Integer"), DeclarationSite.UNKNOWN));
  }

  @Test
  void syntheticAssignment_allowsUnknownSite() {
    Variable v =
        new Variable(
            new VariableSymbol("س", DeclarationSite.UNKNOWN), new Value(1.0, "Integer"));
    v.assignSynthetic(new Value(2.0, "Integer"), DeclarationSite.UNKNOWN);
    assertTrue(v.getLastWriteSite().isUnknown());
  }
}
