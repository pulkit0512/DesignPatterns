package com.strategy.pattern.sim_duck.quack_strategies;

public class Squeak implements QuackStrategy{
    @Override
    public void quack() {
        System.out.println("Squeak!!");
    }
}
