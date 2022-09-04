package com.decorator.pattern.starbuzz;

// Since this is a Beverage extend the Beverage class.
public class DarkRoast extends Beverage{

    // To set the description which is an instance variable in beverage class, inherited to child classes.
    public DarkRoast(){
        description = "DarkRoast Coffee";
    }

    // Cost of beverage, don't need to worry about the addons for now.
    @Override
    public double cost() {
        return 0.99;
    }
}
