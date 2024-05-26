package com.pluralsight;

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


}
