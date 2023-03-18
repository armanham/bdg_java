package com.bdg.h8.inheritance.association;

import java.util.List;

public class Home {

    private int countOfFloor;

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    //Home class with Human and Door classes -- Aggregation
    private List<Door> doors;    //One-Home ---- Many-Doors ... Home "has a" door   one to many relation

    private List<Human> humans;  //One-Home ---- Many-Humans ... Home "has a" human   one to many relation

    public Home() {
    }

    public Home(int countOfFloor, List<Door> doors, List<Human> humans) {
        this.countOfFloor = countOfFloor;
        this.doors = doors;
        this.humans = humans;
    }

    public int getCountOfFloor() {
        return countOfFloor;
    }

    public void setCountOfFloor(int countOfFloor) {
        this.countOfFloor = countOfFloor;
    }

    public List<Door> getDoors() {
        return doors;
    }

    public void setDoors(List<Door> doors) {
        this.doors = doors;
    }

    public List<Human> getHumans() {
        return humans;
    }

    public void setHumans(List<Human> humans) {
        this.humans = humans;
    }

    @Override
    public String toString() {
        return "Home{" +
                "countOfFloor=" + countOfFloor +
                ", doors=" + doors +
                ", humans=" + humans +
                "}\n";
    }
}
