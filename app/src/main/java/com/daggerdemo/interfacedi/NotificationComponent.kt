package com.daggerdemo.interfacedi

import dagger.Component

@Component(modules = [NotificationModule::class])
interface NotificationComponent {
    fun inject(notificationActivity: NotificationActivity)
}