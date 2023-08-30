package com.daggerdemo

import android.widget.Toast
import javax.inject.Inject

class EmailService @Inject constructor(){
    fun sendEmail(email:String,password:String){
        println("send email: $email password: $password")
    }
}