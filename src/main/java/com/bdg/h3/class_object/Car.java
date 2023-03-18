package com.bdg.h3.class_object;

//Սահմանել Car class-ը, որը ունի
//●  fields (model, color, currentSpeed (default արժեքը 0), isEngineStart
//(true or false))
//●  methods (stopEngine() անջատում է մատոռը , startEngine()
//միացնում է մատոռը)
public class Car {

    private String model;

    private String color;

    private int currentSpeed;

    private boolean isEngineStart;

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public void startEngine() {
        isEngineStart = true;
    }

    public void stopEngine() {
        isEngineStart = false;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public boolean isEngineStart() {
        return isEngineStart;
    }
}
