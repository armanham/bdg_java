package h11_exceptions.integerarray;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayOfIntegers integers = new ArrayOfIntegers();

        System.out.print("Enter the count of elements: ");
        int count = scanner.nextInt();

        List<String> numbers = new ArrayList<>();
        int k = 0;

        while (k < count) {
            System.out.print("enter element at " + k + " index: ");
            String num = scanner.next();
            numbers.add(num);
            k++;
        }
        integers.setIntegers(numbers);
        System.out.println("Sum of entered elements: " + integers.sumElements());
    }
}
