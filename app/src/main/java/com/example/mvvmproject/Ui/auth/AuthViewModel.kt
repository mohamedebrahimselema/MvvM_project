package com.example.mvvmproject.Ui.auth

import android.view.View
import androidx.lifecycle.ViewModel

class AuthViewModel : ViewModel() {

    var email : String? = null
    var password : String? = null

    fun onLoginBtnClicked(view: View){

        if(email.isNullOrEmpty() || password.isNullOrEmpty()){
            return
        }
        //sucess

    }
}