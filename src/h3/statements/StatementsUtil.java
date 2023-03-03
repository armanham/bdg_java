package h3.statements;

import java.math.BigDecimal;

/**
 * @author Arman Hambardzumyan
 */
public class StatementsUtil {

    public static void main(String[] args) {

//        Ինչ ավելացնենք  ___ բաց թողնված դիրքում որ տպի 8 .
//        int x = 0;
//        while (x++ < 10) {
//            ____
//        }
//        System.out.println(x);
        int x = 0;
        while (x++ < 10) {
            if (x == 8) {
                break;
            }
        }
        System.out.println(x);


//        Գտնել սխալը եւ ուղղել.
//        int x = 2;        x->p
//        int y = 5;        y->q
//        while(x < 10) {
//            y++;
//        }
        int p = 2;
        int q = 5;
        while (p < 10) { //or (q < 10)
            p++;
        }

        int t = 15;        //x->t
        while (t > 10) {
            t--;
        }
        System.out.println(t);

        //Տրված են int x = 1, int y = 0.  Քանի դեռ x < 5 ից  եւ  y < 10
        //տպել  x+y արտահայտությունը.     x->k, y->l
        int k = 1;
        int l = 0;
        while (k < 5 && l < 10) {
            System.out.println("k + l: " + (k + l));
            k++;
            l++;
        }

    }

