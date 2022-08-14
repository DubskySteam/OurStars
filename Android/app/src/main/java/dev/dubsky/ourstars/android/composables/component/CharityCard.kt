package dev.dubsky.ourstars.android.composables.component

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import dev.dubsky.ourstars.android.R

@Composable
fun CharityCard(
    text: String,
    title: String,
    money_atm: Float,
    money_goal: Float,
    img: Unit,
) {
}

@Preview(showBackground = true)
@Composable
fun CharityCardPreview() {
    CharityCard(
        "Child Protection",
        "Improve rural schools in Genovia",
        2300.0f,
        1033.0f,
        Image(painter = painterResource(R.drawable.logo), contentDescription = null)
    )
}