package com.lordgudzo.cleanmvvm.data.storage

import com.lordgudzo.cleanmvvm.data.storage.model.User

interface UserStorage {

    fun save(user: User): Boolean

    fun get(): User
}