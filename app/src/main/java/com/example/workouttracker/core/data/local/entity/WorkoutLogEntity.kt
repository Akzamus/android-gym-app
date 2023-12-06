package com.example.workouttracker.core.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.workouttracker.core.domain.model.Exercise
import com.example.workouttracker.core.domain.model.Workout

@Entity
data class WorkoutLogEntity(
    @PrimaryKey(autoGenerate = false)
    val workoutLogId:String,
    val name:String,
    val date: Long,
    val workout:Workout, //Todo Relationary tables

)
