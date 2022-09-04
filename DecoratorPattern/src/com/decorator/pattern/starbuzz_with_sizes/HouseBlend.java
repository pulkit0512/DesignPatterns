package com.decorator.pattern.starbuzz_with_sizes;

// Since this is a Beverage extend the Beverage class.
public class HouseBlend extends Beverage {

    // To set the description which is an instance variable in beverage class, inherited to child classes.
    public HouseBlend(){
        description = "HouseBlend Coffee";
    }

    // Cost of beverage, don't need to worry about the addons for now.
    @Override
    public double cost() {
        return 0.89;
    }
}
