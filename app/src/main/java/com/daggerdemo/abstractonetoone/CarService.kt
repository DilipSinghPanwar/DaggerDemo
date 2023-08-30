package com.daggerdemo.abstractonetoone

import javax.inject.Inject

interface CarService {
    fun rentCar(message:String)
}

class TataCar @Inject constructor():CarService{
    override fun rentCar(message:String){
        println(message)
    }
}