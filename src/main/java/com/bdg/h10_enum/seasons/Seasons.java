package com.bdg.h10_enum.seasons;

public enum Seasons {
    SPRING(10, 25),
    SUMMER(31, 45),
    FALL(26, 30),
    WINTER(-30, 9);

    private int minTemperature;
    private int maxTemperature;

    Seasons(int minTemperature, int maxTemperature) {
        this.minTemperature = minTemperature;
        this.maxTemperature = maxTemperature;
    }

    public int getMinTemperature() {
        return minTemperature;
    }

    public void setMinTemperature(int minTemperature) {
        this.minTemperature = minTemperature;
    }

    public int getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(int maxTemperature) {
        this.maxTemperature = maxTemperature;
    }
}