package com.bdg.h8.abstractclass_interface.exercise_2;

public class Triangle extends Shape {

    @Override
    public void draw() {
        System.out.println("Draw triangle");
    }

    @Override
    public void erase() {
        System.out.println("Erase triangle");
    }
}
