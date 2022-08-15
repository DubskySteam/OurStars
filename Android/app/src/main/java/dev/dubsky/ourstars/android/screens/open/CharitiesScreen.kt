package dev.dubsky.ourstars.android.screens.open

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import dev.dubsky.ourstars.android.composables.component.AvatarTextRow
import dev.dubsky.ourstars.android.composables.component.CharityCard
import dev.dubsky.ourstars.android.composables.text.TextCustom
import dev.dubsky.ourstars.android.ui.theme.Primary25

@Composable
fun CharitiesScreen(
    navController: NavController
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        Column (
            Modifier
                .fillMaxWidth(0.9f)
                .fillMaxHeight()
                ) {
            AvatarTextRow("Jane Doe", Icons.Filled.Person)
            Column(
                verticalArrangement = Arrangement.spacedBy(20.dp)
            ) {
                CharityCard(
                    "Child Protection",
                    "Improve rural schools in Genovia",
                    2300.0f,
                    1033.0f,
                )
                CharityCard(
                    "Child Protection",
                    "Improve rural schools in Genovia",
                    2300.0f,
                    1033.0f,
                )
                CharityCard(
                    "Child Protection",
                    "Improve rural schools in Genovia",
                    2300.0f,
                    1033.0f,
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CharitiesScreenPreview() {
    CharitiesScreen(rememberNavController())
}