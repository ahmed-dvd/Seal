# API Draft (v0 – subject to change)

Base URL: `https://your-server.example/v1`

All authenticated endpoints require:
`Authorization: Bearer <access_token>`

## Health
`GET /health` → `{ "status": "ok" }`

## Registration / Auth (Stage 3)
- `POST /register`
- `POST /login`
- `POST /token/refresh`
- `POST /logout`
- `POST /devices/revoke`

## Profile
- `GET /me`
- `PUT /profile` (username, later avatar)

## Friends (Stage 5)
- `POST /friends/request`
- `POST /friends/accept`
- `POST /friends/reject`
- `DELETE /friends/{userId}`
- `POST /blocks`
- `GET /friends`
- `GET /friend-requests`

## Keys (Stage 6)
- `PUT /keys/prekeys`
- `GET /keys/{userId}` (authorized only)

## Messages (Stage 6+)
- `POST /messages` (encrypted envelope)
- WebSocket `/ws` for realtime delivery + acks

Authorization is checked on **every** resource. Never trust client-supplied IDs for permission decisions.
