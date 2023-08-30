package com.daggerdemo.abstractonetoone

import android.app.Activity
import android.os.Bundle
import com.daggerdemo.databinding.ActivityNotificationBinding
import com.daggerdemo.interfacedi.DaggerNotificationComponent
import com.daggerdemo.interfacedi.SendEmail
import com.daggerdemo.interfacedi.SendNotification
import javax.inject.Inject

class CarActivity: Activity() {

    lateinit var binding: ActivityNotificationBinding
    @Inject
    lateinit var tataCar: TataCar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNotificationBinding.inflate(layoutInflater)
        val component = DaggerCarComponent.builder().build()
        component.inject(this)
        tataCar.rentCar("i need tata car")
    }
}