package com.firstproject.androidapplicationarchitecture.view

import android.graphics.drawable.Drawable
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.target.CustomTarget
import com.bumptech.glide.request.transition.Transition
import com.firstproject.androidapplicationarchitecture.controller.MainController
import com.firstproject.androidapplicationarchitecture.controller.MainControllerFactory
import com.firstproject.androidapplicationarchitecture.databinding.ActivityMainBinding
import com.firstproject.androidapplicationarchitecture.model.TextDataSource
import com.firstproject.androidapplicationarchitecture.model.TextRepository


/**
 * MainActivity is Android View implementation
 * It implements MainView interface
 */
class MainActivity : AppCompatActivity(), MainView {

    private var _binding: ActivityMainBinding? = null
    private val binding
        get() = _binding ?: throw IllegalStateException("Binding must not be null")

    private lateinit var controller: MainController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        controller = MainControllerFactory.create(this, this)

        controller.setBackground()
        controller.setText()

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


    override fun showBackGroundPicture(imagePath: String) {
        Glide.with(this)
            .load("file:///android_asset/$imagePath")
            .into(binding.ivBackground)
    }
}