package com.wanwandevelopment.simpledietapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import androidx.room.Room
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.wanwandevelopment.simpledietapp.database.FoodDatabase
import com.wanwandevelopment.simpledietapp.entity.Food


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bottomNavView: BottomNavigationView = findViewById(R.id.bottom_nav)
        bottomNavView.itemIconTintList = null
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_fragment) as NavHostFragment?
        val navController = navHostFragment!!.navController
        NavigationUI.setupWithNavController(bottomNavView, navController)

        // TODO: メインスレッドから呼び出すのはダメらしいのでエラーが出る
        val db = Room.databaseBuilder(
            applicationContext,
            FoodDatabase::class.java, "food"
        ).build()
        val foodDao = db.foodDao()
        val foods: List<Food> = foodDao.getAllFood()
    }
}