package com.example.workouttracker.core.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.workouttracker.core.domain.model.Exercise
import com.example.workouttracker.core.domain.model.Workout

@Entity
data class WorkoutEntity(
    @PrimaryKey(autoGenerate = false)
    val workoutId:String,
    val name:String,
    val routineId:String
//    val exercises:List <Exercise> //Todo Relationary tables

)
