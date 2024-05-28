package com.pluralsight;

public class Drink {

    protected String drinkSize; protected double drinkTotal; protected String drinkFlavor;

    public Drink(String drinkSize, String drinkFlavor, double drinkTotal) {
        this.drinkSize = drinkSize;
        this.drinkFlavor = drinkFlavor;
        this.drinkTotal = drinkTotal;
    }

    public String getDrinkFlavor() {
        return drinkFlavor;
    }

    public void setDrinkFlavor(String drinkFlavor) {
        this.drinkFlavor = drinkFlavor;
    }

    public String getDrinkSize() {
        return drinkSize;
    }

    public void setDrinkSize(String drinkSize) {
        this.drinkSize = drinkSize;
    }

    public double getDrinkTotal() {
        return drinkTotal;
    }

    public void setDrinkTotal(double drinkTotal) {
        this.drinkTotal = drinkTotal;
    }

    public static double getDrinkTotal(Drink userDrink){
        if(userDrink.drinkSize.equalsIgnoreCase("small")) {
            return 2;
        } else if (userDrink.drinkSize.equalsIgnoreCase("medium")) {
            return   2.5;

        } else if (userDrink.drinkSize.equalsIgnoreCase("large")) {

            return 3;
        } else {
            return 0;
        }

    }
}
