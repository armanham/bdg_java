package com.bdg.h12_sortingalgorithms;

public class Sort {

    public int[] bubbleSort(int[] array) throws IllegalArgumentException {
        if (array.length == 0) {
            throw new IllegalArgumentException("Passed an empty array: ");
        }

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }


    public int[] selectionSort(int[] array) throws IllegalArgumentException {
        if (array.length == 0) {
            throw new IllegalArgumentException("Passed an empty array: ");
        }

        for (int i = 0; i < array.length - 1; i++) {
            int currentMinimumIndex = i;
            for (int j = i + 1; j < array.length; j++)
                if (array[j] < array[currentMinimumIndex]) {
                    currentMinimumIndex = j;
                }

            int temp = array[currentMinimumIndex];
            array[currentMinimumIndex] = array[i];
            array[i] = temp;
        }
        return array;
    }


    public int[] insertionSort(int[] array) throws IllegalArgumentException {
        if (array.length == 0) {
            throw new IllegalArgumentException("Passed an empty array: ");
        }

        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > current) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = current;
        }
        return array;
    }

    public void printArray(int[] array) {
        for (int item : array) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}