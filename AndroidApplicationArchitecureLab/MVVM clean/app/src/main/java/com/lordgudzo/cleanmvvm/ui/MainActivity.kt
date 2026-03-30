package com.lordgudzo.cleanmvvm.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.lordgudzo.cleanmvvm.ui.theme.CleanMVVMTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val viewModel: MainViewModel = viewModel(
                factory = MainViewModelFactory(this)
            )

            CleanMVVMTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    CleanArchScreen(
                        modifier = Modifier.padding(innerPadding),
                        viewModel
                    )
                }
            }
        }
    }
}

@Composable
fun CleanArchScreen(
    modifier: Modifier = Modifier,
    viewModel: MainViewModel
) {


    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(text = viewModel.userName.value)
        Button(onClick = {
            viewModel.load()
        }) {
            Text("Get User Data")
        }


        Spacer(modifier.padding(30.dp))


        TextField(
            value = viewModel.saveNameInput.value,
            onValueChange = { viewModel.onNameChanged(it) },
            label = { Text("Enter user name") }
        )

        Button(onClick = {
            viewModel.save()
        }) {
            Text("Save User Name")
        }

        Text(text = viewModel.saveResult.value)
    }
}

