package com.lordgudzo.cleanmvvm.domain.repository

import com.lordgudzo.cleanmvvm.domain.model.SaveUserNameParam
import com.lordgudzo.cleanmvvm.domain.model.UserName

interface UserRepository {

    fun saveName(saveParam: SaveUserNameParam): Boolean

    fun getName(): UserName
}