# Development Roadmap

Work in strict stages. Each stage must be functional and reviewed before the next.

1. **Design** (done) – Threat model, architecture, crypto choice, schemas
2. **Skeleton** (current) – Repo structure, basic Android + Go projects
3. **Backend auth** – Registration, login, device tokens, rate limiting
4. **Android identity** – Key generation, Keystore, encrypted local DB
5. **Friend system** – Requests, accept/reject, QR identity exchange
6. **Encrypted 1:1 messaging** – libsignal sessions, send/receive ciphertext
7. **Realtime delivery** – Authenticated WebSockets + offline queue
8. **Local encrypted storage** – Full SQLCipher integration + Keystore wrapping
9. **Identity verification** – Safety numbers / QR verification + key change warnings
10. **Security testing** – Authz, crypto edge cases, IDOR, replay, etc.
11. **UI polish**
12. **Release APK** – Signing, update strategy, distribution notes

Never silently weaken security for convenience.
