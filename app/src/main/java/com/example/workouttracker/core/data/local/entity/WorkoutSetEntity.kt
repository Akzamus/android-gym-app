package com.example.workouttracker.core.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.workouttracker.core.domain.model.Exercise
import com.example.workouttracker.core.domain.model.Workout

@Entity
data class WorkoutSetEntity(
    @PrimaryKey(autoGenerate = true)
    val workoutSetId:Int?= null,
    val name:String,
    val repotitions: Int,
    val exerciseId:String
)
