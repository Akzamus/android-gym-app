package com.example.workouttracker.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.workouttracker.home.presentation.HomeScreen
import com.example.workouttracker.workout.presentation.WorkoutScreen

@Composable
fun NavigationHost(
    navHostController: NavHostController
){
    NavHost(navController = navHostController, startDestination = NavigationRoute.Home.route ){
        composable(NavigationRoute.Home.route){
            HomeScreen({
                navHostController.navigate(NavigationRoute.Workout.route  + "?workoutId=$it")
        },
            )
        }
        composable(
            NavigationRoute.Workout.route + "?workoutId=(workoutId)",
            arguments = listOf(
                navArgument("workoutId"){
                    type = NavType.StringType
                    nullable = true
                    defaultValue = true
                }
            )
        ){
            WorkoutScreen()
        }
    }
}