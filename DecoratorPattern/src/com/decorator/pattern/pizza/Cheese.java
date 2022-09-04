package com.decorator.pattern.pizza;

public class Cheese extends ToppingDecorator{

    public Cheese(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public double cost() {
        return pizza.cost() + 1.49;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Cheese";
    }
}
