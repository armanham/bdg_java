package com.bdg.h11_exceptions.invalidage;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        AgeValidator ageValidator = new AgeValidator();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        ageValidator.setAge(age);
    }
}