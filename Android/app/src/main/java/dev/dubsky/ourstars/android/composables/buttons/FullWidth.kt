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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.dubsky.ourstars.android.ui.theme.Primary25
import dev.dubsky.ourstars.android.ui.theme.White98

@Composable
fun FullWidth(text: String, fontSize: TextUnit) {
    Button(
        onClick = {},
        colors = ButtonDefaults.buttonColors(backgroundColor = White98, contentColor = Primary25),
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(13.dp))
            .height(48.dp)
    ) {
        Text(text, fontSize = fontSize)
        Icon(Icons.Filled.PlayArrow, contentDescription = null)
    }
}

@Preview(showBackground = true)
@Composable
fun FullWidthPreview() {
    FullWidth("Donation", 12.sp)
}