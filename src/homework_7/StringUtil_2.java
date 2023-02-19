package homework_7;

import java.util.ArrayList;
import java.util.List;

public class StringUtil_2 {

    private StringUtil_1 util_1 = new StringUtil_1();


    //Given a string, return a string made of the first 2 chars (if present), however
    //include first char only if it is 'o' and include the second only if it is 'z', so
    //"ozymandias" yields "oz".
    public String method1(String str) {
        if (util_1.isNullOrEmpty(str)) {
            System.out.println("Passed null or empty value:");
            return null;
        }
        if (str.length() < 2) {
            System.out.println("Passed String must have 2 or more characters:");
            return null;
        }
        if (str.charAt(0) == 'o' && str.charAt(1) == 'z') {
            return "oz";
        }
        return null;
    }


    //Անցած տնայինի մեջ նույն մեթոդը կա, որը բոլոր դեպքերի համար ա աշխատում:
    private void method2(String line, String token) {
        util_1.countSubString(line, token);
    }


    /**
     * This method determines is the passed String palindrome or not.
     * A palindrome is a word which reads the same backward or forward.
     * a - > true.
     * ava -> true.
     * abva-> false.
     *
     * @param str String-type.
     * @return true if the String is palindrome, false otherwise.
     */
    public boolean isPalindrome(String str) {
        if (util_1.isNullOrEmpty(str)) {
            System.out.println("Passed null or empty value:");
            return false;
        }
        if (str.length() == 1) {
            return true;
        }

        int counter = 0;
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) == str.charAt(str.length() - i - 1)) {
                counter++;
            }
        }
        return counter == str.length() / 2;
    }


    //Given a list of strings, write a method that returns a list of all strings that
    //start with the letter 'a' (lower case) and have exactly 3 letters.
    public List<String> method4(List<String> stringList) {
        if (stringList == null || stringList.isEmpty()) {
            System.out.println("Passed null or empty parameter:");
            return null;
        }

//        for (String item : stringList) {
//            if (!item.startsWith("a") || item.length() != 3) {
//                stringList.remove(item);
//            }
//        } ՀԱՐՑ____ foreach-ով remove անել չի լինում,,, նու մոդիֆայ անել չի լինում, why?
        for (int i = 0; i < stringList.size(); i++) {
            if (!stringList.get(i).startsWith("a") || stringList.get(i).length() != 3) {
                stringList.remove(stringList.get(i));
                i--;
            }
        }
        return stringList;
    }


    /**
     * This method presents floating-point number as a String.
     * 8.98 -> o8,e98.
     *
     * @param number double-type.
     * @return number in String.
     */
    public String presentFloatingPointNumber(double number) {
        String numStr = String.valueOf(number);
        String[] splitNum = numStr.split("\\.");
        return "o" + splitNum[0] + ",e" + splitNum[1];
    }


    /**
     * This method encrypts text with Cesar's algorithm.
     *
     * @param text     String-type.
     * @param shiftKey int-type.
     * @return new encrypted text.
     */
    public String cesarEncrypt(String text, int shiftKey) {
        if (util_1.isNullOrEmpty(text)) {
            System.out.println("Passed null or empty value:");
            return null;
        }
        if (shiftKey > 25 || shiftKey < 1) {
            System.out.println("Key must be in range [1; 25]");
            return null;
        }

        String encryptedText = "";
        for (int i = 0; i < text.length(); i++) {
            if (Character.isUpperCase(text.charAt(i))) {
                char lettersOfText = (char) ((text.charAt(i) + shiftKey - 65) % 26 + 65);
                encryptedText += lettersOfText;
            } else if (Character.isSpaceChar(text.charAt(i))) {
                encryptedText += " ";
            } else {
                char lettersOfText = (char) ((text.charAt(i) + shiftKey - 97) % 26 + 97);
                encryptedText += lettersOfText;
            }
        }
        return encryptedText;
    }


    /**
     * This method finds first longest palindrome word in String.
     * A palindrome is a word which reads the same backward or forward.
     * a - > palindrome.
     * ava -> palindrome.
     * abva-> palindrome.
     *
     * @param str String-type.
     * @return first longest palindrome word.
     */
    public String longestPalindrome(String str) {
        if (util_1.isNullOrEmpty(str)) {
            System.out.println("Passed null or empty value:");
            return null;
        }

        List<String> palindromes = new ArrayList<>();
        for (int i = 0; i < str.length() - 1; i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (isPalindrome(str.substring(i, j))) {
                    palindromes.add(str.substring(i, j));
                }
            }
        }

        int longestLength = palindromes.get(0).length();
        int index = 0;
        for (int i = 0; i < palindromes.size(); i++) {
            if (longestLength < palindromes.get(i).length()) {
                longestLength = palindromes.get(i).length();
                index = palindromes.indexOf(palindromes.get(i));
            }
        }
        return palindromes.get(index);
    }



}
