package dev.dubsky.ourstars.android.composables.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.LinearProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.dubsky.ourstars.android.R
import dev.dubsky.ourstars.android.composables.text.TextBold
import dev.dubsky.ourstars.android.composables.text.TextCustom
import dev.dubsky.ourstars.android.composables.text.TextGeneral
import dev.dubsky.ourstars.android.ui.theme.*

@Composable
fun CharityCard(
    text: String,
    title: String,
    money_atm: Float,
    money_goal: Float,
) {
    Card(
        shape = RoundedCornerShape(17.dp),
        elevation = 8.dp,
        backgroundColor = Gray98,
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Row(
            Modifier
                .fillMaxWidth()
        ) {
            Image(
                painter = painterResource(R.drawable.ic_launcher_background),
                contentDescription = null,
                Modifier
                    .clip(RoundedCornerShape(17.dp))
                    .size(150.dp)
            )
            Column (
                Modifier
                    .padding(10.dp)
                    .fillMaxWidth()
                    ) {
                TextCustom(text, Gray35, 12.sp, FontWeight.Normal, modifier = Modifier)
                TextCustom(title, Primary15, 16.sp, FontWeight.Bold, modifier = Modifier)
                CharityProgress(1133, 2300)
            }
            Row(
                horizontalArrangement = Arrangement.End
            ) {
                TextCustom("Details", Primary25, 14.sp, FontWeight.Bold, modifier = Modifier.clickable {  })
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CharityCardPreview() {
    CharityCard(
        "Child Protection",
        "Improve rural schools in Genovia",
        2300.0f,
        1033.0f,
    )
}