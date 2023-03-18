package com.bdg.h6_arrays;

import com.bdg.h6_arrays.CustomArrays;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CustomArraysTest {

    private CustomArrays arrays = new CustomArrays();

    @Test
    void sumTest() {
        assertArrayEquals(new int[]{3, 6, 8}, arrays.sum(new int[]{1, 2, 3}, new int[]{2, 4, 5}));
        assertArrayEquals(new int[]{}, arrays.sum(new int[]{}, new int[]{}));

        boolean thrown = false;
        try {
            arrays.sum(new int[]{}, new int[]{2, 4, 5});
        } catch (IllegalArgumentException ex) {
            thrown = true;
        }
        assertTrue(thrown);
    }

    @Test
    void countOfNumberInArrayTest() {
        assertEquals(3, arrays.countOfNumberInArray(4, new int[]{4, 3, 4, 65, 6, 0, 4, 1}));
        assertEquals(0, arrays.countOfNumberInArray(4, new int[]{3, 65, 6, 0, 1}));
        assertEquals(-1, arrays.countOfNumberInArray(4, new int[]{}));
    }

    @Test
    void nonRepeatingTripletsTest() {
        int[][] expected = new int[][]{{0, 0, 1}, {0, 1, 1}, {0, 1, 2},
                {0, 1, 3}, {1, 1, 2}, {1, 1, 3},
                {1, 2, 3}, {0, 0, 2}, {0, 0, 3}, {0, 2, 3}};
        int[] array = new int[]{1, 0, 0, 1, 2, 3};

        //TODO length<3
        assertEquals(expected, arrays.nonRepeatingTriplets(array));
    }

    @Test
    void isPresentTest() {
        int[][] matrix = new int[][]{{0, 0, 1}, {0, 1, 1}, {0, 1, 2},
                {0, 1, 3}, {1, 1, 2}, {1, 1, 3},
                {1, 2, 3}, {0, 0, 2}, {0, 0, 3}, {0, 2, 3}};

        assertTrue(arrays.isPresent(new int[]{1, 0, 0}, matrix));
        assertTrue(arrays.isPresent(new int[]{0, 0, 1}, matrix));
        assertFalse(arrays.isPresent(new int[]{0, 0, 5}, matrix));
        assertFalse(arrays.isPresent(new int[]{}, matrix));
        assertFalse(arrays.isPresent(new int[]{}, new int[][]{}));
        assertFalse(arrays.isPresent(new int[]{0, 0, 1}, new int[][]{}));
    }

    @Test
    void sortDescendingOrderTest() {
        int[] array = new int[]{1, 4, 2, 56, 0, -1, 3, 2};
        assertArrayEquals(new int[]{56, 4, 3, 2, 2, 1, 0, -1}, arrays.sortDescendingOrder(array));
        assertArrayEquals(new int[]{}, arrays.sortDescendingOrder(new int[]{}));
    }

    @Test
    void sortAscendingOrderTest() {
        int[] array = new int[]{1, 4, 2, 56, 0, -1, 3, 2};
        assertArrayEquals(new int[]{-1, 0, 1, 2, 2, 3, 4, 56}, arrays.sortAscendingOrder(array));
        assertArrayEquals(new int[]{}, arrays.sortAscendingOrder(new int[]{}));
    }

    @Test
    void sortOddElementsInTheEndTest() {
        int[] array = new int[]{1, 4, 2, 56, 0, -1, 3, 2};
        assertArrayEquals(new int[]{4, 2, 56, 0, 2, -1, 3, 1}, arrays.sortOddElementsInTheEnd(array));
        assertArrayEquals(new int[]{}, arrays.sortOddElementsInTheEnd(new int[]{}));
    }

    @Test
    void removeZerosTest() {
        int[] arrayWithZeros = new int[]{1, 4, 2, 0, 56, 0, -1, 3, 2};
        int[] arrayWithoutZeros = new int[]{1, 4, 2, 56, -1, 3, 2};
        assertArrayEquals(arrayWithoutZeros, arrays.removeZeros(arrayWithZeros));
        assertArrayEquals(arrayWithoutZeros, arrays.removeZeros(arrayWithoutZeros));
        assertArrayEquals(new int[]{}, arrays.removeZeros(new int[]{}));
    }

    @Test
    void longestNonDecreasingSequenceTest() {
        int[] array = new int[]{1, 4, 2, 0, 56, 0, -1, 3, 2};
        assertArrayEquals(new int[]{1, 4}, arrays.longestNonDecreasingSequence(array));
        assertArrayEquals(new int[]{}, arrays.longestNonDecreasingSequence(new int[]{}));
    }

    @Test
    void binaryToDecimalTest() {
        assertEquals(7, arrays.binaryToDecimal(new int[]{1, 1, 1}));

        boolean thrown = false;
        try {
            arrays.binaryToDecimal(new int[]{1, 3, 1});
        } catch (IllegalArgumentException ex) {
            thrown = true;
        }
        assertTrue(thrown);

        thrown = false;
        try {
            arrays.binaryToDecimal(new int[]{});
        } catch (IllegalArgumentException ex) {
            thrown = true;
        }
        assertTrue(thrown);
    }

    @Test
    void minElementOfTest() {
        assertEquals(5, arrays.minElementOf(new int[]{6, 12, 8, 5, 7}));
        assertEquals(-1, arrays.minElementOf(new int[]{2, -1, 0}));

        boolean thrown = false;
        try {
            arrays.minElementOf(new int[]{});
        }catch (IllegalArgumentException ex){
            thrown = true;
        }
        assertTrue(thrown);
    }

    @Test
    void maxElementOfTest() {
        assertEquals(12, arrays.maxElementOf(new int[]{6, 12, 8, 5, 7}));
        assertEquals(-1, arrays.maxElementOf(new int[]{-3, -1, -8}));

        boolean thrown = false;
        try {
            arrays.maxElementOf(new int[]{});
        }catch (IllegalArgumentException ex){
            thrown = true;
        }
        assertTrue(thrown);
    }

    @Test
    void invertMatrixToTheMainDiagonalTest() {

    }
}