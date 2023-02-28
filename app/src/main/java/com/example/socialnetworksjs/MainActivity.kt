package com.example.socialnetworksjs

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        setContentView(R.layout.activity_main)

//        supportFragmentManager.beginTransaction()
//            .replace(R.id.mainLayout, ProfileFragment.newInstance()).commit()
    }
}