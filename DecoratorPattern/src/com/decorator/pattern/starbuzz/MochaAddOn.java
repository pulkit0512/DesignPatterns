package com.decorator.pattern.starbuzz;

// Milk is an AddOn, so we extend AddOnsDecorator
// This can be used in place of other beverages since AddOnsDecorator extends beverages for super type matching.
public class MochaAddOn extends AddOnsDecorator{

    // Instantiate MochaAddOn with reference to a beverage.
    // Pass the beverage we are wrapping to the decorator's constructor.
    public MochaAddOn(Beverage beverage) {
        this.beverage = beverage;
    }

    // Our description needs to be updated according to the addons.
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    // First delegate the call to the object we are decorating, get the cost and add the cost of addon.
    @Override
    public double cost() {
        return beverage.cost() + 0.20;
    }
}
