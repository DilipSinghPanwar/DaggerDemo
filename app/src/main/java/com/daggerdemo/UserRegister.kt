package com.daggerdemo

import javax.inject.Inject

class UserRegister @Inject constructor() {
    fun registerUser(emailService: EmailService) {
        emailService.sendEmail("dilip.dsp@gmail.com","qwerty@1234")
        println("user registered successfully")
    }
}