package com.example.workouttracker.workout.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType

@Composable
fun WorkoutScreen(viewModel: WorkoutViewModel = hiltViewModel()){

    val state = viewModel.state
    Column(modifier = Modifier.fillMaxSize()){
        TextField(value = state.weight.toString(), onValueChange = {
            viewModel.onEvent(WorkoutEvent.ChangeWeight(it.toString()))


        }, keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Decimal

        ),
            )
        Text(text = "${state.today}")
    }
}