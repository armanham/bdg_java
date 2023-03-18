package com.bdg.h8.abstractclass_interface.exercise_6;

public class MBTAVehicle {

    public int number;

    public MBTAVehicle() {
    }

    public MBTAVehicle(int number) {
        if (number >= 0) {
            this.number = number;
        }
    }

    public int getNumber() {
        return number;
    }
}
