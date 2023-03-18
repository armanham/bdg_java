package com.bdg.h2_methods;

import com.bdg.h2_methods.Application;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ApplicationTest {

    private Application application = new Application();

    @Test
    void sumOfSequenceOfNumbersTest() {
        assertEquals(9, application.sumOfSequenceOfNumbers(2, 4));
        assertEquals(0, application.sumOfSequenceOfNumbers(-4, 4));

        boolean thrown = false;
        try {
            application.sumOfSequenceOfNumbers(2, 1);
        }catch (IllegalArgumentException ex){
            thrown = true;
        }
        assertTrue(thrown);

        thrown = false;
        try {
            application.sumOfSequenceOfNumbers(2, 2);
        }catch (IllegalArgumentException ex){
            thrown = true;
        }
        assertTrue(thrown);
    }
}