package com.wanwandevelopment.simpledietapp.repository

import com.wanwandevelopment.simpledietapp.entity.Food

interface FoodRepository {
    suspend fun create(calorie: Int, protein:Int, fiber:Int)
}