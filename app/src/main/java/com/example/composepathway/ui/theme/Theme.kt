package com.example.composepathway.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorPalette = darkColors(
    primary = Navy,
    onPrimary = Chartreuse,
    primaryVariant = Purple700,
    secondary = Teal200,
    background = Color.Black,
    surface = Blue,
    onSurface = Navy,
)

private val LightColorPalette = lightColors(
    primary = LightBlue,
    onPrimary = Navy,
    primaryVariant = Purple700,
    secondary = Teal200,
    background = Color.White,
    surface = Blue,
    onSurface = Color.White,
)

@Composable
fun ComposePathwayTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}