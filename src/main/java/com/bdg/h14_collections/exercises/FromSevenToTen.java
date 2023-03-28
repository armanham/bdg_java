package com.bdg.h14_collections.exercises;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class FromSevenToTen {

    public static void main(String[] args) {

        //7. Remove elements from a queue until it is empty.
        Queue<Integer> integerQueue = new LinkedList<>();
        integerQueue.add(1);
        integerQueue.add(2);
        integerQueue.add(3);
        integerQueue.add(4);
        integerQueue.add(5);
        while (!integerQueue.isEmpty()){
            System.out.println(integerQueue.remove());
        }

        System.out.println("-------------------------------");

        integerQueue.add(1);
        integerQueue.add(2);
        integerQueue.add(3);
        integerQueue.add(4);
        integerQueue.add(5);

        //9. Check if an element is present in a queue.
        System.out.println(integerQueue.contains(3));
        System.out.println(integerQueue.contains(10));

        System.out.println("-------------------------------");

        //8. Remove elements from a deque until it is empty.
        Deque<Integer> integerArrayDeque = new ArrayDeque<>();
        integerArrayDeque.add(1);
        integerArrayDeque.add(2);
        integerArrayDeque.add(3);
        integerArrayDeque.add(4);
        integerArrayDeque.add(5);
        integerArrayDeque.add(6);
        while (!integerArrayDeque.isEmpty()){
            System.out.println(integerArrayDeque.remove());
        }

        System.out.println("-------------------------------");

        integerArrayDeque.add(1);
        integerArrayDeque.add(2);
        integerArrayDeque.add(3);
        integerArrayDeque.add(4);
        integerArrayDeque.add(5);
        integerArrayDeque.add(6);

        //10. Check if an element is present in a deque.
        System.out.println(integerArrayDeque.contains(1));
        System.out.println(integerArrayDeque.contains(11));
    }
}