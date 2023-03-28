package com.bdg.h14_collections.exercises.priorityqueue_oddintegers;

import java.util.PriorityQueue;

//11.Using the Queue<T> class write a program to print  its first 50 members for
//given N.
//N = 1,3,5,7,9,...
public class PriorityQueueOddIntegers {

    private PriorityQueue<Integer> priorityQueue;

    public PriorityQueueOddIntegers(int lastOddNumber) {
        checkIsOdd(lastOddNumber);
        priorityQueue = new PriorityQueue<>();
        createQueue(lastOddNumber);
    }

    public int size(){
        return priorityQueue.size();
    }

    public PriorityQueue<Integer> getPriorityQueue() {
        return priorityQueue;
    }

    private void createQueue(int lastOddNumber) {
        for (int i = 1; i <= lastOddNumber; i = i + 2) {
            priorityQueue.add(i);
        }
    }

    private void checkIsOdd(int number) {
        if (number % 2 == 0 || number < 1) {
            throw new IllegalArgumentException("Passed number is not an odd number: ");
        }
    }
}