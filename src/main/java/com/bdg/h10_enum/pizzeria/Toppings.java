package com.bdg.h10_enum.pizzeria;

public enum Toppings {

    PEPPERONI(1), MUSHROOMS(1.2), ONIONS(2),
    SAUSAGE(1.5), BACON(2), CHEESE(2.5), CHICKEN(2.2);

    private double price;

    Toppings(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}