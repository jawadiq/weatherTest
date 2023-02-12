package com.example.weathertest.navigation

class Screenenums {

    enum class MyScreens{
        HomeScreen,
        DetailsScreen;
        companion object{
            fun fromRoute(route : String?):MyScreens
            = when(route?.substringBefore("/")){
                HomeScreen.name -> HomeScreen
                DetailsScreen.name -> DetailsScreen
                null-> HomeScreen
                else ->throw  IllegalArgumentException("Route $route is not")
            }
        }

    }
}