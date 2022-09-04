package com.decorator.pattern.starbuzz;

// Abstract class with getDescription and cost methods.
public abstract class Beverage {
    String description;

    // Already implemented, need to implement cost in subclasses.
    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
