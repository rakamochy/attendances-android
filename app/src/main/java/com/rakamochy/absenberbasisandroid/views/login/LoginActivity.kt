package com.rakamochy.absenberbasisandroid.views.login

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.rakamochy.absenberbasisandroid.databinding.ActivityLoginBinding
import com.rakamochy.absenberbasisandroid.views.forgotpass.ForgotPasswordActivity
import com.rakamochy.absenberbasisandroid.views.main.MainActivity
import org.jetbrains.anko.startActivity


class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        onClick()
    }

    private fun onClick() {
        binding.btnLogin.setOnClickListener {
            startActivity<MainActivity>()
        }

        binding.btnForgotPassword.setOnClickListener {
            startActivity<ForgotPasswordActivity>()
        }
    }
}