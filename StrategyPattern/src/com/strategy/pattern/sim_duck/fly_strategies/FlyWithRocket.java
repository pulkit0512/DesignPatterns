package com.strategy.pattern.sim_duck.fly_strategies;

import java.util.logging.Logger;

public class FlyWithRocket implements FlyStrategy{
    private static final Logger LOGGER = Logger.getLogger(FlyWithRocket.class.getName());

    @Override
    public void fly() {
        LOGGER.info("I am flying with a rocket!!");
    }
}
