package com.example.mvvmproject.Ui.auth

interface IAuthListner {
    fun onStarted()
    fun onSuccess()
    fun onFail(message : String)
}