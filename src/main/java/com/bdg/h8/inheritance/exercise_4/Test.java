package com.bdg.h8.inheritance.exercise_4;

public class Test {

    public static void main(String[] args) {
        Car truck = new Truck(2,'A', 6);
        truck.setEngineType('B');
        System.out.println(truck.toString());
        Truck truck2 = new Truck(2,'A');
        System.out.println(truck2.toString());
    }
}
