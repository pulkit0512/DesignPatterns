package com.strategy.pattern.sim_duck;

import com.strategy.pattern.sim_duck.fly_strategies.FlyWithWings;
import com.strategy.pattern.sim_duck.quack_strategies.Quack;

public class Duck007 extends Duck{
    @Override
    public void display() {
        System.out.println("I am 007, Duck007!!");
    }

    public static void main(String[] args) {
        Duck duck = new Duck007();
        duck.setFlyStrategy(new FlyWithWings());
        duck.setQuackStrategy(new Quack());

        duck.performFly();
        duck.performQuack();
    }
}
