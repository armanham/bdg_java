package com.bdg.h11_exceptions.exercise_6;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        CustomArrays arrays = new CustomArrays();

        System.out.print("Enter count of elements: ");
        int length = scanner.nextInt();
        String[] array = new String[length];

        int k = 0;
        while (k < length) {
            System.out.print("enter element at " + k + " index: ");
            String num = scanner.next();
            array[k] = num;
            k++;
        }
        arrays.setArray(array);
        System.out.println("Sum of elements: " + arrays.sumElements());

        System.out.println(arrays.getBy(-1));

        String[] dividedArray;
        try {
            dividedArray = arrays.divideBy(0);
            for (int i = 0; i < dividedArray.length; i++) {
                System.out.print(dividedArray[i] + "; ");
            }
        } catch (DivideByZeroException ex) {
            System.out.println(ex.getMessage());
        }
    }
}