package dev.dubsky.ourstars.android.composables.component

import android.graphics.Paint.Align
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.dubsky.ourstars.android.R

@Composable
fun DailyStars() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(R.drawable.star_big),
            contentDescription = "",
            alignment = Alignment.Center,
            modifier = Modifier
                .absoluteOffset(10.dp, 0.dp)
        )
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(R.drawable.star_small),
                contentDescription = "",
                modifier = Modifier.rotate(340f)
            )
            Image(
                painter = painterResource(R.drawable.star_small),
                contentDescription = "",
                modifier = Modifier
                    .absoluteOffset(20.dp, 68.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DailyStarsPreview() {
    DailyStars()
}