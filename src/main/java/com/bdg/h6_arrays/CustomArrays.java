package com.bdg.h6_arrays;

import com.bdg.h12.sortingalgorithms.Sort;
import com.bdg.h5_algorithmic_exercises.AlgorithmicExercises;

import java.util.Arrays;

public class CustomArrays {

    /**
     * This method prints positive numbers of array.
     *
     * @param array int[] array.
     */
    public void printPositiveNumbers(int[] array) {
        if (array.length == 0) {
            System.out.println("Passed array has no elements: ");
            return;
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                System.out.print(array[i] + "; ");
            }
        }
    }


    /**
     * This method prints array in reversed order.
     *
     * @param array short[] array.
     */
    public void printReversedArray(short[] array) {
        if (array.length == 0) {
            System.out.println("Passed array has no elements: ");
            return;
        }

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + "; ");
        }
    }


    /**
     * This method finds ant prints the largest number of array.
     *
     * @param array long[] array.
     */
    public void printLargestNumber(long[] array) {
        if (array.length == 0) {
            System.out.println("Passed array has no elements: ");
            return;
        }

        long max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println(max);
    }


    /**
     * This method finds ant prints the smallest number of array.
     *
     * @param array float[] array.
     */
    public void printSmallestNumber(float[] array) {
        if (array.length == 0) {
            System.out.println("Passed array has no elements: ");
            return;
        }

        float min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println(min);
    }


    /**
     * This method moves elements of an array to another array.
     * There is no changes to the original array after the move.
     *
     * @param array    int[] array, original array.
     * @param newArray int[] array, new array after the move.
     * @throws IllegalArgumentException if lengths of passed arrays are not equals.
     */
    public void moveElementsToAnotherArray(int[] array, int[] newArray) throws IllegalArgumentException {
        if (array.length == 0) {
            System.out.println("The original array has no elements: ");
            return;
        }
        if (array.length != newArray.length) {
            throw new IllegalArgumentException("Lengths of passed arrays must be equals: ");
        }

        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
    }


    /**
     * This method calculates sum of corresponding elements of two arrays,
     * and moves already added elements to third array.
     *
     * @param array1 int[] array.
     * @param array2 int[] array.
     * @return the sum array of array1 and array2.
     * @throws IllegalArgumentException if lengths of passed arrays are not equals.
     */
    public int[] sum(int[] array1, int[] array2) throws IllegalArgumentException {
        if (array1.length == 0 && array2.length == 0) {
            return array1;
        }
        if (array1.length != array2.length) {
            throw new IllegalArgumentException("Lengths of passed arrays must be equals: ");
        }

        int[] sumOfArrays = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            sumOfArrays[i] = array1[i] + array2[i];
        }
        return sumOfArrays;
    }


    /**
     * This method counts how many times a given number occurs in an array.
     *
     * @param array  int[] array.
     * @param number int number.
     * @return count of how many times the given number occurs in the array.
     * -1 if passed array has no elements.
     */
    public int countOfNumberInArray(int number, int[] array) {
        if (array.length == 0) {
            return -1;
        }

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (number == array[i]) {
                count++;
            }
        }
        return count;
    }


    /**
     * This method prints all non-repeating triplets in array.
     *
     * @param array int[] array.
     * @return non-repeating triplets in array.
     * @throws IllegalArgumentException if passed array do not have three and more elements.
     */
    public int[][] nonRepeatingTriplets(int[] array) throws IllegalArgumentException {
        if (array.length < 3) {
            throw new IllegalArgumentException("Passed array must have three and more elements: ");
        }

        int countOfZeros = countOfNumberInArray(0, array);

        AlgorithmicExercises ae = new AlgorithmicExercises();
        int possibleCountOfRows = (int) (ae.factorialOf(array.length) /
                (ae.factorialOf(array.length - 3) * ae.factorialOf(3)));
        int[] arrayOfThree = new int[3];
        int[][] nonRepeatingMatrix = new int[possibleCountOfRows][3];

        int countOfRows = 0;
        if (countOfZeros >= 3) {
            countOfRows = 1;
        }

        for (int i = 0; i < array.length - 2; i++) {
            for (int j = i + 1; j < array.length - 1; j++) {
                for (int k = j + 1; k < array.length; k++) {
                    arrayOfThree[0] = array[i];
                    arrayOfThree[1] = array[j];
                    arrayOfThree[2] = array[k];
                    if (!isPresent(arrayOfThree, nonRepeatingMatrix)) {
                        nonRepeatingMatrix[countOfRows] = arrayOfThree;
                        countOfRows++;
                        arrayOfThree = new int[3];
                    }
                }
            }
        }

        int[][] nonRepeatingMatrixWithoutZeros = new int[countOfRows][3];
        for (int i = 0; i < countOfRows; i++) {
            for (int j = 0; j < 3; j++) {
                nonRepeatingMatrixWithoutZeros[i][j] = nonRepeatingMatrix[i][j];
            }
        }
        return nonRepeatingMatrixWithoutZeros;
    }


    /**
     * This method determines is the passed array presents in the matrix.
     * The order doesn't matter.
     *
     * @param array  int[] array.
     * @param matrix int[][] matrix.
     * @return true if the array presents in the matrix, false otherwise.
     */
    public boolean isPresent(int[] array, int[][] matrix) {
        if (array.length == 0 || matrix.length == 0 || matrix[0].length == 0) {
            System.out.println("Passed array and matrix must have elements:");
            return false;
        }

        int quantity = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (Arrays.equals(sortAscendingOrder(array), sortAscendingOrder(matrix[i]))) {
                quantity++;
            }
        }
        return quantity != 0;
    }


    /**
     * This method sorts the array in descending order.
     *
     * @param array int[] array.
     * @return array already sorted in descending order.
     */
    public int[] sortDescendingOrder(int[] array) {
        if (array.length == 0) {
            System.out.println("Passed array has no elements:");
            return array;
        }

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }


    /**
     * This method sorts the array in ascending order.
     *
     * @param array int[] array.
     * @return array already sorted in ascending order.
     */
    public int[] sortAscendingOrder(int[] array) {
        if (array.length == 0) {
            System.out.println("Passed array has no elements:");
            return array;
        }

        Sort sort = new Sort();
        return sort.bubbleSort(array);
    }


    /**
     * This method moves odd elements in the end of array.
     *
     * @param array int[] array.
     * @return already sorted array: odd elements already moved in the end.
     */
    public int[] sortOddElementsInTheEnd(int[] array) {
        if (array.length == 0) {
            System.out.println("Passed array has no elements:");
            return array;
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] % 2 == 0 && array[j] % 2 != 0) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }


    /**
     * This method removes zeros from an array.
     *
     * @param array int[] array.
     * @return new array from original, without zeros.
     */
    public int[] removeZeros(int[] array) {
        if (array.length == 0) {
            System.out.println("Passed array has no elements:");
            return array;
        }

        int countOfNoZeros = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                countOfNoZeros++;
            }
        }

        if (countOfNoZeros == array.length) {
            System.out.println("There is no zeros in passed array: ");
            return array;
        }

        int[] newArray = new int[countOfNoZeros];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (array[i] != 0) {
                newArray[j] = array[i];
                j++;
            }
        }
        return newArray;
    }


    /**
     * This method finds the first longest sequence in non-decreasing order of array.
     *
     * @param array int[] array.
     * @return new array of the longest sequence in non-decreasing order of array.
     */
    public int[] longestNonDecreasingSequence(int[] array) {
        if (array.length == 0) {
            System.out.println("Passed array has no elements:");
            return array;
        }
        if (array.length == 1) {
            return array;
        }

        int countOfNonDesc = 0;
        int longestCountNonDesc = 1;
        int startIndex = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] <= array[i + 1]) {
                countOfNonDesc++;
                if (longestCountNonDesc < countOfNonDesc) {
                    longestCountNonDesc = countOfNonDesc;
                    startIndex = i - countOfNonDesc + 1;
                }
            } else {
                countOfNonDesc = 0;
            }
        }

        int[] newArray = new int[longestCountNonDesc + 1];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = array[startIndex];
            startIndex++;
        }
        return newArray;
    }


    /**
     * This method convert binary array to decimal number.
     *
     * @param zerosAndOnes int[] number, elements must be only 0 and 1.
     * @return decimal value of binary array.
     * @throws IllegalArgumentException if passed array has no elements,
     *                                  if array has elements different from zero and one.
     */
    public int binaryToDecimal(int[] zerosAndOnes) throws IllegalArgumentException {
        if (zerosAndOnes.length == 0) {
            throw new IllegalArgumentException("Passed array has no elements: ");
        }

        int sum = 0;
        int k = 0;
        for (int i = zerosAndOnes.length - 1; i >= 0; i--) {
            if (zerosAndOnes[i] != 0 && zerosAndOnes[i] != 1) {
                throw new IllegalArgumentException("Elements of passed array must be zero or one: ");
            }
            sum += zerosAndOnes[i] * Math.pow(2, k);
            k++;
        }
        return sum;
    }


    /**
     * This method finds the smallest element of array.
     *
     * @param array int[] array.
     * @return the smallest element of array.
     * @throws IllegalArgumentException if passed array has no elements.
     */
    public int minElementOf(int[] array) throws IllegalArgumentException {
        if (array.length == 0) {
            throw new IllegalArgumentException("Passed array has no elements: ");
        }

        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }


    /**
     * This method finds the largest element of array.
     *
     * @param array int[] array.
     * @return the largest element of array.
     * @throws IllegalArgumentException if passed array has no elements.
     */
    public int maxElementOf(int[] array) throws IllegalArgumentException {
        if (array.length == 0) {
            throw new IllegalArgumentException("Passed array has no elements: ");
        }

        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }


    /**
     * This method prints all elements above the main diagonal of matrix.
     *
     * @param matrix int[][] matrix.
     */
    public void printElementsAboveMainDiagonal(int[][] matrix) {
        if (!isSquareMatrix(matrix)) {
            System.out.println("Passed matrix must be square matrix, and must have elements:");
            return;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (j > i) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println();
        }
    }


    /**
     * This method inverts the square matrix with respect to the main diagonal.
     *
     * @param matrix int[][] matrix.
     * @return matrix inverted with respect to the main diagonal.
     */
    public int[][] invertMatrixToTheMainDiagonal(int[][] matrix) {
        if (!isSquareMatrix(matrix)) {
            System.out.println("Passed matrix must be square matrix, and must have elements:");
            return null;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (j > i) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }
        return matrix;
    }


    /**
     * This method checks whether the sums of the
     * elements of all the rows of the matrix are even or not.
     *
     * @param matrix int[][] matrix
     * @return true if the sums of the elements of all the rows
     * of the matrix are even, false otherwise.
     * @throws IllegalArgumentException if passed matrix is not square matrix,
     *                                  if passed matrix has no elements.
     */
    public boolean isTheSumOfElementsOfAnyRowsEven(int[][] matrix) throws IllegalArgumentException {
        if (!isSquareMatrix(matrix)) {
            throw new IllegalArgumentException("Passed matrix must be square matrix, and must have elements: ");
        }

        int k = 0;
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                sum += matrix[i][j];
            }
            if (sum % 2 == 0) {
                k++;
            }
            if (k != i + 1) {
                return false;
            }
        }
        return k == matrix.length;
    }


    /**
     * This method calculates sum of elements of principal diagonal of matrix.
     *
     * @param matrix int[][] matrix.
     * @return the sum of principal diagonal.
     * @throws IllegalArgumentException if passed matrix is not square matrix,
     *                                  if passed matrix has no elements.
     */
    public int sumOfPrincipalDiagonal(int[][] matrix) throws IllegalArgumentException {
        if (!isSquareMatrix(matrix)) {
            throw new IllegalArgumentException("Passed matrix must be square matrix, and must have elements: ");
        }

        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }
        return sum;
    }


    /**
     * This method calculates sum of elements of secondary diagonal of matrix.
     *
     * @param matrix int[][] matrix.
     * @return the sum of secondary diagonal.
     * @throws IllegalArgumentException if passed matrix is not square matrix,
     *                                  if passed matrix has no elements.
     */
    public int sumOfSecondaryDiagonal(int[][] matrix) throws IllegalArgumentException {
        if (!isSquareMatrix(matrix)) {
            throw new IllegalArgumentException("Passed matrix must be square matrix, and must have elements: ");
        }

        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][matrix.length - (i + 1)];
        }
        return sum;
    }


    /**
     * This method determines is passed matrix square or not.
     *
     * @param matrix int[][]-type.
     * @return true, if passed matrix is a square matrix, false otherwise.
     */
    public boolean isSquareMatrix(int[][] matrix) {
        if (matrix.length == 0) {
            return false;
        }
        int result = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i].length == 0) {
                return false;
            }
            for (int j = 0; j < matrix[i].length; j++) {
                result++;
            }
        }
        return result == matrix[0].length * matrix[0].length;
    }


    /**
     * This method prints matrix.
     *
     * @param matrix int[][] matrix.
     */
    public void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}