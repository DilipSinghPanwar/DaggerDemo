package com.daggerdemo.factory

import android.app.Activity
import android.os.Bundle
import com.daggerdemo.databinding.ActivityMobileBinding
import javax.inject.Inject

class MobileActivity : Activity() {

    private lateinit var binding: ActivityMobileBinding

    @Inject
    lateinit var nokia: Nokia

    @Inject
    lateinit var moto: Moto

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMobileBinding.inflate(layoutInflater)

//        val component = DaggerMobileServiceComponent.builder()
//            .mobileServiceModule(MobileServiceModule("Camera"))
//            .build()
//        component.inject(this)
//        nokia.brand("x1")
//        moto.brand("x2")
    }
}