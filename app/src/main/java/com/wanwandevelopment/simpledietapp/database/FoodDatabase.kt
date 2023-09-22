package com.wanwandevelopment.simpledietapp.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.wanwandevelopment.simpledietapp.dao.FoodDao
import com.wanwandevelopment.simpledietapp.entity.Food

@Database(entities = [Food::class], version = 1, exportSchema = false)
abstract class FoodDatabase: RoomDatabase() {
    abstract fun foodDao(): FoodDao
}