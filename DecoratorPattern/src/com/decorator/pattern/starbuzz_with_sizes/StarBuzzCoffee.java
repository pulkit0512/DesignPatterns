package com.decorator.pattern.starbuzz_with_sizes;

public class StarBuzzCoffee {

    public static void main(String[] args) {
        // Simple espresso with no addons.
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " " + beverage.getSize() + " $" + String.format("%.4f",beverage.cost()));

        // DarkRoast with double mocha and whip cream.
        Beverage beverage2 = new DarkRoast();
        beverage2.setSize(Beverage.SIZE.MEDIUM);
        beverage2 = new MochaAddOn(beverage2);
        beverage2 = new MochaAddOn(beverage2);
        beverage2 = new WhipAddOn(beverage2);
        System.out.println(beverage2.getDescription() + " " + beverage2.getSize() + " $" + String.format("%.4f",beverage2.cost()));

        // HouseBlend with soy, mocha and whip cream.
        Beverage beverage3 = new HouseBlend();
        beverage3.setSize(Beverage.SIZE.SMALL);
        beverage3 = new SoyAddOn(beverage3);
        beverage3 = new MochaAddOn(beverage3);
        beverage3 = new WhipAddOn(beverage3);
        System.out.println(beverage3.getDescription() + " " + beverage3.getSize() + " $" + String.format("%.4f",beverage3.cost()));
    }
}
