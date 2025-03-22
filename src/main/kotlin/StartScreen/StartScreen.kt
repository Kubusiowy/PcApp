package StartScreen

import Data.Screen
import Theme.AppColors
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material.ButtonDefaults

@Composable
fun StartScreen(onNavigate: (Screen) -> Unit) {
    Column(modifier = Modifier
        .fillMaxSize()
        .background(AppColors.Background),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally


    ) {


        Button(onClick = { onNavigate(Screen.DodajKonkurencje) },
            modifier = Modifier.fillMaxWidth(0.6f),
            elevation = ButtonDefaults.elevation(
                defaultElevation = 8.dp,
                pressedElevation = 2.dp,
                hoveredElevation = 6.dp,
                focusedElevation = 4.dp
            ),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = AppColors.Accent,
                contentColor = AppColors.TextPrimary
            )

        ) {
            Text("Dodaj Konkurencje",fontSize = 20.sp)
        }

        Spacer(Modifier.height(10.dp))
        Button(onClick = {onNavigate(Screen.DodajJury)  },
            modifier = Modifier.fillMaxWidth(0.6f),
            elevation = ButtonDefaults.elevation(
                defaultElevation = 8.dp,
                pressedElevation = 2.dp,
                hoveredElevation = 6.dp,
                focusedElevation = 4.dp
            ),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = AppColors.Accent,
                contentColor = AppColors.TextPrimary
            )
            ) {
            Text("Dodaj Jury",fontSize = 20.sp)
        }

        Spacer(Modifier.height(10.dp))
        Button(onClick = {onNavigate(Screen.DodajUczestnikow)  },
            modifier = Modifier
                .fillMaxWidth(0.6f),
            elevation = ButtonDefaults.elevation(
                defaultElevation = 8.dp,
                pressedElevation = 2.dp,
                hoveredElevation = 6.dp,
                focusedElevation = 4.dp
            ),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = AppColors.Accent,
                contentColor = AppColors.TextPrimary
            )
        ){
            Text("Dodaj uczestników",fontSize = 20.sp)
        }

        Spacer(Modifier.height(10.dp))
        Button(onClick = { onNavigate(Screen.WynikiCalkowite) },
            modifier = Modifier.fillMaxWidth(0.6f),
            elevation = ButtonDefaults.elevation(
                defaultElevation = 8.dp,
                pressedElevation = 2.dp,
                hoveredElevation = 6.dp,
                focusedElevation = 4.dp
            ),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = AppColors.Accent,
                contentColor = AppColors.TextPrimary
            )
            ) {
            Text("Zobacz wyniki całkowite",fontSize = 20.sp)
        }

        Spacer(Modifier.height(10.dp))
        Button(onClick = {onNavigate(Screen.WynikiCzesciowe)  },
            modifier = Modifier.fillMaxWidth(0.6f),

            elevation = ButtonDefaults.elevation(
                defaultElevation = 8.dp,
                pressedElevation = 2.dp,
                hoveredElevation = 6.dp,
                focusedElevation = 4.dp
            ),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = AppColors.Accent,
                contentColor = AppColors.TextPrimary
            )
            ) {
            Text("Zobacz wyniki częsciowe",fontSize = 20.sp)
        }




    }
}