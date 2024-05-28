package com.pluralsight;

import java.util.List;

public class SandwichBuilder extends Sandwich {
    public SandwichBuilder(String sizeSandwich, String breadType, String meatType, boolean extraMeat, String cheeseType, boolean extraCheese, boolean toasted, List<String> standardToppings, List<String> condiments, String side, double total) {
        super(sizeSandwich, breadType, meatType, extraMeat, cheeseType, extraCheese, toasted, standardToppings, condiments, side, total);
    }

    }
