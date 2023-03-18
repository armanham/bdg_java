package com.bdg.h8.inheritance.exercise_3;

public class Vehicle {

    //ի նկատի ունեմ սարքին ա թե չէ;;;
    private boolean available;

    private Colors color;

    public Vehicle() {
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Colors getColor() {
        return color;
    }

    public void setColor(Colors color) {
        this.color = color;
    }

    public void move() {
        System.out.println("Vehicle's moving");
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "available=" + available +
                ", color='" + color +
                "}\n";
    }
}
