package com.wanwandevelopment.simpledietapp.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.wanwandevelopment.simpledietapp.entity.Food
import kotlinx.coroutines.flow.Flow

@Dao
interface FoodDao {
    @Query("SELECT * FROM food")
    fun getAllFood(): Flow<List<Food>>

    @Insert
    suspend fun create(food: Food)

    @Update
    suspend fun update(food: Food)

    @Delete
    suspend fun delete(food: Food)
}