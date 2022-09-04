package com.decorator.pattern.starbuzz;

// Milk is an AddOn, so we extend AddOnsDecorator
// This can be used in place of other beverages since AddOnsDecorator extends beverages for super type matching.
public class WhipAddOn extends AddOnsDecorator{

    // Instantiate WhipAddOn with reference to a beverage.
    // Pass the beverage we are wrapping to the decorator's constructor.
    public WhipAddOn(Beverage beverage) {
        this.beverage = beverage;
    }

    // Our description needs to be updated according to the addons.
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    // First delegate the call to the object we are decorating, get the cost and add the cost of addon.
    @Override
    public double cost() {
        return beverage.cost() + 0.10;
    }
}
