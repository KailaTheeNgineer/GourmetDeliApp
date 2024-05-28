package com.pluralsight;

public class Drink {

    protected String drinkSize; protected double drinktotal; protected String drinkFlavor;

    public Drink(String drinkSize, String drinkFlavor, double drinkotal) {
        this.drinkSize = drinkSize;
        this.drinkFlavor = drinkFlavor;
        this.drinktotal = drinktotal;
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

    public double getDrinktotal() {
        return drinktotal;
    }

    public void setDrinktotal(double drinktotal) {
        this.drinktotal = drinktotal;
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
