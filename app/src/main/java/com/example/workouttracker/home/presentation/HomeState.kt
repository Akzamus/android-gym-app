package com.example.workouttracker.home.presentation


import com.example.workouttracker.core.domain.model.Exercise
import com.example.workouttracker.core.domain.model.Routine
import com.example.workouttracker.core.domain.model.Workout
import com.example.workouttracker.core.domain.model.WorkoutSet
import java.util.UUID

data class HomeState(
    val routines: List<Routine>
)

val fakeRoutine = Routine(
    id = UUID.randomUUID().toString(),
    name = "3x Workout",
    workouts = listOf(
        Workout(
    id = UUID.randomUUID().toString(),
    name = "Workout A",
    exercise = listOf(
        Exercise(
            id = UUID.randomUUID().toString(),
            "BenchPress",
            listOf(
                WorkoutSet(
                    weight = 30.0,
                    5,
                ),
                WorkoutSet(
                    weight = 26.25,
                    6,
                ),
                WorkoutSet(
                    weight = 22.25,
                    6,
                ),

            ),
        ),
    ),

),
        Workout(
    id = UUID.randomUUID().toString(),
    name = "Workout B",
    exercise = listOf(
        Exercise(
            id = UUID.randomUUID().toString(),
            "Squats",
            listOf(
                WorkoutSet(
                    weight = 30.0,
                    5,
                ),
                WorkoutSet(
                    weight = 26.25,
                    6,
                ),
                WorkoutSet(
                    weight = 22.25,
                    6,
                ),

            ),
        ),
    ),
)

        )
)

//val fakeWorkout = Workout(
//    id = UUID.randomUUID().toString(),
//    name = "3x  Workout",
//    exercise = listOf(
//        Exercise(
//            "BenchPress",
//            listOf(
//                WorkoutSet(
//                    weight = 30.0,
//                    5,
//                ),
//                WorkoutSet(
//                    weight = 26.25,
//                    6,
//                ),
//                WorkoutSet(
//                    weight = 22.25,
//                    6,
//                ),
//
//            ),
//        ),
//    ),
//)
