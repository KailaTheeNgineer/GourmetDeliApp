package com.pluralsight;

import java.util.List;

public class SandwichBuilder extends Sandwich {
    public SandwichBuilder(String sizeSandwich, String breadType, String meatType, boolean extraMeat, String cheeseType, boolean extraCheese, boolean toasted, List<String> standardToppings, List<String> premiumToppings, List<String> condiments, double total) {
        super(sizeSandwich, breadType, extraMeat, cheeseType, extraCheese, toasted, meatType, standardToppings, premiumToppings, condiments, total);

    }



    }
