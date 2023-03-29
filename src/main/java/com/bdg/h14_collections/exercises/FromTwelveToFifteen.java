package com.bdg.h14_collections.exercises;

import java.util.Collections;
import java.util.PriorityQueue;

public class FromTwelveToFifteen {

    public static void main(String[] args) {

        //12.Write a Java program to create a new priority queue, add some colors (string)
        //and print out the elements of the priority queue.

        PriorityQueue<String> colors = new PriorityQueue<>();
        colors.add("Black");
        colors.add("White");
        colors.add("Red");
        colors.add("Orange");
        colors.add("Green");
        colors.add("Brown");

        System.out.println(colors);

        System.out.println("----------------------------------");

        //13.Write a Java program to add all the elements of a priority queue to another
        //priority queue.
        PriorityQueue<String> colors2 = new PriorityQueue<>(colors);
        System.out.println(colors2);

        PriorityQueue<String> colors3 = new PriorityQueue<>();
        colors3.addAll(colors);
        System.out.println(colors3);

        System.out.println("----------------------------------");

        //14.Write a Java program to retrieve and remove the first element.
        while (!colors3.isEmpty()){
            System.out.println(colors3.remove());
        }

        System.out.println("----------------------------------");

        //15.Write a Java program to change priorityQueue to maximum priorityqueue.
        PriorityQueue<String> colors4 = new PriorityQueue<>(Collections.reverseOrder());
        colors4.add("Black");
        colors4.add("White");
        colors4.add("Red");
        colors4.add("Orange");
        colors4.add("Green");
        colors4.add("Brown");
        while (!colors4.isEmpty()){
            System.out.println(colors4.remove());
        }
    }
}