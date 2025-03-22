package AddKonkurencja

import AddKonkurencja.body.Body
import Data.Screen
import Theme.AppColors

import TopMenu
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier



@Composable
fun AddKonkurencja(onNavigate: (Screen)->Unit)
{
    Column(Modifier.fillMaxSize().background(AppColors.Background)) {

        TopMenu("Dodaj Konkurencje", onNavigate)

        Column(modifier = Modifier.fillMaxSize().weight(1f))
        {
            Body()
        }
    }
}


