package WynikiCalkowite

import Data.Screen
import Theme.AppColors
import TopMenu
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier



@Composable
fun WynikiCalkowite(onNavigate: (Screen)->Unit)
{
    Column(Modifier.fillMaxSize().background(AppColors.Background)) {

        TopMenu("Wyniki Całkowite", onNavigate)

        Column(modifier = Modifier.fillMaxSize().weight(1f))
        {

        }
    }
}