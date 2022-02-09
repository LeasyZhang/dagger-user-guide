package com.example.dagger.coffeeshop;

import dagger.Lazy;

import javax.inject.Inject;

public class CoffeeMaker {

    private final Lazy<Heater> heater;
    private final Pump pump;
    private final CoffeeLogger coffeeLogger;

    @Inject
    public CoffeeMaker(
            Lazy<Heater> heater,
            Pump pump,
            CoffeeLogger coffeeLogger) {
        this.heater = heater;
        this.pump = pump;
        this.coffeeLogger = coffeeLogger;
    }

    public void brew() {
        heater.get().on();
        pump.pump();
        coffeeLogger.log(" [_]P coffee! [_]P ");
        heater.get().off();
    }
}
