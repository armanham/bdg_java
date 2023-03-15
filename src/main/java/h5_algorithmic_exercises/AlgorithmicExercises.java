package h5_algorithmic_exercises;

public class AlgorithmicExercises {

    /**
     * This method prints multiplication table for any number.
     *
     * @param number int number.
     */
    public void printMultiplicationTableOf(int number) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }


    /**
     * Returns the value of the first argument raised to the power of the second argument.
     *
     * @param number   int number.
     * @param exponent int number.
     * @return the value of number^exponent.
     */
    public double pow(int number, int exponent) {
        double temp = number;

        if (exponent == 0) {
            return 1;
        }

        if (exponent > 0) {
            while (exponent != 1) {
                temp *= number;
                exponent--;
            }
            return temp;
        }

        while (exponent != 1) {
            temp /= number;
            exponent++;
        }
        return temp;
    }


    /**
     * This method reverses any integer number.
     *
     * @param number int number.
     * @return String of reversed number.
     */
    public String reverse(int number) {
        if (number > -10 && number < 10) {
            return String.valueOf(number);
        }

        String convertedToString = String.valueOf(number);
        String reversedNumber = "";
        for (int i = convertedToString.length() - 1; i >= 0; i--) {
            if (convertedToString.charAt(i) == '-') {
                continue;
            }
            reversedNumber += convertedToString.charAt(i);
        }
        return number < 0 ? '-' + reversedNumber : reversedNumber;
    }


    //Method already written - homework_4.AlgorithmicExercises.isPrime()
    //Access-modifier-ը private եմ դրել քանի որ որովհետև մտածում եմ իմաստ չկա էս
    //մեթոդին այլ տեղերից հասանելիություն ունենալ,որովհետև արդեն կա գրված տվյալ մեթոդից:
    private void isPrime(int number) {
        h4_algorithmic_exercises.AlgorithmicExercises ae = new h4_algorithmic_exercises.AlgorithmicExercises();
        System.out.println(ae.isPrime(number));
    }


    /**
     * This method finds and prints largest and smallest values of array.
     *
     * @param array int[] array.
     */
    public void largestAndSmallestValuesOf(int[] array) {
        if (array.length == 0) {
            System.out.println("Passed empty array:");
            return;
        }

        int min = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println("Max value of array: " + max +
                "\nMin value of array: " + min);
    }


    /**
     * This method determines is the number armstrong or not.
     * An Armstrong number is defined as the sum of n-th
     * power of each digit to a n-digit number is equal to that number.
     * For example, 153 = (1 * 1 * 1) + (5 * 5 * 5) + (3 * 3 * 3).
     *
     * @param number int number.
     * @return true if the number is armstrong, false otherwise.
     */
    public boolean isArmstrong(int number) {
        if (number < 0) {
            return false;
        }
        if (number < 10) {
            return true;
        }

        int tempNumber = number;
        int countOfDigits = 0;
        while (tempNumber > 0) {
            tempNumber /= 10;
            countOfDigits++;
        }

        tempNumber = number;
        int sum = 0;
        int currentDigit = 0;
        while (tempNumber > 0) {
            currentDigit = tempNumber % 10;
            sum += Math.pow(currentDigit, countOfDigits);
            tempNumber /= 10;
        }
        return number == sum;
    }


    /**
     * This method calculates the sum of following series.
     * 1 + 1/2 + 1/3 + 1/4 + 1/5 +...+1/n.
     *
     * @param number int number. Last and smallest number of series is 1/number.
     * @return the sum of 1 + 1/2 + 1/3 + 1/4 + 1/5 +...+1/n.
     */
    public double sumOfOneDivNToOne(int number) {
        if (number <= 0) {
            System.out.println("Parameter number must be positive number");
            return -1;
        }
        double sum = 1;
        for (double i = 2; i <= number; i++) {
            sum += 1 / i;
        }
        return sum;
    }


    /**
     * This method calculates the sum of following series.
     * 1 - 1/2 + 1/3 - 1/4 + 1/5 -...1/n.
     *
     * @param number int number. Last and smallest number of series is 1/number.
     * @return the sum of 1 - 1/2 + 1/3 - 1/4 + 1/5 -...1/n.
     */
    public double sumOfOneDivNToOne2(int number) {
        if (number <= 0) {
            System.out.println("Parameter number must be positive number");
            return -1;
        }
        double sum = 1;
        for (double i = 2; i <= number; i++) {
            if (i % 2 == 0) {
                sum -= 1 / i;
            } else {
                sum += 1 / i;
            }
        }
        return sum;
    }


    /**
     * This method calculates sine of any number.
     * sin x = x - x^3/3! + x^5/5! - x^7/7! + ... x^n/n!.
     *
     * @param number     double number. Converting to radians.
     * @param correction int number, calculation correcting.
     * @return sine of number.
     */
    public double sinOf(double number, int correction) {
        double sum = 0;
        for (double i = 0; i <= correction; i++) {
            sum += Math.pow(-1.0, i) * Math.pow(Math.toRadians(number), 2 * (int) i + 1) / factorialOf(1 + (int) i * 2);
        }
        return sum;
    }


    /**
     * This method calculates cosine of any number.
     * cos x = 1 - x^2/2! + x^4/4! - x^6/6! + ... x^n/n!.
     *
     * @param number     double number. Converting to radians.
     * @param correction int number, calculation correcting.
     * @return cosine of number.
     */
    public double cosOf(double number, int correction) {
        double sum = 0;
        for (double i = 0; i <= correction; i++) {
            sum += Math.pow(-1.0, i) * Math.pow(Math.toRadians(number), 2 * (int) i) / factorialOf(2 * (int) i);
        }
        return sum;
    }


    /**
     * This method calculates factorial of any number.
     *
     * @param number int number.
     * @return the factorial of any number.
     */
    public long factorialOf(int number) {
        int result = 1;
        if (number < 0 && number % 2 != 0) {
            for (int i = 2; i <= -number; i++) {
                result *= i;
            }
            return -result;
        }
        if (number < 0) {
            for (int i = 2; i <= -number; i++) {
                result *= i;
            }
            return -result;
        }
        for (int i = 2; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}
