package h4_algorithmic_exercises;

import h3.statements.StatementsUtil;

import java.util.Random;

public class AlgorithmicExercises {

    public static void main(String[] args) {

        //Write a program that generates a random number between 1 and 100
        //(you can use the Random ( ) method from the Math class.
        //the next step check whether it is an even or an odd number. Each of
        //the above actions should be written to the console.
        //պահանաջից հասկացել եմ, որ 1 ու 100 թվերը չպետք է լինեն գեներացվող թվերի մեջ

        StatementsUtil statementsUtil = new StatementsUtil();
        Random random = new Random();

        int number = random.nextInt(2, 100);
        System.out.println("The generated number is: " + number);
        statementsUtil.numberOddOrEven(number);


        //Write a program that will use the while loop to find the largest and
        //smallest number from the set of 10 randomly drawn integers from 1 to
        //100. In this task, do not use arrays or other collections.
        //import java.util.Random;

        int a = random.nextInt(1, 101);
        int b = random.nextInt(1, 101);
        int c = random.nextInt(1, 101);
        int d = random.nextInt(1, 101);
        int e = random.nextInt(1, 101);
        int f = random.nextInt(1, 101);
        int h = random.nextInt(1, 101);
        int i = random.nextInt(1, 101);
        int j = random.nextInt(1, 101);
        int k = random.nextInt(1, 101);
        System.out.println("a: " + a +
                "\nb: " + b +
                "\nc: " + c +
                "\nd: " + d +
                "\ne: " + e +
                "\nf: " + f +
                "\nh: " + h +
                "\ni: " + i +
                "\nj: " + j +
                "\nk: " + k);

        int maxOfABC = statementsUtil.maxValueOf(a, b, c);
        int maxOfDEF = statementsUtil.maxValueOf(d, e, f);
        int maxOfHIJ = statementsUtil.maxValueOf(h, i, j);
        int maxOfABC_DEF_HIJ = statementsUtil.maxValueOf(maxOfABC, maxOfDEF, maxOfHIJ);

        System.out.println("Largest number: " + Math.max(maxOfABC_DEF_HIJ, k));

        int minOfABC = statementsUtil.minValueOf(a, b, c);
        int minOfDEF = statementsUtil.minValueOf(d, e, f);
        int minOfHIJ = statementsUtil.minValueOf(h, i, j);
        int minOfABC_DEF_HIJ = statementsUtil.minValueOf(minOfABC, minOfDEF, minOfHIJ);

        System.out.println("Smallest number: " + Math.min(minOfABC_DEF_HIJ, k));
    }

//    Provided that you have a given number of small rice bags (1 kilo each)
//    and big rice bags (5 kilos each), write a method that returns true
//    if it is possible to make a package with goal kilos of rice.

    public boolean isPossibleMakePackage(int countOfFiveKiloPackages, int countOfOneKiloPackages, int totalWeight) {
        if ((countOfFiveKiloPackages <= 0) || (countOfOneKiloPackages <= 0) || (totalWeight <= 0)) {
            System.out.println("All three parameters must be positive numbers:");
            return false;
        }
        if (totalWeight <= countOfFiveKiloPackages * 5 + countOfOneKiloPackages) {
            return true;
        }
        return ((5 * countOfFiveKiloPackages / totalWeight) + (countOfOneKiloPackages / totalWeight)) == 1;
    }


    /**
     * This method finds the largest prime factor of number.
     * @param number int number, must be > 1.
     * @return the largest prime factor of number.
     */
    public int largestPrimeFactorOf(int number) {
        if (number <= 1) {
            System.out.println("Only >1 numbers have prime divisors");
            return -1;
        }

        int largestPrimeFactor = 0;
        for (int i = 2; i <= number; i++) {
            while (isPrime(i) && number % i == 0) {
                largestPrimeFactor = i;
                i++;
            }
        }
        return largestPrimeFactor;
    }


    /**
     * This method determines is the number prime or not.
     * @param number int number.
     * @return true if the number is prime, false otherwise.
     */
    public boolean isPrime(int number) {
        if (number <= 0) {
            System.out.println("Only positive numbers can be prime:");
            return false;
        }
        int countOfDivisors = 0;
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                countOfDivisors++;
            }
        }
        return countOfDivisors == 1;
    }
}