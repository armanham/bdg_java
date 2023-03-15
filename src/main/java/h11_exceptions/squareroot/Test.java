package h11_exceptions.squareroot;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        SquareRoot squareRoot = new SquareRoot();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String number = scanner.next();

        squareRoot.setNumber(number);
        System.out.println(squareRoot.squareRoot());
    }
}
