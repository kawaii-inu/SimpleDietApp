package com.wanwandevelopment.simpledietapp.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Food(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,

    @ColumnInfo(name = "calorie")
    val calorie: Int?,

    @ColumnInfo(name = "protein")
    val protein: Int?,

    @ColumnInfo(name = "fiber")
    val fiber: Int?,

    @ColumnInfo(name = "created_at")
    val created_at: Long?
)
