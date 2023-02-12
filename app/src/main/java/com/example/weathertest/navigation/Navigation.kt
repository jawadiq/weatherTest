package com.example.weathertest.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.weathertest.screens.DetailProfileScreen
import com.example.weathertest.screens.MainScreenContent

@Composable
fun ScreenNavigation(){
    val navController = rememberNavController()
NavHost(navController = navController, startDestination = Screenenums.MyScreens.HomeScreen.name ){
    composable(Screenenums.MyScreens.HomeScreen.name){
MainScreenContent(navController = navController)
    }
    composable(Screenenums.MyScreens.DetailsScreen.name){
        DetailProfileScreen()
    }
}



}