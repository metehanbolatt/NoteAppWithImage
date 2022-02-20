package com.metehanbolat.noteappwithimage

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "my_table")
data class Person(
    val firstName: String,
    val lastName: String
){
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
}