package dev.dubsky.ourstars.android.screens

sealed class ScreenRoutes(val route: String) {
    object Home : ScreenRoutes("home")
    object Login : ScreenRoutes("login")
    object Signup : ScreenRoutes("signup")
    object Daily : ScreenRoutes("daily")
    object Profile : ScreenRoutes("profile")
    object Settings : ScreenRoutes("settings")
}
