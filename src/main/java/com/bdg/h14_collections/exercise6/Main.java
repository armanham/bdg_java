package com.bdg.h14_collections.exercise6;

import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {

        PriorityQueue<Human> humans = new PriorityQueue<>();
        humans.add(new Human("Arman", 21));
        humans.add(new Human("Mane", 18));
        humans.add(new Human("Mari", 10));
        humans.add(new Human("Karen", 46));
        humans.add(new Human("Karine", 42));
        System.out.println(humans);
        System.out.println(humans.poll());
        System.out.println(humans.poll());
        System.out.println(humans.poll());
        System.out.println(humans.poll());
        System.out.println(humans.poll());
        System.out.println(humans.poll());
    }
}