package com.example.dagger2

import android.app.Application
import com.example.dagger2.dagger_di.components.AppComponent
import com.example.dagger2.dagger_di.components.DaggerAppComponent
import com.example.dagger2.dagger_di.modules.DriverModule

class App : Application() {


    private lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.factory().create(DriverModule("Avinash Srivastava"))
    }

    fun getAppComponent() = appComponent
}