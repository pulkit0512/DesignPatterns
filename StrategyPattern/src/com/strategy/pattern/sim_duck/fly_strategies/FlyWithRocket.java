package com.strategy.pattern.sim_duck.fly_strategies;

public class FlyWithRocket implements FlyStrategy{
    @Override
    public void fly() {
        System.out.println("I am flying with a rocket!!");
    }
}
