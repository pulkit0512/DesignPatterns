package com.strategy.pattern.sim_duck;

import com.strategy.pattern.sim_duck.fly_strategies.FlyWithWings;
import com.strategy.pattern.sim_duck.quack_strategies.Quack;

import java.util.logging.Logger;

public class Duck007 extends Duck{
    private static final Logger LOGGER = Logger.getLogger(Duck007.class.getName());

    @Override
    public void display() {
        LOGGER.info("I am 007, Duck007!!");
    }

    public static void main(String[] args) {
        Duck duck = new Duck007();
        duck.setFlyStrategy(new FlyWithWings());
        duck.setQuackStrategy(new Quack());

        duck.display();
        duck.performFly();
        duck.performQuack();
    }
}
