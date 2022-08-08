package dev.dubsky.ourstars.android.screens.open

import android.graphics.Paint.Align
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.dubsky.ourstars.android.composables.TextField.TextFieldDefault
import dev.dubsky.ourstars.android.composables.buttons.FullWidth

@Composable
fun LoginScreen() {

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
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Text("Log in", fontSize = 24.sp, fontWeight = FontWeight.Bold)
            Text("Email address")
            TextFieldDefault(emailState)
            Text("Password")
            TextFieldDefault(passwordState)
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                FullWidth("Login", 14.sp)
                Text("Don't have an account? Sign up")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LoginScreenPreview() {
    LoginScreen()
}