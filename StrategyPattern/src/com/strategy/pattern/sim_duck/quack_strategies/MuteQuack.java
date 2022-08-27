package com.strategy.pattern.sim_duck.quack_strategies;

public class MuteQuack implements QuackStrategy{
    @Override
    public void quack() {
        System.out.println("Silence, No Sound!!");
    }
}
