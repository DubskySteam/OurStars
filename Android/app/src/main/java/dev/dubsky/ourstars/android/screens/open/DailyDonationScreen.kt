package dev.dubsky.ourstars.android.screens.open

import android.graphics.Matrix.ScaleToFit
import android.widget.ImageView.ScaleType
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.graphics.scaleMatrix
import dev.dubsky.ourstars.android.composables.text.TextGeneral
import dev.dubsky.ourstars.android.composables.text.TextHeader
import dev.dubsky.ourstars.android.R
import dev.dubsky.ourstars.android.ui.theme.*

@Composable
fun DailyDonationScreen() {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
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
            modifier = Modifier.fillMaxSize()
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxWidth(0.9f)
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painterResource(R.drawable.logo),
                        contentDescription = null
                        )
                }
                Image(
                    painter = painterResource(R.drawable.star_big),
                    contentDescription = "",
                    alignment = Alignment.Center
                )
                Row(

                ) {
                    Image(
                        painter = painterResource(R.drawable.star_small),
                        contentDescription = "",
                        alignment = Alignment.Center,
                        contentScale = ContentScale.Inside,
                        modifier = Modifier.rotate(250f)
                    )
                    Image(
                        painter = painterResource(R.drawable.star_small),
                        contentDescription = "",
                        alignment = Alignment.Center,
                        contentScale = ContentScale.Inside
                    )
                }
            }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun DailyDonationScreenPreview() {
    DailyDonationScreen()
}