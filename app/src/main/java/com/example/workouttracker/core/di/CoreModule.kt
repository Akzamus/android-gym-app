package com.example.workouttracker.core.di

import android.content.Context
import androidx.room.Room
import com.example.workouttracker.core.data.local.RoutineDao
import com.example.workouttracker.core.data.local.WorkoutDao
import com.example.workouttracker.core.data.local.WorkoutDatabase
import com.example.workouttracker.core.data.local.WorkoutLogDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object CoreModule {

    @Provides
    @Singleton
    fun provideWorkoutDatabase(
        @ApplicationContext context: Context,
    ): WorkoutDatabase{
        return Room.databaseBuilder(
            context,
            WorkoutDatabase::class.java,
            "workout_db"
        ).build()
    }

    @Provides
    @Singleton
    fun provideWorkoutDao(db:WorkoutDatabase):WorkoutDao{
        return db.workoutDao
    }

    @Provides
    @Singleton
    fun provideWorkoutLogDao(db:WorkoutDatabase):WorkoutLogDao{
        return db.workoutLogDao
    }

    @Provides
    @Singleton
    fun provideRoutinedao(db:WorkoutDatabase):RoutineDao{
        return db.routineDao
    }


}