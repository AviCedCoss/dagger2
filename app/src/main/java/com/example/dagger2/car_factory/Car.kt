package com.example.dagger2.car_factory

import android.util.Log
import com.example.dagger2.car_factory.drivers.Driver
import com.example.dagger2.car_factory.engines.Engine
import com.example.dagger2.car_factory.extra.Remote
import com.example.dagger2.car_factory.wheels.Wheels
import com.example.dagger2.dagger_di.scope.PerActivity
import javax.inject.Inject

@PerActivity
class Car @Inject constructor(var engine: Engine, var driver: Driver) { ///Construction injection

    //Field Injection
    @Inject
    lateinit var wheels: Wheels

    //Method Injection
    @Inject
    fun enableRemote(remote: Remote) {
        remote.setListener(this)
    }

    fun drive() {
        engine.start()
        Log.d(TAG, "$driver ${driver.name} drives.. $this")
    }

    companion object {
        const val TAG = "Dagger2Showcase"
    }

}