package com.pluralsight;

public class Chips {

    protected String chipFlavor; protected double chipTotal;

    public Chips(String chipFlavor, double chipTotal) {
        this.chipFlavor = chipFlavor;
        this.chipTotal = chipTotal;
    }

    public double getChipTotal() {
        return chipTotal;
    }

}
