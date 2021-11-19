package com.sumeyra.animation3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupActionBarWithNavController



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        val navController = navHostFragment.navController

        setupActionBarWithNavController(navController)



    }




}

    /*fun ClickFirst(view: View){
        val ft = supportFragmentManager.beginTransaction()

        ft.replace(R.id.fragmentContainerView, SecondFragment())

        ft.commit()

    }

    fun ClickSecond(view: View){
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.fragmentContainerView, ThirdFragment())
        ft.commit()

    }*/
