package lang;

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

    @Test
    void equalsTest() {
        string = "abc";
        assertNotNull(string);
        assertTrue(string.equals("abc"));
        assertTrue(string.equals(new String("abc")));
        assertFalse(string.equals(" abc"));
    }

    @Test
    void contentEqualsTest() {
        string = "abc";
        StringBuilder sb = new StringBuilder("abc");
        assertNotNull(string);
        assertNotNull(sb);
        assertTrue(string.contentEquals(sb));
        sb.append("d");
        assertFalse(string.contentEquals(sb));
    }

    @Test
    void equalsIgnoreCaseTest() {
        string = "ABcd";
        String str = "aBCd";
        assertNotNull(string);
        assertNotNull(str);
        assertTrue(string.equalsIgnoreCase(str));
    }

    @Test
    void compareToTest() {
        string = "ABC";
        assertNotNull(string);
        assertEquals(-1, string.compareTo("BAC"));
        assertEquals(1, string.compareTo("ABB"));
        assertEquals(0, string.compareTo("ABC"));
        assertEquals(-8, string.compareTo("ABK"));
        assertEquals(-32, string.compareTo("abc"));
    }

    @Test
    void compareToIgnoreCaseTest() {
        string = "ABC";
        assertNotNull(string);
        assertEquals(0, string.compareToIgnoreCase("abc"));
    }

    @Test
    void startsWithTest() {
        string = "word";
        assertNotNull(string);
        assertTrue(string.startsWith("w"));
        assertTrue(string.startsWith("word"));
        assertFalse(string.startsWith(" "));
        assertFalse(string.startsWith("wrd"));
        assertFalse(string.startsWith("wrodd"));
    }

    @Test
    void endsWithTest() {
        string = "word";
        assertNotNull(string);
        assertTrue(string.endsWith("d"));
        assertTrue(string.endsWith("rd"));
        assertTrue(string.endsWith("word"));
        assertFalse(string.endsWith("dd"));
        assertFalse(string.endsWith(" "));
        assertFalse(string.endsWith("wordd"));
    }

    @Test
    void indexOfTest() {
        string = "good morning";
        assertNotNull(string);
        assertEquals(1, string.indexOf('o'));
        assertEquals(-1, string.indexOf('k'));
    }

    @Test
    void lastIndexOfTest() {
        string = "good morning";
        assertNotNull(string);
        assertEquals(6, string.lastIndexOf('o'));
        assertEquals(-1, string.lastIndexOf('k'));
    }

    @Test
    void substringTest() {
        string = "good morning";
        assertNotNull(string);
        assertEquals("good", string.substring(0, 4));

        boolean thrown = false;
        try {
            string.codePointCount(3, 16);
        } catch (IndexOutOfBoundsException ex) {
            thrown = true;
        }
        assertTrue(thrown);
    }

    @Test
    void toUpperCaseTest() {
        string = "word";
        string = string.toUpperCase();
        assertNotEquals(null, string);
        assertNotEquals("", string);
        assertEquals("WORD", string);
    }
}