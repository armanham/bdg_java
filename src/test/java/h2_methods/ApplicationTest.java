package h2_methods;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ApplicationTest {

    private Application application = new Application();

    @Test
    void sumOfSequenceOfNumbersTest() {
        Assertions.assertEquals(9, application.sumOfSequenceOfNumbers(2, 4));
        Assertions.assertEquals(0, application.sumOfSequenceOfNumbers(-4, 4));
        Assertions.assertEquals(-1, application.sumOfSequenceOfNumbers(2, 1));
    }
}
