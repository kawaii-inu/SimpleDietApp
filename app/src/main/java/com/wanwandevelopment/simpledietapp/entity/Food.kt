package com.wanwandevelopment.simpledietapp.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity
data class Food(
    @PrimaryKey
    val uid: Int,

    @ColumnInfo(name = "calorie")
    val calorie: Int?,

    @ColumnInfo(name = "protein")
    val protein: Int?,

    @ColumnInfo(name = "fiber")
    val fiber: Int?,

    @ColumnInfo(name = "created_at")
    val created_at: Date
)
