package com.lisantra.arabicbasic;

import picocli.CommandLine;

/**
 * Supplies {@code --version} from the JAR {@code Implementation-Version} manifest entry (set by
 * Maven). When running from the IDE or plain {@code .class} files, that entry is absent and a
 * fallback string is used.
 */
public final class ManifestVersionProvider implements CommandLine.IVersionProvider {

  @Override
  public String[] getVersion() {
    Package pkg = ManifestVersionProvider.class.getPackage();
    String v = pkg != null ? pkg.getImplementationVersion() : null;
    if (v == null || v.isEmpty()) {
      v = "development";
    }
    return new String[] {v};
  }
}
