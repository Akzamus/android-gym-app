package com.example.workouttracker.core.data.local

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.workouttracker.core.data.local.entity.RoutineEntity
import com.example.workouttracker.core.data.local.entity.WorkoutEntity
import com.example.workouttracker.core.data.local.entity.WorkoutLogEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface WorkoutLogDao {
    @Query("SELECT * FROM WorkoutLogEntity WHERE workoutLogId = :id")
    fun getWorkoutLogByID(id:String): WorkoutLogEntity

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun createWorkoutLogById(workoutLogEntity :WorkoutLogEntity)


    @Delete
    suspend fun deleteWorkoutLogById(workoutLogEntity :WorkoutLogEntity)
}