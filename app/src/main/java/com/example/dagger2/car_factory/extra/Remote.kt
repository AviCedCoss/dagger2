package com.example.dagger2.car_factory.extra

import android.util.Log
import com.example.dagger2.car_factory.Car
import com.example.dagger2.car_factory.Car.Companion.TAG
import javax.inject.Inject

class Remote @Inject constructor() {

    fun setListener(car : Car){
        Log.d(TAG,"Remote Connected")
    }
}