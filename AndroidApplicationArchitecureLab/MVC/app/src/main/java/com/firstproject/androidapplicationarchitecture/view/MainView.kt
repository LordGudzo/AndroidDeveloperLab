package com.firstproject.androidapplicationarchitecture.view

// This interface describes what View can do
// Controller communicates with View only through this interface
interface MainView {

    // This function displays text on the screen
    fun showText(text: String)
}