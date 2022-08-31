package com.strategy.pattern.sim_duck.fly_strategies;

import java.util.logging.Logger;

public class FlyNoWay implements FlyStrategy{
    private static final Logger LOGGER = Logger.getLogger(FlyNoWay.class.getName());

    @Override
    public void fly() {
        LOGGER.info("I can't fly!!");
    }
}
