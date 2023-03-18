package com.bdg.h5_algorithmic_exercises;

import java.util.Random;
import java.util.Scanner;

public class Question11 {

    public static void main(String[] args) {

        //Question 11
        //Write a program that generates a random number and asks the user to guess
        //what the number is. If the user's guess is higher than the random number, the
        //program should display "Too high, try again." If the user's guess is lower than
        //the random number, the program should display "Too low, try again." The
        //program should use a loop that repeats until the user correctly guesses the
        //random number.

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int number = random.nextInt();
        boolean guessed = false;

        do {
            System.out.print("Guess the number: ");
            int numberOfUser = scanner.nextInt();

            if (number > numberOfUser) {
                System.out.println("Too low. Try again.");
            } else if (number < numberOfUser) {
                System.out.println("Too high. Try again.");
            } else {
                guessed = true;
            }
        } while (!guessed);

        System.out.println("You win");
    }
}
