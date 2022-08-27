package com.strategy.pattern.sim_duck;

import com.strategy.pattern.sim_duck.fly_strategies.FlyStrategy;
import com.strategy.pattern.sim_duck.quack_strategies.QuackStrategy;

public abstract class Duck {
    private FlyStrategy flyStrategy;
    private QuackStrategy quackStrategy;

    public void swim() {
        System.out.println("All ducks can swim, so I can also swim.");
    }

    public abstract void display();

    public void performFly() {
        flyStrategy.fly();
    }

    public void performQuack() {
        quackStrategy.quack();
    }

    public void setFlyStrategy(FlyStrategy flyStrategy) {
        this.flyStrategy = flyStrategy;
    }

    public void setQuackStrategy(QuackStrategy quackStrategy) {
        this.quackStrategy = quackStrategy;
    }
}
