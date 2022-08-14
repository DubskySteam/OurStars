package dev.dubsky.ourstars.android.screens

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import dev.dubsky.ourstars.android.screens.open.*

@Composable
fun SetupNavGraph(
    navController : NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = ScreenRoutes.Home.route
        ) {
        composable(
            route = ScreenRoutes.Home.route
        ) {
            HomeScreen(navController)
        }
        composable(
            route = ScreenRoutes.Login.route
        ) {
            LoginScreen(navController)
        }
        composable(
            route = ScreenRoutes.Signup.route
        ) {
            SignupScreen(navController)
        }
        composable(
            route = ScreenRoutes.Daily.route
        ) {
            DailyDonationScreen(navController)
        }
        composable(
            route = ScreenRoutes.Charities.route
        ) {
            CharitiesScreen(navController)
        }
    }
}