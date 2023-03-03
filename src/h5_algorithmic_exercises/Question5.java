package h5_algorithmic_exercises;

import java.util.Scanner;

public class Question5 {

    public static void main(String[] args) {

//        Question 5
//        Write a do-while loop that asks the user to enter two numbers. The numbers
//        should be added and the sum displayed. The loop should ask the user whether
//        he or she wishes to perform the operation again. If so, the loop should repeat;
//        otherwise it should terminate.

        Scanner scanner = new Scanner(System.in);

        int answer;

        do {
            System.out.print("Enter the first number: ");
            int number1 = scanner.nextInt();

            System.out.print("Enter the second number: ");
            int number2 = scanner.nextInt();

            System.out.println("The sum of entered numbers: " + (number1 + number2));

            System.out.print("Do you want repeat it again:(1/Yes, AnyNumberExceptOne/No): ");
            answer = scanner.nextInt();
        } while (answer == 1);
    }
}
