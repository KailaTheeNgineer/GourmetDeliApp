package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public abstract class Sandwich {
    protected String sizeSandwich; protected String breadType; protected String meatType; protected boolean extraMeat;
    protected String cheeseType; protected boolean extraCheese; protected boolean toasted;
    protected  List<String> standardToppings; protected  List<String> condiments; protected double total; protected int smallDrinkTotal = 2; protected double mediumDrinkTotal = 2.5;
    protected int largeDrinkTotal = 3; protected double chipTotal = 1.5; protected double breadTotal;
    protected double meatTotal; protected double extraMeatTotal; protected double cheeseTotal;
    protected double extraCheeseTotal;

    public Sandwich(String sizeSandwich, String breadType, String meatType, boolean extraMeat, String cheeseType, boolean extraCheese, boolean toasted, List<String> standardToppings, List<String> condiments, double total) {
        this.sizeSandwich = sizeSandwich;
        this.breadType = breadType;
        this.extraMeat = extraMeat;
        this.cheeseType = cheeseType;
        this.extraCheese = extraCheese;
        this.toasted = toasted;
        this.meatType = meatType;
        this.standardToppings = standardToppings;
        this.condiments = condiments;
        this.total = total;
    }

    public String getSizeSandwich() {
        return sizeSandwich;
    }

    public void setSizeSandwich(String sizeSandwich) {
        this.sizeSandwich = sizeSandwich;
    }

    public String getBreadType() {
        return breadType;
    }

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    public boolean isExtraMeat() {
        return extraMeat;
    }

    public void setExtraMeat(boolean extraMeat) {
        this.extraMeat = extraMeat;
    }

    public String getCheeseType() {
        return cheeseType;
    }

    public void setCheeseType(String cheeseType) {
        this.cheeseType = cheeseType;
    }

    public boolean isExtraCheese() {
        return extraCheese;
    }

    public void setExtraCheese(boolean extraCheese) {
        this.extraCheese = extraCheese;
    }

    public boolean isToasted() {
        return toasted;
    }

    public void setToasted(boolean toasted) {
        this.toasted = toasted;
    }

    public String getMeatType() {
        return meatType;
    }

    public void setMeatType(String meatType) {
        this.meatType = meatType;
    }

    public String printStandardToppings(List<String> input) {
        for (String standardToppings : input) {
            return standardToppings;
        }
        return null;
    }


    public List<String> getCondiments() {
        return condiments;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;

    }

    public double getSmallDrinkTotal() {
        return smallDrinkTotal;
    }

    public double getMediumDrinkTotal() {
        return mediumDrinkTotal;
    }

    public int getLargeDrinkTotal() {
        return largeDrinkTotal;
    }

    public double getChipTotal() {


        return chipTotal;
    }

    public double getBreadTotal(String input) {
        if (input.equals("4 inch")) {
            return 5.50;
        } else if (input.equals("8 inch")) {

            return 7;
        } else {
            return 8.5;
        }
    }

    public double getMeatTotal(String input) {
        if (input.equals("4 inch")) {
            return 1;
        } else if (input.equals("8 inch")) {

            return 2;
        } else if (input.equals("12 inch")){
            return 3;
        } else {
            return 0;
        }
    }

    public double getExtraMeatTotal(String input) {
        if (input.equals("4 inch")) {
            return .50;
        } else if (input.equals("8 inch")) {

            return 1;
        } else if (input.equals("12 inch")) {
            return 1.5;
        } else {
            return 0;
        }
    }

    public double getCheeseTotal(String input) {
        if (input.equals("4 inch")) {
            return .75;
        } else if (input.equals("8 inch")) {

            return 1.5;
        } else if (input.equals("12 inch")){
            return 2.25;
        } else {
            return 0;
        }
    }

    public double getExtraCheeseTotal(String input) {
        if (input.equals("4 inch")) {
            return .3;
        } else if (input.equals("8 inch")) {

            return .6;
        } else if (input.equals("12 inch")){
            return .9;
        } else {
            return 0;
        }
    }
}
