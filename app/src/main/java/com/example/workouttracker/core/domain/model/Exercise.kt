package com.example.workouttracker.core.domain.model

data class Exercise(
    val id:String,
    val name:String,
    val sets:List<WorkoutSet>


)
