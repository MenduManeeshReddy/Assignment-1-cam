package com.example.assignment1

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [user::class],version = 1,exportSchema = false)
abstract class UserDataBase : RoomDatabase() {
    abstract fun userdao():userdao
}