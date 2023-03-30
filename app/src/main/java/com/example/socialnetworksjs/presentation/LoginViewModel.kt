package com.example.socialnetworksjs.presentation

import android.content.Intent
import android.net.Uri
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LoginViewModel : ViewModel() {

    private val intentForRegisterMutable = MutableLiveData<Intent>()
    val intentForRegister: LiveData<Intent> = intentForRegisterMutable

    fun register() {
        val url = REGISTER_PAGE_URL
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse(url)
        intentForRegisterMutable.value = intent
    }

//    fun logIn(login: String, password: String) {
//
//    }

    companion object {
        const val REGISTER_PAGE_URL = "https://social-network.samuraijs.com/signUp"
    }
}