package com.decorator.pattern.starbuzz;

// Decorators need to be interchangeable with a beverage.
// So, we have to extend Beverage class.
public abstract class AddOnsDecorator extends Beverage{
    Beverage beverage;

    @Override
    public abstract String getDescription();
}
