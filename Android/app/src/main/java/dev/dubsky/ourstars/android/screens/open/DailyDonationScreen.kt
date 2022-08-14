package dev.dubsky.ourstars.android.screens.open

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Scaffold
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import dev.dubsky.ourstars.android.R
import dev.dubsky.ourstars.android.composables.component.AvatarTextRow
import dev.dubsky.ourstars.android.composables.component.DailyStars
import dev.dubsky.ourstars.android.composables.text.TextCustom
import dev.dubsky.ourstars.android.composables.text.TextGeneral
import dev.dubsky.ourstars.android.composables.text.TextHeader
import dev.dubsky.ourstars.android.ui.theme.*

@Composable
fun DailyDonationScreen(
    navController: NavController
) {
    Scaffold(
        modifier = Modifier
            .fillMaxSize(),
        drawerBackgroundColor = Primary40T,
        backgroundColor = Primary25,
        drawerContent = {
            Box(
                modifier = Modifier
                    .fillMaxSize(),
                contentAlignment = Alignment.Center,
            ) {
                Column(
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .fillMaxWidth(0.9f)
                ) {
                    TextHeader("Daily donation", White98)
                    TextGeneral("1. You can perform daily donation once a day", White98)
                    TextGeneral("2. Select one of the featured daily donations - stars", White98)
                    TextGeneral("3. Donate to selected star - fundraiser", White98)
                    TextGeneral("4. Receive a collectible token", White98)
                }
            }
        }
    ) {
        Image(
            painter = painterResource(R.drawable.daily_bg),
            contentDescription = "",
            modifier = Modifier
                .fillMaxSize(),
            alignment = Alignment.Center,
            contentScale = ContentScale.FillWidth
        )
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .fillMaxSize()
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth(0.9f)
                    .fillMaxHeight(),
            ) {
                AvatarTextRow(
                    "Jane Doe",
                    Icons.Filled.Person
                )
                Column(
                    modifier = Modifier
                        .padding(vertical = 30.dp)
                ) {
                    TextCustom("Daily donation", Primary15, 20.sp, modifier = Modifier)
                    TextGeneral("Select your star", Primary40)
                }
                Row(
                    horizontalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    DailyStars()
                }
            }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun DailyDonationScreenPreview() {
    DailyDonationScreen(rememberNavController())
}