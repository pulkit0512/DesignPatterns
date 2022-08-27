package com.strategy.pattern.sim_duck.fly_strategies;

public class FlyNoWay implements FlyStrategy{
    @Override
    public void fly() {
        System.out.println("I can't fly!!");
    }
}
