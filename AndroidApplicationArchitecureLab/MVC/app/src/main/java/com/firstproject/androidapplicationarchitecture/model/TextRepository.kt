package com.firstproject.androidapplicationarchitecture.model

/**
 *   Repository connects Controller with DataSource
 *   Controller does not know where data comes from *
 * */
class TextRepository(
    private val dataSource: TextDataSource
) {
    // This function returns TextModel object
    fun getText(): TextModel {
        // Ask data source for data
        return dataSource.readTextFromAssets()
    }
}