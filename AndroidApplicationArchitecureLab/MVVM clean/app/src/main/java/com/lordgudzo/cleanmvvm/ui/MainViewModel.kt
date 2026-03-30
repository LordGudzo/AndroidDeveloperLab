package com.lordgudzo.cleanmvvm.ui

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.lordgudzo.cleanmvvm.domain.model.SaveUserNameParam
import com.lordgudzo.cleanmvvm.domain.model.UserName
import com.lordgudzo.cleanmvvm.domain.usecase.GetUserNameUseCase
import com.lordgudzo.cleanmvvm.domain.usecase.SaveUserNameUseCase

class MainViewModel(
    private val saveUserNameUseCase: SaveUserNameUseCase,
    private val getUserNameUseCase: GetUserNameUseCase,
) : ViewModel() {

    private val _saveNameInput = mutableStateOf("")
    val saveNameInput: MutableState<String> = _saveNameInput

    private val _saveResult = mutableStateOf("")
    val saveResult: MutableState<String> = _saveResult

    fun onNameChanged(text: String) {
        _saveNameInput.value = text
    }

    fun save() {
        val params = SaveUserNameParam(_saveNameInput.value)
        _saveNameInput.value = ""
        val result: Boolean = saveUserNameUseCase.execute(param = params)
        _saveResult.value = "Save result: $result"
    }



    private val _userName = mutableStateOf("")
    val userName: MutableState<String> = _userName
    fun load() {
        val userName: UserName = getUserNameUseCase.execute()
        val result: String = "${userName.firstName} ${userName.lastName}"
        _userName.value = result
    }
}