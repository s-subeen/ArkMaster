package com.android.arkmaster

import android.widget.Toast
import com.android.arkmaster.main.Character

// 회원 가입 사용자
data class User(
    val name: String,
    val userId: String,  // userEmail -> userId
    val nickname: String,
    val representativeCharacter: Character? = null
)

val datalist = mutableListOf<User>()


