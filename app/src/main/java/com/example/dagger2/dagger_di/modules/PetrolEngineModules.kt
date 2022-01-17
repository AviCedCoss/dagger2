package com.example.dagger2.dagger_di.modules

import com.example.dagger2.car_factory.engines.Engine
import com.example.dagger2.car_factory.engines.PetrolEngine
import dagger.Binds
import dagger.Module

@Module
abstract class PetrolEngineModules {

    @Binds
    abstract fun bindsEngine(petrolEngine: PetrolEngine): Engine

}