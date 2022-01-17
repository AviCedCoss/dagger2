package com.example.dagger2.car_factory.engines

import android.util.Log
import com.example.dagger2.car_factory.Car
import javax.inject.Inject

class DieselEngine @Inject constructor(private val horsePower: Int) : Engine {

    override fun start() {
        Log.d(Car.TAG, "Diesel Engine Started with HorsePower $horsePower")
    }
}