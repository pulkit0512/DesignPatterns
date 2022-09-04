package com.decorator.pattern.pizza;

public class PizzaStore {

    public static void main(String[] args) {
        Pizza pizza = new ThinCrustPizza();
        pizza = new Cheese(pizza);

        System.out.println(pizza.getDescription() + ": $" + pizza.cost());

        Pizza pizza1 = new ThinCrustPizza();
        pizza1 = new Cheese(pizza1);
        pizza1 = new Olives(pizza1);

        System.out.println(pizza1.getDescription() + ": $" + pizza1.cost());
    }
}
