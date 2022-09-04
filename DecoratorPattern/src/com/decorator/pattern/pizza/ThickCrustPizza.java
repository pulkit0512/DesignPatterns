package com.decorator.pattern.pizza;

public class ThickCrustPizza extends Pizza {

    public ThickCrustPizza() {
        description = "Thick Crust Pizza";
    }

    @Override
    public double cost() {
        return 7.49;
    }
}
