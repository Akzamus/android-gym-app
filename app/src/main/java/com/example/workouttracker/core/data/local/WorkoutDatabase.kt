package com.example.workouttracker.core.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.workouttracker.core.data.local.entity.RoutineEntity
import com.example.workouttracker.core.data.local.entity.WorkoutEntity
import com.example.workouttracker.core.data.local.entity.WorkoutLogEntity
import com.example.workouttracker.core.domain.model.WorkoutLog

@Database(
    entities = [RoutineEntity::class, WorkoutEntity::class, WorkoutLogEntity::class],
    version = 1,
)
abstract  class WorkoutDatabase: RoomDatabase() {
    abstract val routineDao: RoutineDao
    abstract val workoutDao: WorkoutDao
    abstract val workoutLogDao: WorkoutLogDao

}