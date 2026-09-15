package com.privatemessenger

import android.app.Application

/**
 * Application entry point.
 *
 * Later stages will initialize:
 * - SQLCipher / encrypted Room database
 * - Keystore-backed identity keys
 * - libsignal stores
 */
class PrivateMessengerApp : Application() {
    override fun onCreate() {
        super.onCreate()
        // System.loadLibrary("sqlcipher") will be added when SQLCipher is integrated
    }
}
