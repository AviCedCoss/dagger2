package com.example.dagger2.dagger_di.components

import com.example.dagger2.dagger_di.modules.DriverModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [DriverModule::class])
interface AppComponent {

    fun activityComponentFactory(): ActivityComponent.Factory

    @Component.Factory
    interface Factory {
        fun create(driverModule: DriverModule) : AppComponent
    }
}