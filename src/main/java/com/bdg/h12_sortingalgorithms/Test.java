package com.bdg.h12_sortingalgorithms;

public class Test {

    public static void main(String[] args) {
        Sort sort = new Sort();
        int[] sorted = sort.bubbleSort(new int[]{2, 6, 1, 0, 4});
        sort.printArray(sorted);

        int[] sorted1 = sort.selectionSort(new int[]{2, 6, 1, 0, 4});
        sort.printArray(sorted1);

        int[] sorted2 = sort.insertionSort(new int[]{2, 6, 1, 0, 4});
        sort.printArray(sorted2);
    }
}
