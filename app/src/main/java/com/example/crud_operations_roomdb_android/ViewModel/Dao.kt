package com.example.crud_operations_roomdb_android.ViewModel

import androidx.lifecycle.LiveData
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.crud_operations_roomdb_android.Model.CourseModal

@androidx.room.Dao
interface Dao {
    @Insert
    fun insert(model : CourseModal)

    @Update
    fun update(model : CourseModal)

    @Delete
    fun delete(model : CourseModal)

    @Query("DELETE FROM course_table")
    fun deleteAllCourses()

    @Query("SELECT * FROM course_table ORDER BY courseName ASC")
    fun getAllCourses() : LiveData<List<CourseModal>>

}