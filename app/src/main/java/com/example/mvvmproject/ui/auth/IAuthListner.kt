package com.example.mvvmproject.ui.auth

interface IAuthListner {
    fun onStarted()
    fun onSuccess()
    fun onFail(message : String)
}