    /**
     * This method determines whether a number is even or odd.
     *
     * @param number int number.
     */
    public void numberOddOrEven(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is even:");
        } else {
            System.out.println(number + " is odd:");
        }
    }


    /**
     * This method determines whether a number is positive or negative or zero.
     *
     * @param number int number.
     */
    public void numberPositiveOrNegativeOrZero(int number) {
        if (number == 0) {
            System.out.println(number + " is zero:");
        } else if (number > 0) {
            System.out.println(number + " is positive number:");
        } else {
            System.out.println(number + " is negative number:");
        }
    }


    //Գրել method, որը ստուգում է տրված x ամբողջ  թիվը՝ կամ փոքր 8 ից  եւ մեծ 5 ից
    //Կամ փոքր  20 ից եւ մեծ 15 ից
    public void method(int number) {
        if ((number > 5 && number < 8) || (number > 15 && number < 20)) {
            System.out.println(number + " meets the requirements:");
        } else {
            System.out.println(number + " does not meet the requirements:");
        }
    }


    /**
     * This method determines whether a number is multiple of 5 and 7.
     *
     * @param number int number.
     * @return true if the number is multiple of 5 and 7,
     * false otherwise.
     */
    public boolean isMultipleOf5And7(int number) {
        return (number % 5 == 0) && (number % 7 == 0);
    }


    /**
     * This method determines whether the second digit of three-digit number is 7.
     *
     * @param number int three-digit number.
     * @return true if the second digit of number is 7, false otherwise.
     */
    public boolean isSecondDigitOfThreeDigitNumber7(int number) {
        if (number < 100 || number > 999) {
            System.out.println("Passed number must be three-digit:"); //ավելի ճիշտ է օգտագործել exception
            return false;
        }
        return ((number / 10) % 10) == 7;
    }


    /**
     * This method determines does the point belong to the circle.
     * The coordinates for centre of circle is (0; 0).
     *
     * @param x      horizontal coordinate of point.
     * @param y      vertical coordinate of point.
     * @param radius int number, radius of circle.
     * @return true if the point belongs to the circle, false otherwise.
     */
    public boolean isPointBelongCircle(int x, int y, int radius) {
        if (radius <= 0) {
            System.out.println("Parameter radius must be positive number:");
            return false;
        }
        return Math.pow(x, 2) + Math.pow(y, 2) <= Math.pow(radius, 2);
        //or
        //return (x <= radius && x >= -radius) && (y <= radius && y >= -radius);
    }


    /**
     * This method finds the largest number among any three numbers.
     *
     * @param a int number.
     * @param b int number.
     * @param c int number.
     * @return maximum of a, b, c.
     */
    public int maxValueOf(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        }
        if (b >= c) {
            return b;
        }
        return c;
    }


    /**
     * This method finds the smallest number among any three numbers.
     *
     * @param a int number.
     * @param b int number.
     * @param c int number.
     * @return minimum of a, b, c.
     */
    public int minValueOf(int a, int b, int c) {
        if (a <= b && a <= c) {
            return a;
        }
        if (b <= c) {
            return b;
        }
        return c;
    }


    /**
     * This method determines is the year leap or not.
     *
     * @param year int number.
     * @return true if the year is leap, false otherwise.
     */
    public boolean isLeapYear(int year) {
        //return Year.isLeap(year);
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else return year % 4 == 0;
    }


    /**
     * This method prints from 1 to 200 numbers.
     */
    public void printNumbersFrom1to200() {
        for (int i = 1; i <= 200; i++) {
            System.out.println(i);
        }
    }


    /**
     * This method prints first digit of any positive number.
     *
     * @param number int number.
     * @return the first digit of number.
     */
    public int firstDigitOf(int number) {
        if (number <= 0) {
            System.out.println("Parameter number must be positive number:");
            return -1;
        }
        if (number < 10) {
            return number;
        }
        int currentDigit = 0;
        while (number > 9) {
            currentDigit = number % 10;
            number /= 10;
            if (number < 10) {
                currentDigit = number;
            }
        }
        return currentDigit;
    }


    /**
     * This method prints square with wildcards(*).
     *
     * @param side int number, the side of square.
     */
    public void printSquare(int side) {
        if (side < 1){
            System.out.println("Parameter must be positive number:");
            return;
        }

        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    /**
     * This method counts the sum of multiples of 5.
     *
     * @param end int number, last number of [1; end] sequence.
     * @return the sum of multiples of 5.
     */
    public int sumOfMultiplesOf5(int end) {
        if (end <= 0) {                //ավելի ճիշտ կլիներ օգտագործել exception
            System.out.println("Parameter end must be positive number:");
            return -1;
        }

        int sum = 0;
        for (int i = 1; i <= end; i++) {
            if (i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }


    /**
     * This method counts of multiple of two-digit and even numbers.
     *
     * @param end int number, last number of [1; end] sequence.
     * @return multiple of two-digit and even numbers.
     */
    public BigDecimal multipleOfTwoDigitEvenNumbers(int end) {
        if (end <= 10) {           //ավելի ճիշտ կլիներ օգտագործել exception
            System.out.println("Parameter end must be >10 number:");
            return BigDecimal.ZERO;
        }

        BigDecimal multiple = BigDecimal.ONE;
        if (end > 99) {
            for (int i = 10; i <= 99; i++) {
                if (i % 2 == 0) {
                    multiple = multiple.multiply(BigDecimal.valueOf(i));
                }
            }
            return multiple;
        }

        for (int i = 10; i <= end; i++) {
            if (i % 2 == 0) {
                multiple = multiple.multiply(BigDecimal.valueOf(i));
            }
        }
        return multiple;
    }


    //Գրել method, որը [1-N] հաջորդական  թվերի մեջ գտնում է  մեծագույն եւ փոքրագույն
    //տարրերը եւ հաշվում նրանց թվաբանական միջինը։
    //խնդիրը հասկացել եմ հետևյալ կերպ. հաջորդականությունը միշտ սկսվում ա մեկից ու յրքնչյր
    //հաջորդ տարրը նախորդից մեծ ա մեկով
    //ու վերջանում N-ով, որը իմ մոտ փոխանցվող end պարեմետրն ա
    //այսինքն մինիմումը միշտ մեկն ա, իսկ մաքսիմումը մեր փոխանցաց պարամետրն ա, դրա համար էլ ցիկլ չեմ գրել
    //իսկ ընդհանուր դեպքի(խառը թվերի) համար պետք ա ցիկլ

    /**
     * This method counts average sum of min and max values of [1; end] sequence.
     *
     * @param end int number, last number of [1; end].
     * @return the average sum of min and max values of [1; end].
     */
    public double averageSumOfMaxAndMinValuesOf(int end) {
        if (end <= 1) {                //ավելի ճիշտ կլիներ օգտագործել exception
            System.out.println("Parameter end must be > 1:");
            return -1;
        }
        return (double) (1 + end) / 2;
    }


    /**
     * This method counts sum of digits of any five-digit and positive number.
     *
     * @param number int number.
     * @return the sum of digits of number.
     */
    public int sumOfDigitsOfFiveDigitNumber(int number) {
        if (number < 10000 || number > 99999) {
            System.out.println("Parameter end must be five-digit and positive number:");
            return -1;
        }

        int sumOfDigits = 0;
        for (int i = 0; i < 5; i++) {
            sumOfDigits += number % 10;
            number /= 10;
        }
        return sumOfDigits;
    }
}
