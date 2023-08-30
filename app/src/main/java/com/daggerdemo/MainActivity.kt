package com.daggerdemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.databinding.DataBindingUtil
import com.daggerdemo.databinding.ActivityMainBinding
import dagger.internal.DaggerCollections
import javax.inject.Inject

class MainActivity : ComponentActivity() {

    @Inject
    lateinit var userRegister: UserRegister

    @Inject
    lateinit var emailService: EmailService

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
//        binding = ActivityMainBinding.inflate(layoutInflater)


//        val emailService = EmailService()
//        val userRegister = UserRegister();
//        userRegister.registerUser(emailService)

//        val userRegisterComponent = DaggerUserRegisterComponent.builder().build().getUserRegister()
//        userRegisterComponent.registerUser(emailService)

//        val daggerComponent = DaggerUserRegisterComponent.builder().build()
//        val emailService = daggerComponent.getEmailService()
//        daggerComponent.getUserRegister().registerUser(emailService)

        val daggerComponent = DaggerUserRegisterComponent.builder().build()
        daggerComponent.inject(this)
        val message = userRegister.registerUser(emailService)
        binding.textView.text = message


    }
}
