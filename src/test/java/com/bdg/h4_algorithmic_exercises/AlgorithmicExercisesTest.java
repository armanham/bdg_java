package com.bdg.h4_algorithmic_exercises;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class AlgorithmicExercisesTest {

    private AlgorithmicExercises algorithmicExercises = new AlgorithmicExercises();

    @Test
    void largestPrimeFactorOfTest() {
        Assertions.assertEquals(5, algorithmicExercises.largestPrimeFactorOf(500));
        Assertions.assertEquals(13, algorithmicExercises.largestPrimeFactorOf(455));
        Assertions.assertEquals(-1, algorithmicExercises.largestPrimeFactorOf(1));
        Assertions.assertEquals(-1, algorithmicExercises.largestPrimeFactorOf(-1));
    }

    @Test
    void primeFactorsOfTest() {
        Assertions.assertEquals(List.of(2, 5), algorithmicExercises.primeFactorsOf(500));
        Assertions.assertEquals(List.of(5, 7, 13), algorithmicExercises.primeFactorsOf(455));
        Assertions.assertEquals(List.of(2), algorithmicExercises.primeFactorsOf(2));
        Assertions.assertNull(algorithmicExercises.primeFactorsOf(1));
        Assertions.assertNull(algorithmicExercises.primeFactorsOf(-1));
    }

    @Test
    void isPrimeTest(){
        Assertions.assertTrue(algorithmicExercises.isPrime(2));
        Assertions.assertTrue(algorithmicExercises.isPrime(17));
        Assertions.assertFalse(algorithmicExercises.isPrime(1));
        Assertions.assertFalse(algorithmicExercises.isPrime(-1));
    }
}