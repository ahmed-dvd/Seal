package com.privatemessenger.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

val RoyalCobalt = Color(0xFF014AAD)
val GlacierMist = Color(0xFFCBDFEE)
val SoftYellow = Color(0xFFFBEF9E)
val SteelBlue = Color(0xFF5B88B2)
val DeepNavy = Color(0xFF122C4F)
val PureBlack = Color(0xFF000000)

private val LightColorScheme = lightColorScheme(
    primary = RoyalCobalt,
    onPrimary = Color.White,
    primaryContainer = GlacierMist,
    onPrimaryContainer = DeepNavy,
    secondary = SteelBlue,
    onSecondary = Color.White,
    tertiary = SoftYellow,
    onTertiary = DeepNavy,
    background = Color(0xFFF8FBFE),
    onBackground = DeepNavy,
    surface = Color.White,
    onSurface = DeepNavy,
    surfaceVariant = GlacierMist,
    onSurfaceVariant = DeepNavy,
    outline = SteelBlue,
)

private val DarkColorScheme = darkColorScheme(
    primary = GlacierMist,
    onPrimary = DeepNavy,
    primaryContainer = RoyalCobalt,
    onPrimaryContainer = GlacierMist,
    secondary = SteelBlue,
    onSecondary = Color.White,
    tertiary = SoftYellow,
    onTertiary = DeepNavy,
    background = DeepNavy,
    onBackground = GlacierMist,
    surface = Color(0xFF0D1F38),
    onSurface = GlacierMist,
    surfaceVariant = Color(0xFF1A3355),
    onSurfaceVariant = GlacierMist,
    outline = SteelBlue,
)

@Composable
fun SealTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme
    MaterialTheme(
        colorScheme = colorScheme,
        content = content
    )
}
