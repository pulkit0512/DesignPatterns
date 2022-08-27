package com.strategy.pattern.sim_duck.quack_strategies;

public class Quack implements QuackStrategy{
    @Override
    public void quack() {
        System.out.println("Quack...");
    }
}
