package com.example.workouttracker.core.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.workouttracker.core.domain.model.Workout

@Entity
data class RoutineEntity(
    @PrimaryKey(autoGenerate = false)
    val routineId:String,
    val name:String,
    val workouts:List <Workout> //Todo Relationary tables

)
