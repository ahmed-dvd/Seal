# Threat Model

## Assets
- Message plaintext
- Long-term identity private keys
- Session keys / ratchet state
- Authentication tokens
- User social graph (friends)

## Adversaries

### A. Malicious / compromised server
**Can**: observe accounts, friend graph, message timing/size, IPs, online status.  
**Cannot**: read message plaintext or private keys (if protocol is implemented correctly).

### B. Network attacker
Protected by TLS 1.3 + E2EE. Can still observe traffic patterns.

### C. Stolen locked phone
Protected by Android Keystore + encrypted DB + screen lock. Strength depends on device security (StrongBox preferred).

### D. Rooted / compromised Android
App-level protections largely ineffective. Out of scope.

### E. Malicious user
Spam, enumeration, flooding → mitigated by rate limits and authz checks.

### F. Database leak
Yields public keys, usernames, ciphertext, metadata. No plaintext messages.

## Explicit Non-Goals (v1)
- Perfect metadata protection / sealed sender
- Multi-device sync
- Group chats
- Disappearing messages
- Post-quantum (can be added later via PQXDH)
