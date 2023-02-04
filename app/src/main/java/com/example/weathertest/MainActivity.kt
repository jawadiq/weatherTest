package com.example.weathertest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.weathertest.ui.theme.WeatherTestTheme
import com.example.weathertest.uiElements.ConsultantCard

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WeatherTestTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Column(modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight()) {
                        ConsultantCard()
                        ConsultantCard()
                        ConsultantCard()
                        ConsultantCard()
                        ConsultantCard()
                        ConsultantCard()
                        ConsultantCard()
                        ConsultantCard()


                    }


                }

            }
        }
    }
}


@Composable
fun Greeting() {
    ConsultantCard()
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    WeatherTestTheme {
        Greeting()
    }
}