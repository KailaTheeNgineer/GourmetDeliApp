package com.pluralsight;

import java.util.ArrayList;

// Converter class carrying methods for catching errors
public class Converter {

    static String convertIntToBread(String input) {
        switch (input) {
            case "1", "white":
                return "White";
            case "2", "wheat":
                return "Wheat";
            case "3", "rye":
                return "Rye";
            case "4", "wrap":
                return "Wrap";
            default:
                return "Bread not recognized";
        }

    }

    static String convertIntToSize(String input) {
        switch (input) {
            case "1", "4 in", "4 inch", "4":
                return "4 inch";
            case "2", "8 in", "8 inch", "8":
                return "8 inch";
            case "3", "12 in", "12 inch", "12":
                return "12 inch";
            default:
                return "Size not recognized";
        }

    }

    static String convertIntToMeatType(String input) {
        switch (input) {
            case "1", "steak":
                return "Steak";
            case "2", "ham":
                return "Ham";
            case "3", "salami":
                return "Salami";
            case "4", "roast beef", "roastbeef":
                return "Roast Beef";
            case "5", "chicken":
                return "Chicken";
            case "6", "bacon":
                return "Bacon";
            case "7", "continue":
                return "No meat";
            default:
                return "Meat not recognized";
        }

    }

    static String convertIntToCheeseType(String input) {
        switch (input) {
            case "1", "american":
                return "American";
            case "2", "provolone":
                return "Provolone";
            case "3", "cheddar":
                return "Cheddar";
            case "4", "swiss":
                return "Swiss";
            case "5", "continue":
                return "No Cheese";
            default:
                return "Cheese not recognized";
        }

    }

    static boolean convertValueToBool(String input) {
        switch (input) {
            case "y", "yes", "ye":
                return true;
            case "n", "No":
                return false;
            default:
                return false;
        }

    }

    static String convertStringToDrink(String input) {
        switch (input) {
            case "1", "small":
                return "Small";
            case "2", "medium":
                return "Medium";
            case "3", "large":
                return "Large";
            default:
                return "Drink Size not recognized";
        }


    }

    static String convertStringToChip(String input) {
        switch (input) {
            case "1", "doritos":
                return "Doritos";
            case "2", "classic potato chips":
                return "Classic Potato Chips";
            case "3", "cheetos":
                return "Cheetos";
            default:
                return "Chip Flavor not recognized";
        }
    }

    static String convertStringToDrinkFlavor(String input) {
        switch (input) {
            case "1", "pepsi":
                return "Pepsi";
            case "2", "sprite":
                return "Sprite";
            case "3", "sweet tea":
                return "Sweet Tea";
            case "4", "water":
                return "Water";
            default:
                return "Drink Flavor not recognized";
        }

    }
     static double addReceiptTotal(ArrayList<Double> orderTotal) {
        double sum1 = 0.0;
        for (double number : orderTotal) {

            sum1 += number;
        }
        return sum1;

    }
    }



