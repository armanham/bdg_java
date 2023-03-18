package com.bdg.h8.inheritance.exercise_3;

public class BMW extends Automobile {

    private AutomobileModels model;

    public BMW() {
    }

    public BMW(AutomobileModels model,
               boolean available,
               int countOfDoors,
               int countOfWheels,
               Colors color,
               int horsePower) {
        this.model = model;
        this.setAvailable(available);
        this.setCountOfDoors(countOfDoors);
        this.setCountOfWheels(countOfWheels);
        this.setColor(color);
        this.setHorsePower(horsePower);
    }

    @Override
    public int getCountOfWheels() {
        return super.getCountOfWheels();
    }

    @Override
    public void setCountOfWheels(int countOfWheels) {
        super.setCountOfWheels(countOfWheels);
    }

    @Override
    public int getCountOfDoors() {
        return super.getCountOfDoors();
    }

    @Override
    public void setCountOfDoors(int countOfDoors) {
        super.setCountOfDoors(countOfDoors);
    }

    @Override
    public int getHorsePower() {
        return super.getHorsePower();
    }

    @Override
    public void setHorsePower(int horsePower) {
        super.setHorsePower(horsePower);
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

    public AutomobileModels getModel() {
        return model;
    }

    @Override
    public void startEngine() {
        super.startEngine();
    }

    @Override
    public void stopEngine() {
        super.stopEngine();
    }

    @Override
    public boolean isCoupeOrNot() {
        return super.isCoupeOrNot();
    }

    @Override
    public void move() {
        System.out.println("BMW's moving");
    }

    @Override
    public String toString() {
        return super.toString() + "BMW{" +
                "model=" + model +
                "}\n";
    }
}
