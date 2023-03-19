package com.bdg.h12.fibonacci;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

    private List<Integer> fibonacciSequence = new ArrayList<>();

    public Fibonacci(int toIndex) {
        sequenceTo(toIndex);
    }

    /**
     * This method calculates the sum of members of sequence.
     *
     * @return sum of sequence.
     */
    public int sum() {
        int sum = 0;
        for (int item : fibonacciSequence) {
            sum += item;
        }
        return sum;
    }


    /**
     * This method determines is the passed number member of sequence or not.
     *
     * @param number int-type.
     * @return true, if passed number is member of sequence, false otherwise.
     */
    public boolean isMember(int number) {
        if (number < 0 || number > fibonacciSequence.get(fibonacciSequence.size() - 1)) {
            return false;
        }

        for (int item : fibonacciSequence) {
            if (number == item) {
                return true;
            }
        }
        return false;
    }


    public int getBy(int index) {
        return fibonacciSequence.get(index);
    }


    /**
     * This method generates Fibonacci's sequence.
     *
     * @param index int-type. Non-inclusive.
     * @return sequence from index 0 to passed index-1.
     */
    private List<Integer> sequenceTo(int index) {
        if (index < 0) {
            System.out.println("Minimum index is 0: ");
            return null;
        }

        fibonacciSequence.add(0);
        if (index == 0) {
            return fibonacciSequence;
        }

        fibonacciSequence.add(1);
        if (index == 1) {
            return fibonacciSequence;
        }

        for (int i = 2; i < index; i++) {
            fibonacciSequence.add(fibonacciSequence.get(i - 1) + fibonacciSequence.get(i - 2));
        }
        return fibonacciSequence;
    }

    public List<Integer> getFibonacciSequence() {
        return fibonacciSequence;
    }
}