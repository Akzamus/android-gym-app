package com.example.workouttracker.core.data.local

import androidx.room.Dao
import androidx.room.Query
import com.example.workouttracker.core.data.local.entity.RoutineEntity
import com.example.workouttracker.core.data.local.entity.WorkoutEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface WorkoutDao {
    @Query("SELECT * FROM WorkoutEntity WHERE workoutId = :id")
    fun getWorkoutByID(id:String): WorkoutEntity
}