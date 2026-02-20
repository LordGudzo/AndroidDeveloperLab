package com.firstproject.androidapplicationarchitecture.model

import android.content.Context
import org.json.JSONObject

// This class is responsible for reading JSON file from assets folder
class TextDataSource(

    // We need context to access assets folder
    private val context: Context

) {

    // This function reads JSON file and returns TextModel
    fun readTextFromAssets(): TextModel {

        // Open JSON file from assets folder
        val inputStream = context.assets.open("default.json")

        // Convert input stream to string
        val jsonString = inputStream.bufferedReader().use { it.readText() }

        // Convert string to JSON object
        val jsonObject = JSONObject(jsonString)

        // Get value of "text" field from JSON
        val textValue = jsonObject.getString("text")

        // Return TextModel object
        return TextModel(textValue)
    }
}