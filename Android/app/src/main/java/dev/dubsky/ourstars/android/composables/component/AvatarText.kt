package dev.dubsky.ourstars.android.composables.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.dubsky.ourstars.android.composables.text.TextBold
import dev.dubsky.ourstars.android.ui.theme.Primary15

@Composable
fun AvatarText(text: String, img: ImageVector) {
    Row(
        horizontalArrangement = Arrangement
            .spacedBy(10.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        TextBold(text, Primary15)
        Image(
            img,
            contentDescription = null,
            modifier = Modifier
                .clip(CircleShape)
                .size(44.dp)
                .border(shape = CircleShape, width = 0.5.dp, color = Color.Black)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun AvartarTextPreview() {
    AvatarText("Jane Doe", Icons.Filled.Person)
}