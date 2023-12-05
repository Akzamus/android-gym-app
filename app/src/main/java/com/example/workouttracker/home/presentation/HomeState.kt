package com.example.workouttracker.home.presentation

import com.example.workouttracker.core.domain.model.Exercise
import com.example.workouttracker.core.domain.model.Workout
import com.example.workouttracker.core.domain.model.WorkoutSet

data class HomeState(
    val workouts:List <Workout>
)
val fakeWorkout = Workout(
    "3x times Workout",
    exercise = listOf(
        Exercise(
            "BenchPress",
            listOf(
                WorkoutSet(
                    weight = 30.0,
                    5,
                ),
                WorkoutSet(
                    weight = 26.25,
                    6,
                ),WorkoutSet(
                    weight = 22.25,
                    6,
                ),
            ),
        ),
    ),
)
