package com.bdg.h9_enum.exercise_6;

public class Square extends Shape {

    private double side;

    public Square() {
    }

    public Square(double side) {
        if (side > 0) {
            this.side = side;
        }
    }

    @Override
    double getPerimeter() {
        return 4 * side;
    }

    @Override
    double getArea() {
        return Math.pow(side, 2);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
