package com.example.workouttracker.core.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.workouttracker.core.domain.model.Exercise
import com.example.workouttracker.core.domain.model.Workout

@Entity
data class ExerciseEntity(
    @PrimaryKey(autoGenerate = false)
    val exerciseId:String,
    val name:String,
    val workoutId:String
//    val exercises:List <WorkoutSetEntity> //Todo Relationary tables

)
