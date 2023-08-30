package com.daggerdemo.abstractonetoone

import dagger.Binds
import dagger.Component

@Component(modules = [CarModule::class])
abstract class CarComponent {
   abstract fun inject(carActivity: CarActivity)
}