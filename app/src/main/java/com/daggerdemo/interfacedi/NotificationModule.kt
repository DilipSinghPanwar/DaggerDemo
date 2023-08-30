package com.daggerdemo.interfacedi

import dagger.Module
import dagger.Provides

@Module
class NotificationModule {
    @Provides
    fun getEmail(): SendEmail {
        return SendEmail()
    }
    @Provides
    fun getMessage(): SendNotification {
        return SendNotification()
    }
}