package com.daggerdemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import dagger.internal.DaggerCollections

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        val emailService = EmailService()
//        val userRegister = UserRegister();
//        userRegister.registerUser(emailService)

//        val userRegisterComponent = DaggerUserRegisterComponent.builder().build().getUserRegister()
//        userRegisterComponent.registerUser(emailService)

        val daggerComponent = DaggerUserRegisterComponent.builder().build()
        val emailService = daggerComponent.getEmailService()
        daggerComponent.getUserRegister().registerUser(emailService)

    }
}
