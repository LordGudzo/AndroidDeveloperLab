package com.lordgudzo.cleanmvvm.data.repository

import com.lordgudzo.cleanmvvm.data.storage.UserStorage
import com.lordgudzo.cleanmvvm.data.storage.model.User
import com.lordgudzo.cleanmvvm.domain.model.SaveUserNameParam
import com.lordgudzo.cleanmvvm.domain.model.UserName
import com.lordgudzo.cleanmvvm.domain.repository.UserRepository

class UserRepositoryImpl(private val userStorage: UserStorage) : UserRepository {

    override fun saveName(saveParam: SaveUserNameParam): Boolean {
        val user =mapToStorage(saveParam)
        return userStorage.save(user)
    }

    override fun getName(): UserName {
        val user = userStorage.get()
        return mapToDomain(user)
    }

    private fun mapToStorage(saveParam: SaveUserNameParam): User {
        return User(firstName = saveParam.name, lastName = "")
    }
    private fun mapToDomain(user: User): UserName {
        return UserName(firstName = user.firstName, lastName = user.lastName)
    }
}

