package com.example.workouttracker.home.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun HomeScreen(
    onWorkoutClick : (String) -> Unit,
    viewModel: HomeViewModel = hiltViewModel(),

){
    val state = viewModel.state
    LazyColumn(modifier = Modifier.fillMaxSize()){
        items(state.workouts){
            TextButton(onClick = { onWorkoutClick(it.dfid) }) {
                Text(text = it.name)
                
            }
        }

    }

}