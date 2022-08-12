package dev.dubsky.ourstars.android.composables.text

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import dev.dubsky.ourstars.android.ui.theme.Poppins

@Composable
fun TextBold(text: String, color: Color) {
    Text(text, fontFamily = Poppins, color = color, fontWeight = FontWeight.Bold)
}

@Preview(showBackground = true)
@Composable
fun TextBoldPreview() {
    TextBold("Donation", Color(0xFF31156B))
}