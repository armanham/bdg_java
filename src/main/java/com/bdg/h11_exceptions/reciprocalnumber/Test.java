package com.bdg.h11_exceptions.reciprocalnumber;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        ReciprocalNumber number = new ReciprocalNumber();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a real number: ");
        double integer = scanner.nextInt();

        try {
            double reciprocal = number.reciprocalOf(integer);
            System.out.println(reciprocal);
        } catch (ArithmeticException ex) {
            System.out.println(ex.getMessage());
        }
    }
}