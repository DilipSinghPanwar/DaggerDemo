package com.daggerdemo.abstractonetoone

import dagger.Binds
import dagger.Module

@Module
abstract class CarModule {
    @Binds
    abstract fun getCar(tataCar: TataCar):CarService
}