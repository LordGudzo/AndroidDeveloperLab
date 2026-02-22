package com.firstproject.androidapplicationarchitecture.controller

import com.firstproject.androidapplicationarchitecture.model.TextRepository
import com.firstproject.androidapplicationarchitecture.view.MainView


/**
 * Controller connects View and Model
 * It contains application logic
 * */
class MainController(
    private val view: MainView,
    private val repository: TextRepository
) {
    fun setText() {
        // Get model from repository
        val model = repository.getText()
        // Send text to View
        view.showText(model.text)
    }

    fun setBackground() {
        val model = repository.getText()
        view.showBackGroundPicture(model.imagePath)
    }

    // This function is called when user clicks "Send" button
    fun onSendButtonClicked(inputText: String) {
        // Send received text back to View
        view.showText(inputText)
    }


}