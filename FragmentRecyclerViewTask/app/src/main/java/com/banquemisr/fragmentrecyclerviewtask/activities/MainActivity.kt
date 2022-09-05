package com.banquemisr.fragmentrecyclerviewtask.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.banquemisr.fragmentrecyclerviewtask.R
import com.banquemisr.fragmentrecyclerviewtask.fragments.UserFragment

class MainActivity : AppCompatActivity() {
    lateinit var userFragment: UserFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        userFragment = UserFragment()
        sendToNextFragment()


    }

    private fun sendToNextFragment() {
        supportFragmentManager
            .beginTransaction()
            .add(R.id.fragmentContainerView, userFragment)
            .commit()
    }

    override fun onBackPressed() {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragmentContainerView, userFragment)
            .commit()

    }
}
