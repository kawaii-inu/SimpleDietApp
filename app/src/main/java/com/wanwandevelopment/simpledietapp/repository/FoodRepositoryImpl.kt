package com.wanwandevelopment.simpledietapp.repository

import com.wanwandevelopment.simpledietapp.dao.FoodDao
import com.wanwandevelopment.simpledietapp.entity.Food
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.time.LocalDate

class FoodRepositoryImpl(private val dao: FoodDao): FoodRepository {
    override suspend fun create(calorie: Int, protein: Int, fiber: Int) {
        val created_at = System.currentTimeMillis()
        val food = Food(calorie=calorie, protein=protein, fiber=fiber, created_at=created_at)
        withContext(Dispatchers.IO){
            dao.create(food)
        }
    }
}