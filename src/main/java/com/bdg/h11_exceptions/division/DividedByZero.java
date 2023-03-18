package com.bdg.h11_exceptions.division;

import java.util.Scanner;

public class DividedByZero {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int first = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int second = scanner.nextInt();
        try {
            int result = first / second;
            System.out.println("first / second: " + result);
        }catch (ArithmeticException ex){
            System.out.println(ex.getMessage());
        }
    }
}
