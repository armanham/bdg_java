package com.bdg.h8.inheritance.exercise_3;

public class Automobile extends Vehicle {

    private int countOfWheels;

    private int countOfDoors;

    private int horsePower;

    private boolean engineRunning;

    public Automobile() {
    }

    public int getCountOfWheels() {
        return countOfWheels;
    }

    public void setCountOfWheels(int countOfWheels) {
        if (countOfWheels > 3) {
            this.countOfWheels = countOfWheels;
        } else {
            System.out.println("Automobile must have 4 and more wheels:");
        }
    }

    public int getCountOfDoors() {
        return countOfDoors;
    }

    public void setCountOfDoors(int countOfDoors) {
        if (countOfDoors > 3) {
            this.countOfDoors = countOfDoors;
        } else {
            System.out.println("Automobile must have 2 and more wheels:");
        }
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        if (horsePower >= 50) {
            this.horsePower = horsePower;
        } else {
            System.out.println("Automobile must have 50 and + hosePower:");
        }
    }

    @Override
    public boolean isAvailable() {
        return super.isAvailable();
    }

    @Override
    public void setAvailable(boolean available) {
        super.setAvailable(available);
    }

    @Override
    public Colors getColor() {
        return super.getColor();
    }

    @Override
    public void setColor(Colors color) {
        super.setColor(color);
    }

    public void startEngine() {
        this.engineRunning = true;
    }

    public void stopEngine() {
        this.engineRunning = false;
    }

    public boolean isCoupeOrNot() {
        if (this.countOfDoors == 2) {
            return true;
        }
        return false;
    }

    @Override
    public void move() {
        System.out.println("Automobile's moving");
    }

    @Override
    public String toString() {
        return super.toString() + "Automobile{" +
                "countOfWheels=" + countOfWheels +
                ", countOfDoors=" + countOfDoors +
                ", horsePower=" + horsePower +
                ", engineRunning=" + engineRunning +
                "}\n";
    }
}
