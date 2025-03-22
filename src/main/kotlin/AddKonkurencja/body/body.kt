package AddKonkurencja.body

import Theme.AppColors
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun Body()
{

    Surface(color = AppColors.Surface,
        modifier = Modifier
            .padding(16.dp)
            .fillMaxSize()
            .clip(RoundedCornerShape(16.dp))

    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Text("To jest zaokrąglona kolumna!", color = AppColors.TextPrimary)
        }
    }
}