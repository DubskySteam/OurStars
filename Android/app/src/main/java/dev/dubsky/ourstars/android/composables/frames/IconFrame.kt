package dev.dubsky.ourstars.android.composables.frames

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.dubsky.ourstars.android.ui.theme.Primary25

@Composable
fun IconFrame(
    size: Int,
    icon: ImageVector
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .size(size.dp)
            .background(Primary25,RoundedCornerShape(17.dp))
            .clip(RoundedCornerShape(17.dp))
    ) {
        Icon(icon, null, tint = Color.White)
    }
}

@Preview(showBackground = true)
@Composable
fun IconFramePreview() {
    IconFrame(48, Icons.Filled.Settings)
}