package com.example.dagger2.car_factory.wheels

import android.util.Log
import com.example.dagger2.car_factory.Car


class Rims {

    //We don't own this class so assume it as Third party library's class.
    fun ready(){
        Log.d(Car.TAG,"Rimes Ready")
    }
}