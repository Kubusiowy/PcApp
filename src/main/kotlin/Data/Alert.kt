package Data

import Theme.AppColors
import Theme.AppColors.Surface
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun CustomToast(tekst: String, pokaz: Boolean) {
    if (pokaz) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            contentAlignment = Alignment.BottomCenter
        ) {
            Surface(
                shape = RoundedCornerShape(12.dp),
                color = AppColors.Surface,
                elevation = 10.dp
            ) {
                Text(
                    text = tekst,
                    modifier = Modifier.padding(12.dp),
                    color = AppColors.TextPrimary
                )
            }
        }
    }
}