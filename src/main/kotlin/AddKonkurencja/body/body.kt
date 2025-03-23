package AddKonkurencja.body

import Data.CustomToast
import Data.Konkurencja
import Theme.AppColors
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import javax.naming.Context

@Preview
@Composable
fun Body()
{

    val listaKonkurencji = remember { mutableStateListOf<Konkurencja>() }

    var nazwa by remember { mutableStateOf("") }
    var opis by remember { mutableStateOf("") }
    var pokazAlert by remember { mutableStateOf(true) }


    Surface(color = AppColors.Surface,
        modifier = Modifier
            .padding(16.dp)
            .fillMaxSize()
            .clip(RoundedCornerShape(16.dp))

    ) {
        Row(modifier = Modifier.fillMaxSize())
        {
            Column(modifier = Modifier.fillMaxSize().weight(0.7f).background(AppColors.Surface)) {
                Text(
                    text = "Dodaj Konkurencje",
                    color = AppColors.TextPrimary,
                    fontSize = 18.sp,
                    modifier = Modifier.padding(16.dp)
                )
                Column(modifier = Modifier.padding(16.dp)) {
                    TextField(value = nazwa, onValueChange = { nazwa = it }, label = { Text("Nazwa konkurencji") })
                    TextField(value = opis, onValueChange = { opis = it }, label = { Text("Opis") })
                    Button(
                        onClick = {
                            if (nazwa.isNotEmpty() && opis.isNotEmpty()) {
                                var newKonkurencja = Konkurencja(nazwa, opis)
                                listaKonkurencji.add(newKonkurencja)
                            }

                        },
                        modifier = Modifier.padding(top = 8.dp)
                    ) {
                        Text("Dodaj Konkurencje")
                    }


                    Divider(modifier = Modifier.padding(vertical = 8.dp))

                }

            }
            Column(modifier = Modifier.fillMaxSize().weight(0.3f)) {
                LazyColumn(modifier = Modifier.fillMaxSize().padding(16.dp)) {
                    items(listaKonkurencji) { item ->
                        Surface(
                            shape = RoundedCornerShape(12.dp),
                            color = AppColors.Surface,
                            elevation = 6.dp,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 6.dp)
                        ) {
                            Column(modifier = Modifier.padding(12.dp)) {
                                Text(
                                    text = "🏁 ${item.nazwa}",
                                    fontSize = 18.sp,
                                    color = AppColors.Accent
                                )
                                Spacer(modifier = Modifier.height(4.dp))
                                Text(
                                    text = item.opis,
                                    fontSize = 14.sp,
                                    color = AppColors.TextSecondary
                                )
                            }

                        }
                    }
                }
            }

        }
    }
}