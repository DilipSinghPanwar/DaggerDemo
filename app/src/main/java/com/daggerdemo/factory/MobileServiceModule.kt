package com.daggerdemo.factory

import dagger.Module
import dagger.Provides

@Module
class MobileServiceModule(val feature:String) {

    @Provides
    fun getNokiaDevice():MobileService{
        return Nokia(feature)
    }


    @Provides
    fun getMotoDevice():MobileService{
        return Moto()
    }
}