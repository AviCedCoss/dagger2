package com.example.dagger2.dagger_di.components

import com.example.dagger2.dagger_di.modules.PetrolEngineModules
import com.example.dagger2.dagger_di.modules.WheelsModule
import com.example.dagger2.dagger_di.scope.PerActivity
import com.example.dagger2.MainActivity
import dagger.BindsInstance
import dagger.Subcomponent
import javax.inject.Named

@PerActivity
@Subcomponent(
    modules = [WheelsModule::class, PetrolEngineModules::class]
)
interface ActivityComponent {


    fun inject(mainActivity: MainActivity)

    @Subcomponent.Factory
    interface Factory {

        fun create(
            @BindsInstance @Named("horse_power") horsePower: Int,
            @BindsInstance @Named("engine_capacity") engineCapacity: Int
        ): ActivityComponent
    }

}