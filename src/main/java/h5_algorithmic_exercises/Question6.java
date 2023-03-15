package h5_algorithmic_exercises;

import java.util.Scanner;

public class Question6 {

    public static void main(String[] args) {

        //Question 6
        //Write a program to enter the numbers till the user wants and at the end it
        //should display the count of positive, negative and zeros entered.

        Scanner scanner = new Scanner(System.in);

        int[] listOfNumbers = new int[100];
        int index = 0;
        int answer;

        do {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            listOfNumbers[index] = number;

            System.out.print("If you want to input more numbers input 1, otherwise any other numberKey: ");
            answer = scanner.nextInt();

            index++;
        } while (answer == 1);

        int countOfPositives = 0;
        int countOfNegatives = 0;
        int countOfZeros = 0;

        for (int i = 0; i < index; i++) {
            if (listOfNumbers[i] == 0) {
                countOfZeros++;
            } else if (listOfNumbers[i] > 0) {
                countOfPositives++;
            } else {
                countOfNegatives++;
            }
        }

        System.out.println("Count of zeros: " + countOfZeros +
                "\nCount of positives: " + countOfPositives +
                "\nCount of negatives: " + countOfNegatives);
    }
}
