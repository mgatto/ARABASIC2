package com.lisantra.arabicbasic;

/** Variable lifetime classification for interpreter scope management. */
public enum Lifetime {
  GLOBAL,
  PARAMETER,
  LOCAL,
  TEMP
}
