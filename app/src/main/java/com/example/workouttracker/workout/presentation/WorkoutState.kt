package com.example.workouttracker.workout.presentation

import com.example.workouttracker.core.domain.model.Workout
import java.time.LocalDate

data class WorkoutState(
    val workout: Workout? = null,
    val today: LocalDate = LocalDate.now(),
    val weight : String = "0"

)
