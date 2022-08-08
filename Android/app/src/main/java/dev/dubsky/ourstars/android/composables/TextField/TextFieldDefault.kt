package dev.dubsky.ourstars.android.composables.TextField

import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun TextFieldDefault(state: MutableState<TextFieldValue>) {
    TextField(value = state.value, onValueChange = { state.value = it })
}

@Preview(showBackground = true)
@Composable
fun TextFieldDefaultPreview() {
    TextFieldDefault()
}