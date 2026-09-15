# Seal

Private end-to-end encrypted Android messenger.  
No phone numbers • No tracking • No ads • Signal Protocol • APK only

**Status**: Stage 2 – Project skeleton. Crypto and networking not yet implemented.

## Brand

- **Name**: Seal
- **Primary colors**:
  - Royal Cobalt `#014AAD`
  - Glacier Mist `#CBDFEE`
- **Extended palette** (for gradients & UI):
  - Soft Yellow `#FBEF9E`
  - Steel Blue `#5B88B2`
  - Deep Navy `#122C4F`
  - Black `#000000`

Logo (vector): `docs/logo.svg` and `android/app/src/main/res/drawable/ic_logo_seal.xml`

## Design Principles

- Genuine end-to-end encryption (Signal Protocol via libsignal)
- Server is intentionally "dumb" – only relays ciphertext
- No phone numbers, contact uploads, ads, analytics, or tracking
- Minimal metadata
- Android Keystore + SQLCipher for local security
- Distributed directly as APK

## Building the APK (GitHub Actions – no Android Studio needed)

1. Create a new GitHub repository
2. Push this project to the `main` branch
3. Go to **Actions** → **Build APK** → **Run workflow**
4. Download the artifact `private-messenger-debug`

## Project Structure

```
private-messenger/
├── android/          # Kotlin + Jetpack Compose app
├── server/           # Go backend (skeleton)
├── docs/             # Threat model, roadmap, logo
└── .github/workflows # APK build workflow
```

## Security Notes

- Never commit secrets, keystores, or `.env` files
- This is **not** production-ready yet
- See `docs/THREAT_MODEL.md` and `docs/ROADMAP.md`

## License

AGPL-3.0 (required by libsignal once integrated).
