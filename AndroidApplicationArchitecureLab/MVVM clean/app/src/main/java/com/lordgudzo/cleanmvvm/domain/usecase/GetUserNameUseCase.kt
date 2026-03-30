package com.lordgudzo.cleanmvvm.domain.usecase

import com.lordgudzo.cleanmvvm.domain.model.UserName
import com.lordgudzo.cleanmvvm.domain.repository.UserRepository

class GetUserNameUseCase(private val userRepository: UserRepository) {

    fun execute(): UserName {
        return userRepository.getName()
    }
}