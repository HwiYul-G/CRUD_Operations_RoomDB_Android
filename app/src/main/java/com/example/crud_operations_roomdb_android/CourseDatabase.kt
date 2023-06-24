package com.example.crud_operations_roomdb_android

import android.content.Context
import android.os.AsyncTask
import androidx.room.Dao
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import com.example.crud_operations_roomdb_android.Model.CourseModal

// db entities와 db version을 위한 annotation
@Database(entities = [CourseModal::class], version = 1)
abstract class CourseDatabase : RoomDatabase() {
    abstract fun courseDao(): Dao

    companion object {
        // instance 변수를 도익화
        @Volatile
        private var instance : CourseDatabase? = null

        // 동기화
        @Synchronized
        fun getInstance(context: Context) : CourseDatabase {
            return instance ?: synchronized(this) {
                val databaseBuilder = Room.databaseBuilder(
                    context.applicationContext,
                    CourseDatabase::class.java, "course_database"
                )
                databaseBuilder.fallbackToDestructiveMigration()
                databaseBuilder.addCallback(roomCallback)
                val database = databaseBuilder.build()
                instance = database
                database
            }
        }

        private val roomCallback = object : RoomDatabase.Callback() {
            override fun onCreate(db: SupportSQLiteDatabase) {
                super.onCreate(db)
                PopulateDbAsyncTask(instance).execute()
            }
        }

        private class PopulateDbAsyncTask(private val database: CourseDatabase?) :
            AsyncTask<Void, Void, Void>() {

            override fun doInBackground(vararg voids: Void): Void? {
                // Perform your background task here
                return null
            }
        }
    }
}