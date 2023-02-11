package homework_6;

public class Arrays {

    /**
     * This method prints positive numbers of array.
     *
     * @param array int[] array.
     */
    public static void printPositiveNumbers(int[] array) {
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
    public static void printReversedArray(short[] array) {
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
    public static void printLargestNumber(long[] array) {
        if (array.length == 0) {
            System.out.println("Passed array has no elements: ");
            return;
        }

        long max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max <= array[i]) {
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
    public static void printSmallestNumber(float[] array) {
        if (array.length == 0) {
            System.out.println("Passed array has no elements: ");
            return;
        }

        float min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min >= array[i]) {
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
     */
    public static void moveElementsToAnotherArray(int[] array, int[] newArray) {
        if (array.length == 0) {
            System.out.println("The original array has no elements: ");
            return;
        }
        if (array.length != newArray.length) {
            System.out.println("Lengths of passed arrays must be equals.");
            return;
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
     */
    public static int[] sum(int[] array1, int[] array2) {
        int[] sumOfArrays = new int[array1.length];

        if (array1.length == 0 || array2.length == 0) {
            System.out.println("One or both of passed array has no elements: ");
            return sumOfArrays;
        }
        if (array1.length != array2.length) {
            System.out.println("Lengths of passed arrays must be equals.");
            return sumOfArrays;
        }

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
     * @return count how many times the given number occurs in the array.
     */
    public static int countOfNumberInArray(int[] array, int number) {
        if (array.length == 0) {
            System.out.println("Passed array has no elements:");
            return 0;
        }

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (number == array[i]) {
                count++;
            }
        }
        return count;
    }


    //TODO printNonRepeatingTriplets()
    public static void printNonRepeatingTriplets(int[] array) {
        if (array.length < 3) {
            System.out.println("Passed array must have three and more elements:");
        }

        int[][] triplets = new int[array.length][array.length];
        for (int i = 0; i < array.length - 2; i++) {
            for (int j = i + 1; j < array.length; j++) {

            }
        }
    }


    /**
     * This method sorts the array in descending order.
     *
     * @param array int[] array.
     * @return array already sorted in descending order.
     */
    public static int[] sortDescendingOrder(int[] array) {
        if (array.length == 0) {
            System.out.println("Passed array has no elements:");
            return array;
        }

        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] >= array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }


    /**
     * This method moves odd elements in the end of array.
     *
     * @param array int[] array.
     * @return already sorted array: odd elements already moved in the end.
     */
    public static int[] sortOddElementsInTheEnd(int[] array) {
        if (array.length == 0) {
            System.out.println("Passed array has no elements:");
            return array;
        }

        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] % 2 == 0 && array[j] % 2 != 0) {
                    temp = array[i];
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
    public static int[] removeZeros(int[] array) {
        if (array.length == 0) {
            System.out.println("Passed array has no elements:");
            return array;
        }

        int countOfZeros = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == 0) {
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
                countOfZeros++;
            }
        }

        int[] newArray = new int[array.length - countOfZeros];
        for (int i = 0; i < array.length - countOfZeros; i++) {
            if (array[i] != 0) {
                newArray[i] = array[i];
            }
        }
        return newArray;
    }


    /**
     * This method finds the longest sequence in non-decreasing order of array.
     *
     * @param array int[] array.
     * @return new array the of the longest sequence in non-decreasing order of array.
     */
    public static int[] longestNonDecreasingSequence(int[] array) {
        if (array.length == 0) {
            System.out.println("Passed array has no elements:");
            return array;
        }

        int k = 0;
        int longestK = 0;
        int startIndex = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] <= array[i + 1]) {
                k++;
            } else {
                k = 0;
            }
            if (k == 1 && longestK <= k) {
                startIndex = i;
            }
            if (longestK <= k) {
                longestK = k;
            }
        }

        int[] newArray = new int[longestK + 1];
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
     */
    public static int binaryToDecimal(int[] zerosAndOnes) {
        if (zerosAndOnes.length == 0) {
            System.out.println("Passed array has no elements:");
            return 0;
        }

        int sum = 0;
        int k = 0;
        for (int i = zerosAndOnes.length - 1; i >= 0; i--) {
            if (zerosAndOnes[i] != 0 && zerosAndOnes[i] != 1) {
                System.out.print("Elements of passed array must be zero or one:");
                return 0;
            }
            sum += zerosAndOnes[i] * Math.pow(2, k);
            k++;
        }
        return sum;
    }


    /**
     * This method prints all elements above the main diagonal of matrix.
     *
     * @param matrix int[][] matrix.
     */
    public static void printElementsAboveMainDiagonal(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            System.out.println("Passed matrix must be square matrix, and must have elements:");
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
    public static int[][] invertMatrixToTheMainDiagonal(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            System.out.println("Passed matrix must be square matrix, and must have elements:");
        }

        int temp;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (j > i) {
                    temp = matrix[i][j];
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
     */
    public static boolean isTheSumOfElementsOfAnyRowsEven(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            System.out.println("Passed matrix must be square matrix, and must have elements:");
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
                break;
            }
        }
        return k == matrix.length;
    }
}