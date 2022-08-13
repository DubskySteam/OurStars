package dev.dubsky.ourstars.android.screens.open

import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import dev.dubsky.ourstars.android.composables.textfield.TextFieldDefault
import dev.dubsky.ourstars.android.composables.buttons.FullWidth
import dev.dubsky.ourstars.android.composables.text.TextGeneral
import dev.dubsky.ourstars.android.screens.ScreenRoutes
import dev.dubsky.ourstars.android.ui.theme.Poppins
import dev.dubsky.ourstars.android.ui.theme.Primary15
import dev.dubsky.ourstars.android.ui.theme.Primary25

@Composable
fun LoginScreen(
    navController: NavController
) {

    val emailState = remember { mutableStateOf(TextFieldValue())}
    val passwordState = remember { mutableStateOf(TextFieldValue())}

    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth(0.9f),
            verticalArrangement = Arrangement.spacedBy(6.dp)
        ) {
            Text(
                "Log in",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = Poppins,
                color = Primary15,
                modifier = Modifier.absolutePadding(0.dp, 0.dp, 0.dp, 20.dp)
            )
            TextGeneral("Email address", Primary25)
            TextFieldDefault(emailState, Icons.Filled.Email)
            TextGeneral("Password", Primary25)
            TextFieldDefault(passwordState, Icons.Filled.Lock)
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(10.dp),
                modifier = Modifier.absolutePadding(0.dp, 35.dp, 0.dp, 0.dp)
            ) {
                FullWidth("Login", 14.sp) { }
                Text("Don't have an account? Sign up")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LoginScreenPreview() {
    LoginScreen(rememberNavController())
}