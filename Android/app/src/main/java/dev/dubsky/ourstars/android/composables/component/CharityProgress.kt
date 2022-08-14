package dev.dubsky.ourstars.android.composables.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.LinearProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.dubsky.ourstars.android.composables.text.TextCustom
import dev.dubsky.ourstars.android.ui.theme.Gray35
import dev.dubsky.ourstars.android.ui.theme.Primary25

@Composable
fun CharityProgress(p_current: Int, p_goal: Int) {
    Column (
        modifier = Modifier
            .fillMaxWidth()
            ) {
        TextCustom("$p_current€ out of $p_goal€", Gray35, 12.sp, FontWeight.Normal, modifier = Modifier)
        LinearProgressIndicator(
            color = Primary25,
            progress = ((p_goal.toFloat()/p_current.toFloat()) * 100),
            modifier = Modifier
                .clip(RoundedCornerShape(17.dp))
                .height(10.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun CharityProgressPreview() {
    CharityProgress(1133, 2300)
}