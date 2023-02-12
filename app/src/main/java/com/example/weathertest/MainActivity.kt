package com.example.weathertest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.weathertest.navigation.ScreenNavigation
import com.example.weathertest.ui.theme.WeatherTestTheme
import com.example.weathertest.uiElements.ConsultantCard
import com.example.weathertest.uiElements.ManagerVieww

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WeatherTestTheme {
                ScreenNavigation()
            }
        }
    }

}


//@Preview(showBackground = true)
//@Composable
//fun DefaultPreview() {
//    WeatherTestTheme {
//        Greeting()
//    }
//}