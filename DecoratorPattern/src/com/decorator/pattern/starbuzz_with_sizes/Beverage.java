package com.decorator.pattern.starbuzz_with_sizes;

// Abstract class with getDescription and cost methods.
public abstract class Beverage {
    public enum SIZE {SMALL, MEDIUM, TALL}
    SIZE size = SIZE.TALL;
    String description;

    // Already implemented, need to implement cost in subclasses.
    public String getDescription() {
        return description;
    }

    public abstract double cost();

    public void setSize(SIZE size) {
        this.size = size;
    }
    public SIZE getSize() {
        return size;
    }
}
