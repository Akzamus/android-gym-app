package com.example.workouttracker.workout.presentation

interface WorkoutEvent {
    data class ChangeWeight(val weight:String) : WorkoutEvent
}