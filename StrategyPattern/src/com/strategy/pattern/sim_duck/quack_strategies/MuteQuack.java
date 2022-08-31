package com.strategy.pattern.sim_duck.quack_strategies;

import java.util.logging.Logger;

public class MuteQuack implements QuackStrategy{
    private static final Logger LOGGER = Logger.getLogger(MuteQuack.class.getName());

    @Override
    public void quack() {
        LOGGER.info("Silence, No Sound!!");
    }
}
