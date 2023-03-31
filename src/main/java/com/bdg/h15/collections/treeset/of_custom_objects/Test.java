package com.bdg.h15.collections.treeset.of_custom_objects;

import java.util.TreeSet;

public class Test {

    public static void main(String[] args) {
        TreeSet<Human> humans = new TreeSet<>();
        humans.add(new Human("Bnay", 18));
        humans.add(new Human("Bobby", 90));
        humans.add(new Human("Patrick", 1));
        humans.add(new Human("Dummy", 20));
        humans.add(new Human("Reggie", 67));
        humans.add(new Human("Reggie", 8));
        humans.add(new Human("Fndo", 5));
        humans.add(new Human("Fndo", 5));
        humans.add(new Human("Fndo", 7));
        System.out.println(humans);


    }
}