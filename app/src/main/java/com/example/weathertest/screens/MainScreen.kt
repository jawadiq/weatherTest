package com.example.weathertest.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.weathertest.uiElements.ConsultantCard
import com.example.weathertest.uiElements.ManagerVieww

@Composable
fun MainScreenContent(navController: NavController){
    val brush = Brush.linearGradient(
        listOf(
            Color(0xFF9E82F0),
            Color(0xFF42A5F5)
        )
    )
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .padding(1.dp)
        ,
        color = Color(0xFF89C9F8)


    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
        ) {
            Row(modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                ) {

                ManagerVieww()

            }
            ConsultantCard(navController)
            ConsultantCard(navController)
            ConsultantCard(navController)
            ConsultantCard(navController)
            ConsultantCard(navController)
            ConsultantCard(navController)
        }
    }
}



