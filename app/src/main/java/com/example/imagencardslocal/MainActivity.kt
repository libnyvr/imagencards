package com.example.imagencardslocal

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.imagencardslocal.ui.theme.ImagencardslocalTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ImagencardslocalTheme {
                Surface {
                    Modifier.fillMaxSize()
                    MaterialTheme.colorScheme.background
                    ImageCard()
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ImageCard() {
    Column(
        Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        ElevatedCard(
            colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.surfaceVariant
            ),
            modifier = Modifier
                .size(width = 600.dp, height = 400.dp)
        ) {
            Text(
                text = "Card 1",
                modifier = Modifier
                    .padding(16.dp),
                textAlign = TextAlign.Center
            )
            Text(
                text = "Card 1",
                modifier = Modifier
                    .padding(16.dp),
                textAlign = TextAlign.Center
            )

            Image(
                painter = painterResource(id = (R.drawable.xa)),
                contentDescription = "xa",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp),
                contentScale = ContentScale.Crop
            )
        }

        ElevatedCard(
            colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.surfaceVariant
            ),
            modifier = Modifier
                .size(width = 600.dp, height = 400.dp)
        ) {
            Text(
                text = "Card 2",
                modifier = Modifier
                    .padding(16.dp),
                textAlign = TextAlign.Center
            )
            Text(
                text = "Card 2",
                modifier = Modifier
                    .padding(16.dp),
                textAlign = TextAlign.Center
            )

            Image(
                painter = painterResource(id = (R.drawable.xa)),
                contentDescription = "xa",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp),
                contentScale = ContentScale.Crop
            )
        }
    }
}
