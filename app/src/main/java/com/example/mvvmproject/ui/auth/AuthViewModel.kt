package com.example.mvvmproject.ui.auth

import android.view.View
import androidx.lifecycle.ViewModel
import com.example.mvvmproject.data.repositories.UserRepository

class AuthViewModel : ViewModel() {

    var email : String? = null
    var password : String? = null
    var iauthListner : IAuthListner ?=null
    fun onLoginBtnClicked(view: View){
        iauthListner?.onStarted()
        if(email.isNullOrEmpty() || password.isNullOrEmpty()){
            iauthListner?.onFail("Invalid email or password")
            return
        }
        //sucess

        val loginResponse = UserRepository().userLogin(email!!,password!!)
        iauthListner?.onSuccess(loginResponse)

    }
}