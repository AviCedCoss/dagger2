package com.example.dagger2.car_factory.wheels

import android.util.Log
import com.example.dagger2.car_factory.Car.Companion.TAG
import javax.inject.Inject

class Wheels @Inject constructor(val rims : Rims, val tires : Tires) {

    init {
        wheelsAreReady()
    }

    private fun wheelsAreReady(){
        Log.d(TAG,"Wheels are ready.")
    }
}