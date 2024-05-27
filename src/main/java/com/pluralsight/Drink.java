package com.pluralsight;

public class Drink {

    protected String drinkSize; protected double drinktotal;

    public Drink(String drinkSize, double drinktotal) {
        this.drinkSize = drinkSize;
        this.drinktotal = drinktotal;
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
        double drinkTotalCalculator = 0;
        if(userDrink.drinkSize.equals("small")) {
            return drinkTotalCalculator = 2;
        } else if (userDrink.drinkSize.equals("medium")) {
            return drinkTotalCalculator = 2.5;

        } else if (userDrink.drinkSize.equals("large")) {

            return drinkTotalCalculator = 3;
        } else {
            return 0;
        }

    }
}
