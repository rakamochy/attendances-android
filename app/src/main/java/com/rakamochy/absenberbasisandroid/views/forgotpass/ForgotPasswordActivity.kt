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
    }

    private fun (){
        setSupportActionBar(binding.tbForgotPassword)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}