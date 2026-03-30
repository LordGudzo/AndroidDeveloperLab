package com.lordgudzo.cleanmvvm.domain.usecase

import com.lordgudzo.cleanmvvm.domain.model.SaveUserNameParam
import com.lordgudzo.cleanmvvm.domain.repository.UserRepository

class SaveUserNameUseCase(private val userRepository: UserRepository) {

    fun execute(param: SaveUserNameParam): Boolean {

        val oldUserName = userRepository.getName()

        if (oldUserName.firstName == param.name) {
            return true
        }

        val result: Boolean =  userRepository.saveName(param)
        return result
    }
}