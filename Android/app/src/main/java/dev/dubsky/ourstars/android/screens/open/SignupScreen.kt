package dev.dubsky.ourstars.android.screens.open

import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Refresh
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
import dev.dubsky.ourstars.android.composables.TextField.TextFieldDefault
import dev.dubsky.ourstars.android.composables.buttons.FullWidth

@Composable
fun SignupScreen() {

    val emailState = remember { mutableStateOf(TextFieldValue()) }
    val usernameState = remember { mutableStateOf(TextFieldValue()) }
    val passwordState = remember { mutableStateOf(TextFieldValue()) }
    val passwordrepeatState = remember { mutableStateOf(TextFieldValue()) }
    val anonState = remember { mutableStateOf(TextFieldValue()) }

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
                "Sign up",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.absolutePadding(0.dp, 0.dp, 0.dp, 35.dp)
            )
            Text("Email address")
            TextFieldDefault(emailState, Icons.Filled.Email)
            Text("Username")
            TextFieldDefault(usernameState, Icons.Filled.Person)
            Text("Password")
            TextFieldDefault(passwordState, Icons.Filled.Lock)
            Text("Repeat password")
            TextFieldDefault(passwordrepeatState, Icons.Filled.Refresh)
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(10.dp),
                modifier = Modifier.absolutePadding(0.dp, 35.dp, 0.dp, 0.dp)
            ) {
                FullWidth("Sign up", 14.sp)
                Text("Already have an account? Log in")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SignupPreview() {
    SignupScreen()
}