package com.bdg.h13_collections.exercises.seventeen;

import java.util.ArrayList;

public class PositiveIntegerSequence {

    private ArrayList<Integer> sequence = new ArrayList<>();

    public PositiveIntegerSequence(int... elements) {
        createSequence(elements);
    }

    /**
     * This method calculates sum of the sequence.
     *
     * @return sum of the sequence.
     * @throws IllegalArgumentException, if sequence is empty.
     */
    public int sum() {
        if (sequence.isEmpty()) {
            throw new IllegalArgumentException("Sequence is empty: ");
        }

        int sum = 0;
        for (int item : sequence) {
            sum += item;
        }
        return sum;
    }

    /**
     * This method calculates average sum of the sequence.
     *
     * @return average sum of the sequence.
     */
    public double averageSum() {
        return (double) sum() / sequence.size();
    }

    public ArrayList<Integer> getSequence() {
        return sequence;
    }

    /**
     * This method add passed elements to sequence.
     * This method called in constructor.
     *
     * @param elements int...-type.
     * @throws IllegalArgumentException, if one of passed element is non-positive integer.
     */
    private void createSequence(int... elements) {
        for (int item : elements) {
            if (item <= 0) {
                throw new IllegalArgumentException("Elements must be positive integers: ");
            }
            sequence.add(item);
        }
    }
}