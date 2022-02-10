package com.example.dagger.coffeeshop;

import dagger.Binds;
import dagger.Module;

import javax.inject.Singleton;

@Module
public interface HeaterModule {

    @Binds
    @Singleton
    Heater bindHeater(ElectricHeater impl);
}
