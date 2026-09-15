package main

import (
        "fmt"
        "log"
        "net/http"
)

func main() {
        // Stage 3 will implement real auth, DB, WebSockets, etc.
        // This is only a skeleton so the project compiles.

        mux := http.NewServeMux()
        mux.HandleFunc("/health", func(w http.ResponseWriter, r *http.Request) {
                w.WriteHeader(http.StatusOK)
                fmt.Fprintln(w, `{"status":"ok"}`)
        })

        addr := ":8080"
        log.Printf("private-messenger server (skeleton) listening on %s", addr)
        if err := http.ListenAndServe(addr, mux); err != nil {
                log.Fatal(err)
        }
}
