package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.Column
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.layout.ContentScale


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            GreetingImage(
                message = "Happy Birthday Sam!",
            ) {
                    GreetingText(message = "2º Novotec Desenvolvimento de Sistemas AMS!")
                }
            }
        }
    }
}
@Composable
fun GreetingText(message: String, from: String, modifier: Modifier = Modifier) {
    Column {(
        verticalArrangement = Arrangement.Center,
        modifier = modifier.padding(8.dp)
    )
        Text(
            text = message,
            fontSize = 100.sp,
            lineHeight = 116.sp
            textAlign = TextAlign.Center
        )
    }
}
@Preview(showBackground = true)
@Composable
fun MyApplicationPreview() {
    MyApplicationTheme {
         GreetingText(message = "2º Novotec Desenvolvimento de Sistemas AMS!")
    }
}
@Composable
fun GreetingImage(message: String, from: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.tecnologia)
    Box(modifier) {
        Image(
           painter = image,
           contentDescription = null,
           contentScale = ContentScale.Crop
           alpha = 0.5F
        )
        GreetingText(
            message = message,
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)
        )
    }
}
