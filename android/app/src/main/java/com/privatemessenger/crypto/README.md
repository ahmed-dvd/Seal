# Crypto package

This package will contain thin, carefully reviewed wrappers around libsignal.

**Rules**
- Never implement custom cryptographic algorithms.
- Use only established, reviewed libraries (libsignal).
- Private keys must stay in Android Keystore where possible.
- No logging of keys, session state, or plaintext.
