package AddKonkurencja

import Data.Screen
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier



@Composable
fun AddKonkurencja(onNavigate: (Screen)->Unit)
{
    Column(modifier = Modifier
        .fillMaxSize()
        ,horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Add Konkurencja")
    }
}