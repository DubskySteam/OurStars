package dev.dubsky.ourstars.android.composables.text

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import dev.dubsky.ourstars.android.ui.theme.Poppins

@Composable
fun TextCustom(text: String, color: Color, size: TextUnit, fontWeight: FontWeight? = FontWeight.Normal) {
    Text(text, fontSize = size, color = color, fontWeight = fontWeight, fontFamily = Poppins)
}