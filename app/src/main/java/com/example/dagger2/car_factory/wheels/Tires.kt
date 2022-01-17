package com.example.dagger2.car_factory.wheels

import android.util.Log
import com.example.dagger2.car_factory.Car.Companion.TAG

class Tires {

    //We don't own this class so assume it as Third party library's class.
    fun inflate(){
        Log.d(TAG,"Tires Inflated")
    }
}