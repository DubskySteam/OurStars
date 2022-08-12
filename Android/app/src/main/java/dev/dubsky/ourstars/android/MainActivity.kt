package dev.dubsky.ourstars.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import dev.dubsky.ourstars.android.screens.SetupNavGraph
import dev.dubsky.ourstars.android.screens.open.DailyDonationScreen
import dev.dubsky.ourstars.android.screens.open.HomeScreen
import dev.dubsky.ourstars.android.ui.theme.AndroidTheme

class MainActivity : ComponentActivity() {

    lateinit var navController : NavHostController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            navController = rememberNavController()
            SetupNavGraph(navController)

        }
    }
}