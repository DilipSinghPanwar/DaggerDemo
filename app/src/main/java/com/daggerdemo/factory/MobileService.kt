package com.daggerdemo.factory

import javax.inject.Inject

interface MobileService {
    fun brand(processor: String)
}


class Nokia @Inject constructor(private val feature:String): MobileService {
    override fun brand(processor: String) {
        println(processor+"feature: "+feature)
    }
}

class Moto @Inject constructor(): MobileService {
    override fun brand(processor: String) {
        println(processor)
    }

}