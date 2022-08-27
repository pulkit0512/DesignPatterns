package com.strategy.pattern.sim_duck.fly_strategies;

public class FlyWithWings implements FlyStrategy{
    @Override
    public void fly() {
        System.out.println("I can fly using Wings!!");
    }
}
