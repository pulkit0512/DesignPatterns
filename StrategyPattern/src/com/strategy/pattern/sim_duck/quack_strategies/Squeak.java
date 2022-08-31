package com.strategy.pattern.sim_duck.quack_strategies;

import java.util.logging.Logger;

public class Squeak implements QuackStrategy{
    private static final Logger LOGGER = Logger.getLogger(Squeak.class.getName());

    @Override
    public void quack() {
        LOGGER.info("Squeak!!");
    }
}
