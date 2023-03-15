import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringTest {

    String string = "";

    @Test
    void lengthTest() {
        string = "word";
        assertEquals(4, string.length());
    }

    @Test
    void isEmptyTest() {
        string = "";
        assertNotNull(string);
        assertEquals(0, string.length());
    }

    @Test()
    void charAtTest() {
        string = "good morning";
        assertNotNull(string);
        assertEquals('m', string.charAt(5));

        boolean thrown = false;
        try {
            string.charAt(12);
        } catch (StringIndexOutOfBoundsException ex) {
            thrown = true;
        }
        assertTrue(thrown);
    }

    @Test
    void codePointAtTest() {
        string = "A12bV";
        assertNotNull(string);
        assertEquals(65, string.codePointAt(0));

        boolean thrown = false;
        try {
            string.codePointAt(8);
        } catch (StringIndexOutOfBoundsException ex) {
            thrown = true;
        }
        assertTrue(thrown);
    }

    @Test
    void codePointBeforeTest() {
        string = "BusinessDevCent";
        assertNotNull(string);
        assertEquals(101, string.codePointBefore(6));
        assertEquals(116, string.codePointBefore(15));

        boolean thrown = false;
        try {
            string.codePointBefore(0);
        } catch (StringIndexOutOfBoundsException ex) {
            thrown = true;
        }
        assertTrue(thrown);
    }

    @Test
    void codePointCountTest() {
        string = "BusinessDevCent";
        assertNotNull(string);
        assertEquals(4, string.codePointCount(0, 4));

        boolean thrown = false;
        try {
            string.codePointCount(-1, 4);
        } catch (IndexOutOfBoundsException ex) {
            thrown = true;
        }
        assertTrue(thrown);

        thrown = false;
        try {
            string.codePointCount(1, 16);
        } catch (IndexOutOfBoundsException ex) {
            thrown = true;
        }
        assertTrue(thrown);

        thrown = false;
        try {
            string.codePointCount(7, 1);
        } catch (IndexOutOfBoundsException ex) {
            thrown = true;
        }
        assertTrue(thrown);
    }


   // @Test


    @Test
    void toUpperCaseTest() {
        string = "word";
        string = string.toUpperCase();
        assertNotEquals(null, string);
        assertNotEquals("", string);
        assertEquals("WORD", string);
    }
}