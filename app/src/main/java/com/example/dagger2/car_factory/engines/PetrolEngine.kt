package com.example.dagger2.car_factory.engines

import android.util.Log
import com.example.dagger2.car_factory.Car.Companion.TAG
import javax.inject.Inject
import javax.inject.Named

class PetrolEngine @Inject constructor(
    @Named("horse_power") var horsePower: Int,
    @Named("engine_capacity") var engineCapacity: Int
) : Engine {

    override fun start() {
        Log.d(
            TAG,
            "Petrol Engine Started with HorsePower : $horsePower and EngineCapacity : $engineCapacity"
        )
    }
}