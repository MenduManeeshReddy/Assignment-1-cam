package com.example.assignment1

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName="user_table")
class user (
    @PrimaryKey(autoGenerate = true)
    var id:Int,
    var firstName:String,
    var lastName:String,
    var phone:String,
)


