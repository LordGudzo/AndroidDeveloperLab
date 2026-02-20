package com.firstproject.androidapplicationarchitecture.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.firstproject.androidapplicationarchitecture.controller.MainController
import com.firstproject.androidapplicationarchitecture.databinding.ActivityMainBinding
import com.firstproject.androidapplicationarchitecture.model.TextDataSource
import com.firstproject.androidapplicationarchitecture.model.TextRepository


// MainActivity is Android View implementation
// It implements MainView interface
class MainActivity : AppCompatActivity(), MainView {

    // ViewBinding object to access views
    private lateinit var binding: ActivityMainBinding

    // Controller reference
    private lateinit var controller: MainController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inflate layout using ViewBinding
        binding = ActivityMainBinding.inflate(layoutInflater)

        // Set content view
        setContentView(binding.root)

        // Create data source object
        val dataSource = TextDataSource(this)

        // Create repository object
        val repository = TextRepository(dataSource)

        // Create controller and pass View + Repository
        controller = MainController(this, repository)

        // Set click listener for Load button
        binding.tvText.setOnClickListener {

            // Call controller logic
            controller.onLoadButtonClicked()
        }

        // Set click listener for Send button
        binding.editText.setOnClickListener {

            // Get text from EditText
            val inputText = binding.editText.text.toString()

            // Send text to controller
            controller.onSendButtonClicked(inputText)
        }
    }

    // Implementation of MainView interface
    override fun showText(text: String) {

        // Set text to TextView
        binding.tvText.text = text
    }
}