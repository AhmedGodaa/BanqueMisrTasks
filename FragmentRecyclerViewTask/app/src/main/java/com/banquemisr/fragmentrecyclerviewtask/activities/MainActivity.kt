package com.banquemisr.fragmentrecyclerviewtask.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.banquemisr.fragmentrecyclerviewtask.R
import com.banquemisr.fragmentrecyclerviewtask.fragments.RecyclerViewFragment

class MainActivity : AppCompatActivity() {
    lateinit var recyclerViewFragment: RecyclerViewFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerViewFragment = RecyclerViewFragment()
        supportFragmentManager
            .beginTransaction()
            .add(R.id.fragmentContainerView, recyclerViewFragment)
            .commit()


    }

    override fun onBackPressed() {
        recyclerViewFragment = RecyclerViewFragment()
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragmentContainerView, recyclerViewFragment)
            .commit()

    }
}
