package com.example.workouttracker.navigation

sealed class NavigationRoute (val route:String){

    object Home : NavigationRoute("home")
    object Workout: NavigationRoute("workout")
}