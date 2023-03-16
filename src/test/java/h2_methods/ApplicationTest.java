package h2_methods;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApplicationTest {

    private Application application = new Application();

    @Test
    void sumOfSequenceOfNumbersTest() {
        assertEquals(9, application.sumOfSequenceOfNumbers(2, 4));
        assertEquals(0, application.sumOfSequenceOfNumbers(-4, 4));
        assertEquals(-1, application.sumOfSequenceOfNumbers(2, 1));
    }
}
