package com.wanwandevelopment.simpledietapp.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.wanwandevelopment.simpledietapp.dao.FoodDao
import com.wanwandevelopment.simpledietapp.entity.Food
import com.wanwandevelopment.simpledietapp.utils.DateConverters

@Database(entities = [Food::class], version = 1, exportSchema = false)
@TypeConverters(DateConverters::class)
abstract class FoodDatabase: RoomDatabase() {
    abstract fun foodDao(): FoodDao
}