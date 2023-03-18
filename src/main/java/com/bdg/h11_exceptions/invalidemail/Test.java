package com.bdg.h11_exceptions.invalidemail;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your email: ");
        String email = scanner.next();

        try {
            EmailValidator.isValidEmail(email);
        } catch (InvalidEmailException ex) {
            System.out.println(ex.getMessage());
        }
    }
}