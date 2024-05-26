package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public abstract class Sandwich {
    protected String sizeSandwich; protected String breadType; protected boolean extraMeat;
    protected String cheeseType; protected boolean extraCheese; protected boolean toasted; protected String meatType;
    protected  List<String> standardToppings; protected  List<String> premiumToppings;
    protected  List<String> condiments; protected double total;

    public Sandwich(String sizeSandwich, String breadType, boolean extraMeat, String cheeseType, boolean extraCheese, boolean toasted, String meatType, List<String> standardToppings, List<String> premiumToppings, List<String> condiments, double total) {
        this.sizeSandwich = sizeSandwich;
        this.breadType = breadType;
        this.extraMeat = extraMeat;
        this.cheeseType = cheeseType;
        this.extraCheese = extraCheese;
        this.toasted = toasted;
        this.meatType = meatType;
        this.standardToppings = standardToppings;
        this.premiumToppings = premiumToppings;
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

    public List<String> getStandardToppings() {
        return standardToppings;
    }

    public void setStandardToppings(List<String> standardToppings) {
        this.standardToppings = standardToppings;
    }

    public List<String> getPremiumToppings() {
        return premiumToppings;
    }

    public void setPremiumToppings(List<String> premiumToppings) {
        this.premiumToppings = premiumToppings;
    }

    public List<String> getCondiments() {
        return condiments;
    }

    public void setCondiments(List<String> condiments) {
        this.condiments = condiments;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }


}
