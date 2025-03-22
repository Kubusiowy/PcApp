import AddJury.AddJury
import AddKonkurencja.AddKonkurencja
import AddUczestnicy.AddUczestnicy
import Data.Screen
import StartScreen.StartScreen
import Theme.topbackgroundColor
import WynikiCalkowite.WynikiCalkowite
import WynikiCzesciowe.WynikiCzesciowe
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.onClick
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

@Composable
fun TopMenu(navName:String,OnNavigateUp:(Screen)->Unit)
{
    Box(Modifier.fillMaxWidth().background(topbackgroundColor)) {
    IconButton(onClick = {OnNavigateUp(Screen.Start)}) {
        Icon(
            tint = Color.White,
            imageVector = Icons.Filled.ArrowBack,
            contentDescription = "wstecz",
            modifier = Modifier
                .align(Alignment.CenterStart)

        )
    }
        Text(text = "${navName}",fontSize = 20.sp,color = Color.White
            , modifier = Modifier.align(Alignment.CenterEnd).padding(end = 20.dp) )
    }
}