package dev.dubsky.ourstars.android.composables.textfield

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.dubsky.ourstars.android.ui.theme.Gray80
import dev.dubsky.ourstars.android.ui.theme.Primary25
import dev.dubsky.ourstars.android.ui.theme.White98

@Composable
fun TextFieldDefault(state: MutableState<TextFieldValue>, trail: ImageVector) {
    OutlinedTextField(
        value = state.value,
        onValueChange = { state.value = it },
        singleLine = true,
        shape = RoundedCornerShape(17.dp),
        trailingIcon = { Icon(trail, "", tint = Primary25) },
        colors = TextFieldDefaults.textFieldColors(backgroundColor = White98, cursorColor = Primary25, textColor = Primary25),
        modifier = Modifier
            .fillMaxWidth()
            .border(border = BorderStroke(0.5.dp, Gray80), shape = RoundedCornerShape(17.dp))
            .height(47.dp)
    )
}

@Preview(showBackground = true, backgroundColor = 0xFFFFF)
@Composable
fun TextFieldDefaultPreview() {
    val testState = remember { mutableStateOf(TextFieldValue()) }
    TextFieldDefault(testState, Icons.Filled.Email)
}