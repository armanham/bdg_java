package com.bdg.h6_arrays;

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
        assertArrayEquals(expected, arrays.nonRepeatingTriplets(array));

        boolean thrown = false;
        try {
            arrays.nonRepeatingTriplets(new int[]{1, 2});
        } catch (IllegalArgumentException ex) {
            thrown = true;
        }
        assertTrue(thrown);
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
        } catch (IllegalArgumentException ex) {
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
        } catch (IllegalArgumentException ex) {
            thrown = true;
        }
        assertTrue(thrown);
    }

    @Test
    void invertMatrixToTheMainDiagonalTest() {
        int[][] matrix = new int[][]{
                {1, 2, 3, 0},
                {2, 3, 4, 7},
                {1, 3, 5, 5},
                {2, 3, 4, 5}};
        int[][] expected = new int[][]{
                {1, 2, 1, 2},
                {2, 3, 3, 3},
                {3, 4, 5, 4},
                {0, 7, 5, 5}
        };

        assertArrayEquals(expected, arrays.invertMatrixToTheMainDiagonal(matrix));
        assertNull(arrays.invertMatrixToTheMainDiagonal(new int[][]{
                {1, 2, 3, 0},
                {2, 3, 4, 7},
                {1, 3, 5, 5}
        }));
        assertNull(arrays.invertMatrixToTheMainDiagonal(new int[][]{
                {1, 2, 3, 0},
                {2, 3, 4},
                {1, 3, 5, 5},
                {2, 3, 4, 5}
        }));
        assertNull(arrays.invertMatrixToTheMainDiagonal(new int[][]{
                {},
                {}
        }));
    }

    @Test
    void isTheSumOfElementsOfAnyRowsEvenTest() {
        assertTrue(arrays.isTheSumOfElementsOfAnyRowsEven(new int[][]{
                {1, 2, 3, 0},
                {2, 3, 4, 7},
                {1, 3, 5, 5},
                {2, 3, 4, 5}}));
        assertFalse(arrays.isTheSumOfElementsOfAnyRowsEven(new int[][]{
                {1, 2, 3, 5},
                {2, 3, 4, 7},
                {1, 3, 5, 5},
                {2, 3, 4, 5}}));

        boolean thrown = false;
        try {
            arrays.isTheSumOfElementsOfAnyRowsEven(new int[][]{
                    {1, 2, 3, 0},
                    {2, 2},
                    {1, 3, 5, 5},
                    {2, 3, 4, 5}});
        } catch (IllegalArgumentException ex) {
            thrown = true;
        }
        assertTrue(thrown);
    }

    @Test
    void sumOfPrincipalDiagonalTest() {
        assertEquals(13, arrays.sumOfPrincipalDiagonal(new int[][]{
                {1, 2, 3, 0},
                {2, 2, 0, 1},
                {1, 3, 5, 5},
                {2, 3, 4, 5}}));

        boolean thrown = false;
        try {
            arrays.sumOfPrincipalDiagonal(new int[][]{
                    {1, 2, 3, 0},
                    {2, 2},
                    {1, 3, 5, 5},
                    {2, 3, 4, 5}});
        } catch (IllegalArgumentException ex) {
            thrown = true;
        }
        assertTrue(thrown);

        thrown = false;
        try {
            arrays.sumOfPrincipalDiagonal(new int[][]{
                    {},
            });
        } catch (IllegalArgumentException ex) {
            thrown = true;
        }
        assertTrue(thrown);
    }

    @Test
    void sumOfSecondaryDiagonalTest() {
        assertEquals(5, arrays.sumOfSecondaryDiagonal(new int[][]{
                {1, 2, 3, 0},
                {2, 2, 0, 1},
                {1, 3, 5, 5},
                {2, 3, 4, 5}}));

        boolean thrown = false;
        try {
            arrays.sumOfSecondaryDiagonal(new int[][]{
                    {1, 2, 3, 0},
                    {2, 2},
                    {1, 3, 5, 5},
                    {2, 3, 4, 5}});
        } catch (IllegalArgumentException ex) {
            thrown = true;
        }
        assertTrue(thrown);

        thrown = false;
        try {
            arrays.sumOfSecondaryDiagonal(new int[][]{
                    {},
            });
        } catch (IllegalArgumentException ex) {
            thrown = true;
        }
        assertTrue(thrown);
    }

    @Test
    void isSquareMatrixTest() {
        assertTrue(arrays.isSquareMatrix(new int[][]{
                {1, 2, 3, 0},
                {2, 2, 0, 1},
                {1, 3, 5, 5},
                {2, 3, 4, 5}}));

        assertFalse(arrays.isSquareMatrix(new int[][]{
                {1, 2, 3, 0},
                {0, 1},
                {1, 3, 5, 5},
                {2, 3, 4, 5}}));

        assertFalse(arrays.isSquareMatrix(new int[][]{}));
    }
}