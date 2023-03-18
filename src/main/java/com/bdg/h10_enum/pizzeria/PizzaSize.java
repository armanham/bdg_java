package com.bdg.h10_enum.pizzeria;

public enum PizzaSize {

    SMALL(1), MEDIUM(1.5), LARGE(2);

    private double price;

    PizzaSize(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}