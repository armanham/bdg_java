package com.bdg.h11_exceptions.quontient;

public class Quotient {

    /**
     * This method calculates quotient of two numbers.
     *
     * @param divisible double-type.
     * @param divisive  double-type. Must be positive number.
     * @return the quotient of passed numbers.
     */
    public double quotient(double divisible, double divisive) {
        if (divisive <= 0) {
            throw new IllegalArgumentException("Passed zero or negative number for 'divisive' parameter: ");
        }
        return divisible / divisive;
    }
}