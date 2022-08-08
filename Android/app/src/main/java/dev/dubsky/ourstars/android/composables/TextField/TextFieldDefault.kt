package dev.dubsky.ourstars.android.composables.TextField

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.dubsky.ourstars.android.ui.theme.Primary25
import dev.dubsky.ourstars.android.ui.theme.White98
import java.lang.reflect.Modifier

@Composable
fun TextFieldDefault(state: MutableState<TextFieldValue>, trail: ImageVector) {
    TextField(
        value = state.value,
        onValueChange = { state.value = it },
        singleLine = true,
        shape = RoundedCornerShape(13.dp),
        trailingIcon = { Icon(trail, "", tint = Primary25) },
        colors = TextFieldDefaults.textFieldColors(backgroundColor = White98, cursorColor = Primary25, textColor = Primary25)
    )
}

@Preview(showBackground = true)
@Composable
fun TextFieldDefaultPreview() {
    val testState = remember { mutableStateOf(TextFieldValue()) }
    TextFieldDefault(testState, Icons.Filled.Email)
}