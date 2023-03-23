package com.bdg.h13_collections.integer_sequence;

import java.util.ArrayList;
import java.util.Collections;

public class IntegerSequence {

    private ArrayList<Integer> sequence = new ArrayList<>();

    public IntegerSequence(int... elements) {
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

    /**
     * This method sorts the sequence in increasing order.
     *
     * @throws IllegalArgumentException, if sequence is empty.
     */
    public void sort() {
        if (sequence.isEmpty()) {
            throw new IllegalArgumentException("Sequence is empty: ");
        }
        Collections.sort(sequence);
    }

    /**
     * This method determines is the member of the sequence on the passed index is negative or not.
     *
     * @param index int-type.
     * @return true, if the member of the sequence on passed index is negative, false otherwise.
     * @throws IndexOutOfBoundsException, if (index < 0 || index >= sequence.size()).
     */
    public boolean isNegativeInThe(int index) {
        if (index < 0 || index >= sequence.size()) {
            throw new IndexOutOfBoundsException();
        }
        return sequence.get(index) < 0;
    }

    /**
     * This method determines is the member of the sequence on the passed index is zero or not.
     *
     * @param index int-type.
     * @return true, if the member of the sequence on passed index is zero, false otherwise.
     * @throws IndexOutOfBoundsException, if (index < 0 || index >= sequence.size()).
     */
    public boolean isZeroInThe(int index) {
        if (index < 0 || index >= sequence.size()) {
            throw new IndexOutOfBoundsException();
        }
        return sequence.get(index) == 0;
    }

    /**
     * This method determines is the passed element in sequence occurs odd time, or not.
     *
     * @param element int-type.
     * @return true, if the specified element in the sequence occurs odd time, false otherwise.
     * @throws IllegalArgumentException, if sequence is empty.
     */
    public boolean isOddFrequencyOf(int element) {
        if (sequence.isEmpty()) {
            throw new IllegalArgumentException("Sequence is empty: ");
        }
        return Collections.frequency(sequence, element) % 2 != 0;
    }

    /**
     * This method removes elements from sequence, if they occur in the sequence odd time.
     *
     * @return true, if at least one element has been removed, false otherwise.
     * @throws IllegalArgumentException, if sequence is empty.
     */
    public boolean removeMembersWithOddFrequency() {
        if (sequence.isEmpty()) {
            throw new IllegalArgumentException("Sequence is empty: ");
        }
        return sequence.removeIf(this::isOddFrequencyOf);
    }

    /**
     * This method removes negative integer numbers from sequence.
     *
     * @return true, if at least one element has been removed,
     * false if none of the elements have been removed.
     * @throws IllegalArgumentException, if sequence is empty.
     */
    public boolean removeNegatives() {
        if (sequence.isEmpty()) {
            throw new IllegalArgumentException("Sequence is empty: ");
        }

        for (int i = 0; i < sequence.size(); i++) {
            if (isNegativeInThe(i)) {
                sequence.remove(i);
            } else {
                return false;
            }
        }
        return true;
    }

    public ArrayList<Integer> getSequence() {
        return sequence;
    }

    /**
     * This method add passed elements to sequence.
     * This method called in constructor.
     *
     * @param elements int...-type.
     */
    private void createSequence(int... elements) {
        for (int item : elements) {
            sequence.add(item);
        }
    }
}