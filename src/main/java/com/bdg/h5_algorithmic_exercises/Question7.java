package com.bdg.h5_algorithmic_exercises;

import java.util.Scanner;

public class Question7 {

    public static void main(String[] args) {

        AlgorithmicExercises algorithmicExercises = new AlgorithmicExercises();
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[100];
        int i = 0;
        int number;
        int answer;

        do{
            System.out.print("Enter an integer number: ");
            number = scanner.nextInt();
            array[i] = number;
            i++;

            System.out.print("If you want to continue adding numbers input 1, otherwise any number except 1: ");
            answer = scanner.nextInt();
        }while (answer == 1);

        for (int j = 0; j < i; j++) {
            System.out.print(array[j] + " ");
        }

        System.out.println();
        algorithmicExercises.largestAndSmallestValuesOf(array);
    }
}
