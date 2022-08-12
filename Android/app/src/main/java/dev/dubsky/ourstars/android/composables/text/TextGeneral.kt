package dev.dubsky.ourstars.android.composables.text

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import dev.dubsky.ourstars.android.ui.theme.Poppins

@Composable
fun TextGeneral(text: String, color: Color) {
    Text(text, fontFamily = Poppins, color = color)
}

@Preview(showBackground = true)
@Composable
fun TextGeneralPreview() {
    TextGeneral("Donation", Color(0xFF31156B))
}