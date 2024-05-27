package com.pluralsight;

public class Chips {

    protected String chips; protected double chipTotal;

    public Chips(String chips, double chipTotal) {
        this.chips = chips;
        this.chipTotal = chipTotal;
    }

    public double getChipTotal() {
        return chipTotal;
    }

}
