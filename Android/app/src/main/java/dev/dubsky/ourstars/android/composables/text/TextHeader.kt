package dev.dubsky.ourstars.android.composables.text

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import dev.dubsky.ourstars.android.ui.theme.Poppins

@Composable
fun TextHeader(text: String, color: Color) {
    Text(text, fontFamily = Poppins, color = color, fontSize = 24.sp)
}

@Preview(showBackground = true)
@Composable
fun TextHeaderPreview() {
    TextHeader("Donation", Color(0xFF31156B))
}