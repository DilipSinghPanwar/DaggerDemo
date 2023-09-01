package com.daggerdemo.factory

import dagger.Component

@Component(modules = [MobileServiceModule::class])
interface MobileServiceComponent {
    fun inject(mobileActivity: MobileActivity)

}