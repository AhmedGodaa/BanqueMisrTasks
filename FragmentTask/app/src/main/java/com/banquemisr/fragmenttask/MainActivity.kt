package com.banquemisr.fragmenttask

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstFragment = FirstFragment()
        val secondFragment = SecondFragment();
       supportFragmentManager
            .beginTransaction()
            .add(R.id.firstContainer, firstFragment)
            .add(R.id.secondContainer, secondFragment)
            .commit()

    }


}