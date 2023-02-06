package homework_5;

public class AlgorithmicExercises {

    /**
     * This method prints multiplication table for any number
     *
     * @param number int number
     */
    public void printMultiplicationTableOf(int number) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }


    /**
     * Returns the value of the first argument raised to the power of the second argument
     *
     * @param number   int number
     * @param exponent int number
     * @return the value of number^exponent
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
     * This method reverses any integer number
     *
     * @param number int number
     * @return String of reversed number
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
        System.out.println(homework_4.AlgorithmicExercises.isPrime(number));
    }


    /**
     * This method finds and prints largest and smallest values of array
     *
     * @param array int[] array
     */
    public void largestAndSmallestValuesOf(int[] array) {
        int min = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min >= array[i]) {
                min = array[i];
            }
            if (max <= array[i]) {
                max = array[i];
            }
        }
        System.out.println("Max value of array: " + max +
                "\nMin value of array: " + min);
    }


    /**
     * This method determines is the number armstrong or not.
     * If sum of cubes of each digit of the number is equal
     * to the number itself, then the number is called an Armstrong number.
     * For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 )
     *
     * @param number int number
     * @return true if the number is armstrong, false otherwise.
     */
    public boolean isArmstrong(int number) {
        int tempNumber = number;

        if (number < 10 && number > -10) {
            return false;
        }

        int sum = 0;
        int currentDigit = 0;
        while (tempNumber > 0) {
            currentDigit = tempNumber % 10;
            sum += Math.pow(currentDigit, 3);
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
            return 0;
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
            return 0;
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

    //sin x = x - x3/3! + x5/5! - x7/7! + x9/9!
    //Չի տալիս ճիշտ արդյունք, բայց գրված ա, տրված բանաձևի համաձայն
    public double sinOf(int number) {
        double sum = number;
        for (double i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                sum += (Math.pow(number, (1 + (i * 2))) / factorialOf((1 + (int) i * 2)));
            } else {
                sum -= (Math.pow(number, (1 + (i * 2))) / factorialOf((1 + (int) i * 2)));
            }
        }
        return sum;
    }


    //cos x = 1 - x2/2! + x4/4! - x6/6!
    //Չի տալիս ճիշտ արդյունք, բայց գրված ա, տրված բանաձևի համաձայն
    public double cosOf(int number) {
        double sum = 1;
        for (double i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                sum += (Math.pow(number, (i * 2)) / factorialOf(((int) i * 2)));
            } else {
                sum -= (Math.pow(number, (i * 2)) / factorialOf(((int) i * 2)));
            }
        }
        return sum;
    }


    /**
     * This method calculates factorial of any number
     *
     * @param number int number
     * @return the factorial of any number
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
