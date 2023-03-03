package com.example.socialnetworksjs.view

import android.content.Intent
import android.net.Uri
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LoginViewModel : ViewModel() {

    val intentForRegister = MutableLiveData<Intent>()

    fun getIntentForRegister() {
        val url = REGISTER_PAGE_URL
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse(url)
        intentForRegister.value = intent
    }

//    fun logIn(login: String, password: String) {
//
//    }

    companion object {
        const val REGISTER_PAGE_URL = "https://social-network.samuraijs.com/signUp"
    }
}