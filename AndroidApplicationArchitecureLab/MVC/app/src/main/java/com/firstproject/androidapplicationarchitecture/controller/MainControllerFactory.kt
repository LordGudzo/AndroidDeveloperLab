package com.firstproject.androidapplicationarchitecture.controller

import android.content.Context
import android.util.Log
import com.firstproject.androidapplicationarchitecture.model.TextDataSource
import com.firstproject.androidapplicationarchitecture.model.TextRepository
import com.firstproject.androidapplicationarchitecture.view.MainView

/**
 * Factory builds all dependencies required by MainController.
 * MainActivity now asks factory for ready-to-use controller.
 */
object MainControllerFactory {
    fun create(view: MainView, context: Context): MainController {
        val dataSource = TextDataSource(context)
        val repository = TextRepository(dataSource)
        Log.d("TEST", "create: ${repository.getText()}")
        return MainController(view, repository)
    }
}