package com.lordgudzo.cleanmvvm.ui

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.lordgudzo.cleanmvvm.data.repository.UserRepositoryImpl
import com.lordgudzo.cleanmvvm.data.storage.SharedPrefUserStorageImpl
import com.lordgudzo.cleanmvvm.domain.usecase.GetUserNameUseCase
import com.lordgudzo.cleanmvvm.domain.usecase.SaveUserNameUseCase
import kotlin.getValue

class MainViewModelFactory(context: Context) : ViewModelProvider.Factory  {
    private val userRepository by lazy (LazyThreadSafetyMode.NONE) {
        UserRepositoryImpl(userStorage = SharedPrefUserStorageImpl(context = context))
    }

    private val getUserNameUseCase by lazy (LazyThreadSafetyMode.NONE) {
        GetUserNameUseCase(userRepository = userRepository)
    }
    private val saveUserNameUseCase by lazy (LazyThreadSafetyMode.NONE) {
        SaveUserNameUseCase(userRepository = userRepository)
    }

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MainViewModel(
            getUserNameUseCase = getUserNameUseCase,
            saveUserNameUseCase = saveUserNameUseCase,
        ) as T
    }
}