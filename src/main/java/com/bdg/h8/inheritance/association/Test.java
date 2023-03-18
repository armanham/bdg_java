package com.bdg.h8.inheritance.association;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        Door door1 = new Door("DSP", 1.90, 0.9);
        Door door2 = new Door("MVP", 1.87, 0.9);
        Door door3 = new Door("WOOD", 2.0, 1.0);
        Door door4 = new Door("DSP", 1.90, 0.8);

        List<Door> doors = new ArrayList<>(List.of(door1, door2, door3, door4));

        Human human1 = new Human("Arman", "Hambardzumyan", Gender.MALE, 21);
        Human human2 = new Human("Tatul", "Poghosyan", Gender.MALE, 21);
        Human human3 = new Human("Areg", "Hovhannisyan", Gender.MALE, 19);

        List<Human> humans = new ArrayList<>(List.of(human1, human2, human3));

        Home home = new Home(2, doors, humans);
        System.out.println(home);

    }
}
