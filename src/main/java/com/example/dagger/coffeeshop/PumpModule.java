package com.example.dagger.coffeeshop;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class PumpModule {

    @Binds
    abstract Pump pump(Thermosiphon pump);
}
