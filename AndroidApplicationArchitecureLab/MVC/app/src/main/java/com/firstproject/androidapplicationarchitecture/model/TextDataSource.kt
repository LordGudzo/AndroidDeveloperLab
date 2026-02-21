package com.firstproject.androidapplicationarchitecture.model

import android.content.Context
import org.json.JSONObject

class TextDataSource(private val context: Context) {

    // This function reads JSON file and returns TextModel
    fun readTextFromAssets(): TextModel {

        // Open JSON file from assets folder
        val inputStream = context.assets.open("default.json")

        // Convert input stream to string -> "{\n  \"text\": \"Hello from JSON\"\n}"
        val jsonString = inputStream.bufferedReader().use { it.readText() }

        // Convert string to JSON object -> {"text":"Hello from JSON"}
        val jsonObject = JSONObject(jsonString)

        // Get value of "text" field from JSON -> "Hello from JSON"
        val textValue = jsonObject.getString("text")

        // Return TextModel object
        return TextModel(textValue)
    }
}