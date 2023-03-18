package com.bdg.h11_exceptions.squareroot;

public class SquareRoot {

    private String number;


    /**
     * This method calculates square root of passed number for 'String number'.
     *
     * @return square root of number, or -1 for invalid input.
     */
    public double squareRoot() {
        double sqrt = -1;

        try {
            double num = toNumber();
            if (num <= 0) {
                throw new IllegalArgumentException("Passed zero or negative number: ");
            }
            sqrt = Math.sqrt(num);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("Good Bye");
        }
        return sqrt;
    }


    public String getNumber() {
        return number;
    }


    public void setNumber(String number) {
        this.number = number;
    }


    /**
     * This method converts a String to double.
     *
     * @return double value for 'String number'.
     * @throws NumberFormatException if passed wrong format for 'String number'.
     */
    private double toNumber() throws NumberFormatException {
        return Double.parseDouble(number);
    }
}