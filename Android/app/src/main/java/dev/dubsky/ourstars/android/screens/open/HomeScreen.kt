package dev.dubsky.ourstars.android.screens.open

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import dev.dubsky.ourstars.android.composables.buttons.FullWidth
import dev.dubsky.ourstars.android.screens.ScreenRoutes

@Composable
fun HomeScreen(
    navController: NavController
) {
    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(10.dp),
            modifier = Modifier
                .fillMaxWidth(0.9f)
        ) {
            FullWidth("Log in", 13.sp) { navController.navigate(ScreenRoutes.Login.route) }
            FullWidth("Sign up", 13.sp) { navController.navigate(ScreenRoutes.Signup.route) }
            FullWidth("Daily Donation", 13.sp) { navController.navigate(ScreenRoutes.Daily.route) }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen(rememberNavController())
}