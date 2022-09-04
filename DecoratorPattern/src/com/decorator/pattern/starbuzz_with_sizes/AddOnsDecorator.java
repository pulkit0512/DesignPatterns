package com.decorator.pattern.starbuzz_with_sizes;

// Decorators need to be interchangeable with a beverage.
// So, we have to extend Beverage class.
public abstract class AddOnsDecorator extends Beverage {
    Beverage beverage;

    @Override
    public abstract String getDescription();

    @Override
    public SIZE getSize() {
        return beverage.getSize();
    }
}
