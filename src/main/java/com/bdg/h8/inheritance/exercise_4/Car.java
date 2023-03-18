package com.bdg.h8.inheritance.exercise_4;

public class Car {

    private int passengerCount;

    private Character engineType;

    public Car() {
    }

    public Car(int passengerCount, Character engineType) {
        this.setPassengerCount(passengerCount);
        this.setEngineType(engineType);
    }


    public int getPassengerCount() {
        return passengerCount;
    }

    public void setPassengerCount(int passengerCount) {
        if (passengerCount > 1) {
            this.passengerCount = passengerCount;
        } else {
            this.passengerCount = 2;  //
        }
    }

    public Character getEngineType() {
        return engineType;
    }

    public void setEngineType(Character engineType) {
        if (Character.isAlphabetic(engineType)) {
            this.engineType = engineType;
        } else {
            System.out.println("Wrong engineType:");
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "passengerCount=" + passengerCount +
                ", engineType=" + engineType +
                "}\n";
    }
}
