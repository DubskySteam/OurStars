package dev.dubsky.ourstars.android.composables.textfield

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.dubsky.ourstars.android.composables.frames.IconFrame
import dev.dubsky.ourstars.android.ui.theme.Gray80
import dev.dubsky.ourstars.android.ui.theme.Primary25
import dev.dubsky.ourstars.android.ui.theme.White98

@Composable
fun SearchBar(state: MutableState<TextFieldValue>, trail: ImageVector) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
    ) {
        OutlinedTextField(
            value = state.value,
            onValueChange = { state.value = it },
            singleLine = true,
            shape = RoundedCornerShape(17.dp),
            trailingIcon = { Icon(trail, "", tint = Primary25) },
            colors = TextFieldDefaults.textFieldColors(
                backgroundColor = White98,
                cursorColor = Primary25,
                textColor = Primary25
            ),
            modifier = Modifier
                .fillMaxWidth(0.8f)
                .border(border = BorderStroke(0.5.dp, Gray80), shape = RoundedCornerShape(17.dp))
                .height(47.dp)
        )
        IconFrame(50)
    }
}

@Preview(showBackground = true, backgroundColor = 0xFFFFF)
@Composable
fun SearchBarPreview() {
    val testState = remember { mutableStateOf(TextFieldValue()) }
    SearchBar(testState, Icons.Filled.Email)
}