package com.strategy.pattern.sim_duck;

import com.strategy.pattern.sim_duck.fly_strategies.FlyNoWay;
import com.strategy.pattern.sim_duck.fly_strategies.FlyWithRocket;
import com.strategy.pattern.sim_duck.quack_strategies.Quack;
import com.strategy.pattern.sim_duck.quack_strategies.Squeak;

import java.util.logging.Logger;

public class Duck008 extends Duck{
    private static final Logger LOGGER = Logger.getLogger(Duck008.class.getName());

    @Override
    public void display() {
        LOGGER.info("I am new super agent, Duck008");
    }

    public static void main(String[] args) {
        Duck duck = new Duck008();
        duck.setFlyStrategy(new FlyNoWay());
        duck.setQuackStrategy(new Quack());

        duck.performFly();
        duck.performQuack();
        duck.swim();
        duck.display();

        // Now we want to make this duck fly using a rocket.
        // So best part of strategy pattern is, we can implement one new strategy from FlyStrategy interface.
        // Also in runtime we can change the fly behaviour of ducks if and when needed using power of polymorphism.

        duck.setFlyStrategy(new FlyWithRocket());
        duck.setQuackStrategy(new Squeak());
        duck.performFly();
        duck.performQuack();
    }
}
