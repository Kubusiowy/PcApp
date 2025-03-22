package AddKonkurencja

import Data.Screen
import Theme.backgroundColor
import TopMenu
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier



@Composable
fun AddKonkurencja(onNavigate: (Screen)->Unit)
{
    Column(Modifier.fillMaxSize().background(backgroundColor)) {

        TopMenu("Dodaj Konkurencje", onNavigate)

        Column(modifier = Modifier.fillMaxSize().weight(1f))
        {

        }
    }
}