package com.example.mvvmproject.ui.auth

import androidx.lifecycle.LiveData

interface IAuthListner {
    fun onStarted()
    fun onSuccess(loginResponse: LiveData<String>)
    fun onFail(message : String)
}