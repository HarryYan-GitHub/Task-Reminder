package com.example.taskreminder.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [Todo::class],
    version = 1
)
abstract class TodoDatabase: RoomDatabase() {

    abstract val dao: TodoDao

    companion object {
        const val DATABASE_NAME = "todo_db"
    }
}