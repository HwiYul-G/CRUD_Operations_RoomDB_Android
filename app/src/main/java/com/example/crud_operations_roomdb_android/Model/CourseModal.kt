package com.example.crud_operations_roomdb_android.Model

import androidx.room.Entity
import androidx.room.PrimaryKey

// table name
@Entity(tableName = "course_table")
data class CourseModal(
    // id가 자동으로 update 됨
    @PrimaryKey(autoGenerate = true) val id: Int,
    val courseName: String,
    val courseDescription: String,
    val courseDuration : String
)
