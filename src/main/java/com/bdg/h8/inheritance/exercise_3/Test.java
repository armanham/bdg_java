package com.bdg.h8.inheritance.exercise_3;

public class Test {

    public static void main(String[] args) {
        Automobile bmw = new BMW(AutomobileModels.BMW, true, 4, 4, Colors.BLACK, 300);
        System.out.println(bmw.toString());
        bmw.move();
        System.out.println(bmw.isAvailable());
    }
}
