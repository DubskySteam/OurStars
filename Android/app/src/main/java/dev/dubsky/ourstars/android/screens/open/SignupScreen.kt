package dev.dubsky.ourstars.android.screens.open

import androidx.compose.foundation.layout.*
import androidx.compose.material.Checkbox
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
import dev.dubsky.ourstars.android.ui.theme.Poppins
import dev.dubsky.ourstars.android.ui.theme.Primary15
import dev.dubsky.ourstars.android.ui.theme.Primary25

@Composable
fun SignupScreen() {

    val emailState = remember { mutableStateOf(TextFieldValue()) }
    val usernameState = remember { mutableStateOf(TextFieldValue()) }
    val passwordState = remember { mutableStateOf(TextFieldValue()) }
    val passwordrepeatState = remember { mutableStateOf(TextFieldValue()) }
    val anonState = remember { mutableStateOf(false) }

    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth(0.9f),
            verticalArrangement = Arrangement.spacedBy(28.dp)
        ) {
            Text(
                "Sign up",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = Poppins,
                color = Primary15,
                modifier = Modifier.absolutePadding(0.dp, 0.dp, 0.dp, 20.dp)
            )
            Column() {
                Text("Email address", fontFamily = Poppins, color = Primary15)
                TextFieldDefault(emailState, Icons.Filled.Email)
            }
            Column() {
                Text("Username", fontFamily = Poppins, color = Primary15)
                TextFieldDefault(usernameState, Icons.Filled.Person)
            }
            Column() {
                Text("Password", fontFamily = Poppins, color = Primary15)
                TextFieldDefault(passwordState, Icons.Filled.Lock)
            }
            Column() {
                Text("Repeat password", fontFamily = Poppins, color = Primary15)
                TextFieldDefault(passwordrepeatState, Icons.Filled.Refresh)
                Row (
                    horizontalArrangement = Arrangement.spacedBy(12.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .absolutePadding(0.dp, 16.dp, 0.dp, 0.dp)
                ) {
                    Checkbox(
                        checked = anonState.value,
                        onCheckedChange = { anonState.value = it }
                    )
                    Text("Appear anonymous", fontFamily = Poppins, color = Primary15, fontSize = 12.sp)
                }
            }
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(10.dp),
                modifier = Modifier.absolutePadding(0.dp, 35.dp, 0.dp, 0.dp)
            ) {
                FullWidth("Sign up", 14.sp)
                Text("Already have an account? Log in", fontFamily = Poppins, color = Primary15)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SignupPreview() {
    SignupScreen()
}