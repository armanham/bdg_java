package com.bdg.h14_collections.exercises;

import java.util.*;

public class FromOneToFive {

    public static void main(String[] args) {

        //1. Implement a queue using LinkedList and add elements to it.
        Queue<Integer> integerQueue = new LinkedList<>();
        integerQueue.add(1);
        integerQueue.add(2);
        integerQueue.add(3);
        System.out.println(integerQueue);

        //2. Implement a deque using LinkedList and add elements to it.
        Deque<Integer> integerDeque = new LinkedList<>();
        integerDeque.add(1);
        integerDeque.add(2);
        integerDeque.add(3);
        integerDeque.add(4);
        System.out.println(integerDeque);

        //3. Create a priority queue of integers and add elements to it.
        PriorityQueue<Integer> integerPriorityQueue = new PriorityQueue<>();
        integerPriorityQueue.add(2);
        integerPriorityQueue.add(10);
        integerPriorityQueue.add(1);
        integerPriorityQueue.add(0);
        integerPriorityQueue.add(2);
        integerPriorityQueue.add(-1);
        integerPriorityQueue.add(12);
        integerPriorityQueue.add(13);
        integerPriorityQueue.add(13);
        integerPriorityQueue.add(3);
        integerPriorityQueue.add(2);
        System.out.println(integerPriorityQueue);

        //4. Create a priority queue of strings and add elements to it.
        PriorityQueue<String> stringPriorityQueue = new PriorityQueue<>();
        stringPriorityQueue.add("Arman");
        stringPriorityQueue.add("Ani");
        stringPriorityQueue.add("Mane");
        stringPriorityQueue.add("John");
        stringPriorityQueue.add("Tony");
        System.out.println(stringPriorityQueue);

        //5. Create a deque using ArrayDeque and add elements to it.
        Deque<String> stringDeque = new ArrayDeque<>();
        stringDeque.add("Hello");
        stringDeque.add("Good");
        stringDeque.add("Bye");
        stringDeque.add("Cat");
        stringDeque.add("Dog");
        System.out.println(stringDeque);
    }
}
