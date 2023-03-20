package com.bdg.h12.sortingalgorithms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SortTest {

    private Sort sort = new Sort();

    @Test
    void bubbleSortTest() {
        Assertions.assertArrayEquals(new int[]{-8, 0, 1, 3, 7}, sort.bubbleSort(new int[]{0, 3, 1, 7, -8}));
        Assertions.assertArrayEquals(new int[]{}, sort.bubbleSort(new int[]{}));
    }

    @Test
    void selectionSortTest() {
        Assertions.assertArrayEquals(new int[]{-8, 0, 1, 3, 7}, sort.selectionSort(new int[]{0, 3, 1, 7, -8}));
        Assertions.assertArrayEquals(new int[]{}, sort.selectionSort(new int[]{}));
    }

    @Test
    void insertionSortTest() {
        Assertions.assertArrayEquals(new int[]{-8, 0, 1, 3, 7}, sort.insertionSort(new int[]{0, 3, 1, 7, -8}));
        Assertions.assertArrayEquals(new int[]{}, sort.insertionSort(new int[]{}));
    }
}