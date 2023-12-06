package com.example.workouttracker.core.domain.model

import java.time.LocalDate

data class WorkoutLog(
    val id:String,
    val bodyWeight:Double,
    val date : Long,
    val workout:Workout,
    val exercises: List<Exercise>
)

