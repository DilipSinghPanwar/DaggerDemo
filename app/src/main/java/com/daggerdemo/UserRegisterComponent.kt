package com.daggerdemo

import dagger.Component

@Component
interface UserRegisterComponent {

//    fun getUserRegister(): UserRegister
//    fun getEmailService(): EmailService
    fun inject(mainActivity: MainActivity)
}