package com.example.socialnetworksjs.view

import android.content.Intent
import android.net.Uri
import androidx.lifecycle.ViewModel

class LoginViewModel : ViewModel() {

    fun getIntentForRegister(): Intent {
        val url = REGISTER_PAGE_URL
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse(url)
        return intent
    }

//    fun logIn(login: String, password: String): Boolean {
//
//    }

    companion object {
        const val REGISTER_PAGE_URL = "https://social-network.samuraijs.com/signUp"
    }
}