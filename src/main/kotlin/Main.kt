import AddJury.AddJury
import AddKonkurencja.AddKonkurencja
import AddUczestnicy.AddUczestnicy
import Data.Screen
import StartScreen.StartScreen
import WynikiCalkowite.WynikiCalkowite
import WynikiCzesciowe.WynikiCzesciowe
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
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
import androidx.compose.ui.window.rememberWindowState


fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Punktator",
        resizable = true,
        state = rememberWindowState(
            width = 1200.dp,
            height = 700.dp
        ))
        {
            Navigation()
        }

}


@Composable
fun Navigation()
{
    var currentScreen by remember {mutableStateOf(Screen.Start) }

    when(currentScreen) {
        Screen.Start -> { StartScreen(onNavigate =  { currentScreen = it})}
        Screen.DodajJury -> AddJury(onNavigate = { currentScreen = it})
        Screen.DodajKonkurencje -> AddKonkurencja(onNavigate = { currentScreen = it})
        Screen.DodajUczestnikow -> AddUczestnicy(onNavigate = { currentScreen = it})
        Screen.WynikiCalkowite -> WynikiCalkowite(onNavigate = { currentScreen = it})
        Screen.WynikiCzesciowe -> WynikiCzesciowe(onNavigate = { currentScreen = it})

    }
}
