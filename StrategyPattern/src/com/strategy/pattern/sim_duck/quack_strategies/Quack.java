package com.strategy.pattern.sim_duck.quack_strategies;

import java.util.logging.Logger;

public class Quack implements QuackStrategy{
    private static final Logger LOGGER = Logger.getLogger(Quack.class.getName());

    @Override
    public void quack() {
        LOGGER.info("Quack...");
    }
}
