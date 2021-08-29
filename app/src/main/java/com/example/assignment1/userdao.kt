package com.example.assignment1

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface userdao {
    @Insert
    fun adduser()

    @Query("SELECT * FROM user_table")

    fun readAllUser()

}