package com.firstproject.androidapplicationarchitecture.controller

import com.firstproject.androidapplicationarchitecture.model.TextRepository
import com.firstproject.androidapplicationarchitecture.view.MainView


// Controller connects View and Model
// It contains application logic
class MainController(

    // Reference to View interface
    private val view: MainView,

    // Reference to Repository
    private val repository: TextRepository

) {

    // This function is called when user clicks "Load" button
    fun onLoadButtonClicked() {

        // Get model from repository
        val model = repository.getText()

        // Send text to View
        view.showText(model.text)
    }

    // This function is called when user clicks "Send" button
    fun onSendButtonClicked(inputText: String) {

        // Send received text back to View
        view.showText(inputText)
    }
}