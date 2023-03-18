package com.bdg.h11_exceptions.reciprocalnumber;

public class ReciprocalNumber {

    public double reciprocalOf(double number) throws ArithmeticException {
        if (number == 0) {
            throw new ArithmeticException("Divided by zero:");
        }
        return 1 / number;
    }
}