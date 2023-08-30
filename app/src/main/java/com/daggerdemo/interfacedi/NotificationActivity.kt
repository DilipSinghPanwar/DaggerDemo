package com.daggerdemo.interfacedi

import android.app.Activity
import android.os.Bundle
import com.daggerdemo.databinding.ActivityNotificationBinding
import javax.inject.Inject

class NotificationActivity: Activity() {

    lateinit var binding: ActivityNotificationBinding
    @Inject
    lateinit var sendEmail: SendEmail
    @Inject
    lateinit var sendNotification: SendNotification

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNotificationBinding.inflate(layoutInflater)
        val component = DaggerNotificationComponent.builder().build()
        component.inject(this)
        sendEmail.send("hello this is email notification")
        sendNotification.send("hello this is fcm notification")
    }
}