package com.bdg.h9_enum.exercise_6;

public class Test {

    public static void main(String[] args) {
        Shape circle = ShapeType.CIRCLE.getShape();
        ((Circle)circle).setRadius(4);
        System.out.println(circle.getArea());
    }
}
