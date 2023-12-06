package com.example.workouttracker.core.data.local

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Transaction
import com.example.workouttracker.core.data.local.entity.RoutineEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface RoutineDao {
    @Transaction
    @Query("SELECT * FROM RoutineEntity")
    fun getAllEntity(): Flow <List<RoutineEntity>>
}