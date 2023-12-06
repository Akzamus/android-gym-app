package com.example.workouttracker.core.domain.model

data class Workout(
    val id:String,
    val name:String,
    val exercise: List<Exercise>
)


