# Keep libsignal and crypto-related classes (will be refined later)
# -keep class org.signal.** { *; }
# -keep class org.whispersystems.** { *; }

# Do not strip useful crash info in early stages
-keepattributes SourceFile,LineNumberTable
