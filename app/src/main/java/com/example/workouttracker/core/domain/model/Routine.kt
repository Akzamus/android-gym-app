package com.example.workouttracker.core.domain.model

data class Routine(
    val id:String,
    val name:String,
    val workouts: List<Workout>,
)


