package com.daggerdemo.interfacedi

interface NotificationService {
    fun send(message:String)
}

class SendEmail : NotificationService {
    override fun send(message: String) {
        println(message)
    }
}

class SendNotification: NotificationService {
    override fun send(message: String) {
        println(message)
    }
}