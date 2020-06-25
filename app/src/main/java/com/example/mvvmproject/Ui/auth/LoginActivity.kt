package com.example.mvvmproject.Ui.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mvvmproject.R
import com.example.mvvmproject.util.toast

class LoginActivity : AppCompatActivity() ,IAuthListner{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }
    override fun onStarted(){
        toast("login start")
    }

    override fun onSuccess() {
        toast("login success")
    }

    override fun onFail(message: String) {
        toast(message)

    }
}
