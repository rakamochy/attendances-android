package com.rakamochy.absenberbasisandroid.views.forgotpass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rakamochy.absenberbasisandroid.R
import com.rakamochy.absenberbasisandroid.databinding.ActivityForgotPasswordBinding

class ForgotPasswordActivity : AppCompatActivity() {

    private lateinit var binding: ActivityForgotPasswordBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityForgotPasswordBinding.inflate(layoutInflater)
        setContentView(binding.root)

        init()
        //Tambahkan Function onClick
        onClick()
    }

    //Function Onclick
    private fun onClick() {
        binding.tbForgotPassword.setNavigationOnClickListener {
            finish()
        }
    }

    private fun init() {
        setSupportActionBar(binding.tbForgotPassword)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}