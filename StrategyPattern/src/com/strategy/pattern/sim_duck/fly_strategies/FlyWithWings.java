package com.strategy.pattern.sim_duck.fly_strategies;

import java.util.logging.Logger;

public class FlyWithWings implements FlyStrategy{
    private static final Logger LOGGER = Logger.getLogger(FlyWithWings.class.getName());

    @Override
    public void fly() {
        LOGGER.info("I can fly using Wings!!");
    }
}
