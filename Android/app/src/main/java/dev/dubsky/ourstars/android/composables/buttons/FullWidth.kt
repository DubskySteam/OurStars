package dev.dubsky.ourstars.android.composables.buttons

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.dubsky.ourstars.android.ui.theme.Poppins
import dev.dubsky.ourstars.android.ui.theme.Primary25
import dev.dubsky.ourstars.android.ui.theme.White98

@Composable
fun FullWidth(text: String, fontSize: TextUnit) {
    Button(
        onClick = {},
        colors = ButtonDefaults.buttonColors(backgroundColor = Primary25, contentColor = White98),
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(17.dp))
            .height(48.dp)
    ) {
        Text(text, fontSize = fontSize, fontFamily = Poppins, fontWeight = FontWeight.Bold)
        Icon(Icons.Filled.PlayArrow, contentDescription = null)
    }
}

@Preview(showBackground = true)
@Composable
fun FullWidthPreview() {
    FullWidth("Donation", 14.sp)
}