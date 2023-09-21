package com.wanwandevelopment.simpledietapp.dao

import androidx.room.Dao
import androidx.room.Query
import com.wanwandevelopment.simpledietapp.entity.Food

@Dao
interface FoodDao {
    @Query("SELECT * FROM food")
    fun getAllFood(): List<Food>
}