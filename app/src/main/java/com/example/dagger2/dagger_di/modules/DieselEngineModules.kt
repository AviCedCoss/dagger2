package com.example.dagger2.dagger_di.modules

import com.example.dagger2.car_factory.engines.DieselEngine
import com.example.dagger2.car_factory.engines.Engine
import dagger.Module
import dagger.Provides

@Module
class DieselEngineModules(var horsePower: Int) {

    @Provides
    fun provideHorsePower(): Int {
        return horsePower
    }

    @Provides
    fun provideDieselEngine(dieselEngine: DieselEngine): Engine {
        return dieselEngine
    }

}