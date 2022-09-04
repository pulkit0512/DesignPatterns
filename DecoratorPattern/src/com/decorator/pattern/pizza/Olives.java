package com.decorator.pattern.pizza;

public class Olives extends ToppingDecorator {

    public Olives(Pizza pizza) {
        this.pizza = pizza;
    }
    @Override
    public double cost() {
        return pizza.cost() + 0.99;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Olives";
    }
}
