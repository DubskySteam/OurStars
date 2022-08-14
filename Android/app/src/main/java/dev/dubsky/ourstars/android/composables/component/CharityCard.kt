package dev.dubsky.ourstars.android.composables.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.dubsky.ourstars.android.R
import dev.dubsky.ourstars.android.composables.text.TextGeneral
import dev.dubsky.ourstars.android.ui.theme.Gray80
import dev.dubsky.ourstars.android.ui.theme.Gray98
import dev.dubsky.ourstars.android.ui.theme.Primary25

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
        backgroundColor = Gray98
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
            )
            Column () {
                TextGeneral(text, Primary25)
                TextGeneral(title, Primary25)
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