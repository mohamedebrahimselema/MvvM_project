package com.example.mvvmproject.ui.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.mvvmproject.R
import com.example.mvvmproject.databinding.ActivityLoginBinding
import com.example.mvvmproject.util.toast

class LoginActivity : AppCompatActivity() ,IAuthListner{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding : ActivityLoginBinding = DataBindingUtil.setContentView(this , R.layout.activity_login)
        val viewModel = ViewModelProvider(this).get(AuthViewModel::class.java)
        binding.viewmodel = viewModel
        viewModel.iauthListner = this
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
