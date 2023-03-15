package h7_strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringUtil_1 {

    /**
     * This method concatenates the arguments in the String.
     *
     * @param str1 String str1.
     * @param str2 String str2.
     * @return new concatenated String.
     */
    public String concat(String str1, String str2) {
        if (isNullOrEmpty(str1) || isNullOrEmpty(str2)) {
            System.out.println("Passed null value for one or both of String-type parameters or passed empty line:");
            return null;
        }
        return str1 + str2;
    }


    /**
     * This method concatenates the arguments in the String.
     *
     * @param num1 int num1.
     * @param num2 int num2.
     * @param str  String str.
     * @return new concatenated String.
     */
    public String concat(int num1, int num2, String str) {
        if (isNullOrEmpty(str)) {
            System.out.println("Passed null value for String-type parameter or passed empty line:");
            return null;
        }
        return num1 + num2 + str;
    }


    /**
     * This method concatenates the arguments in the String.
     *
     * @param str1 String str1.
     * @param num  int num.
     * @param str2 String str2.
     * @return new concatenated String.
     */
    public String concat(String str1, int num, String str2) {
        if (isNullOrEmpty(str1) || isNullOrEmpty(str2)) {
            System.out.println("Passed null value for one or both of String-type parameters or passed empty line:");
            return null;
        }
        return str1 + num + str2;
    }


    /**
     * This method concatenates the arguments in the String.
     *
     * @param str1 String str1.
     * @param num1 int num1.
     * @param num2 int num2.
     * @param str2 String str2.
     * @return new concatenated String.
     */
    public String concat(String str1, int num1, int num2, String str2) {
        if (isNullOrEmpty(str1) || isNullOrEmpty(str2)) {
            System.out.println("Passed null value for one or both of StringBuilder-type parameters or passed empty line:");
            return null;
        }
        return str1 + num1 + num2 + str2;
    }


    /**
     * This method concatenates the arguments in the StringBuilder.
     *
     * @param str1 StringBuilder str1.
     * @param str2 StringBuilder str2.
     * @return 1st StringBuilder-type argument already concatenated with others.
     */
    public StringBuilder concat(StringBuilder str1, StringBuilder str2) {
        if (isNullOrEmpty(String.valueOf(str1)) || isNullOrEmpty(String.valueOf(str2))) {
            System.out.println("Passed null value for one or both of StringBuilder-type parameters or passed empty line:");
            return null;
        }
        return str1.append(str2);
    }


    /**
     * This method concatenates the arguments in the StringBuilder.
     *
     * @param num1 int num1.
     * @param num2 int num2.
     * @param str  StringBuilder str.
     * @return 1st StringBuilder-type argument already concatenated with others.
     */
    public StringBuilder concat(int num1, int num2, StringBuilder str) {
        if (isNullOrEmpty(String.valueOf(str))) {
            System.out.println("Passed null value for StringBuilder-type parameter or passed empty line:");
            return null;
        }

        int sum = num1 + num2;
        return str.insert(0, sum);
    }


    /**
     * This method concatenates the arguments in the StringBuilder.
     *
     * @param str1 StringBuilder str1.
     * @param num  int num.
     * @param str2 StringBuilder str2.
     * @return 1st StringBuilder-type argument already concatenated with others.
     */
    public StringBuilder concat(StringBuilder str1, int num, StringBuilder str2) {
        if (isNullOrEmpty(String.valueOf(str1)) || isNullOrEmpty(String.valueOf(str2))) {
            System.out.println("Passed null value for one or both of StringBuilder-type parameters or passed empty line:");
            return null;
        }
        return str1.append(num).append(str2);
    }


    /**
     * This method concatenates the arguments in the StringBuilder.
     *
     * @param str1 StringBuilder str1.
     * @param num1 int num1.
     * @param num2 int num2.
     * @param str2 StringBuilder str2.
     * @return 1st StringBuilder-type argument already concatenated with others.
     */
    public StringBuilder concat(StringBuilder str1, int num1, int num2, StringBuilder str2) {
        if (isNullOrEmpty(String.valueOf(str1)) || isNullOrEmpty(String.valueOf(str2))) {
            System.out.println("Passed null value for one or both of StringBuilder-type parameters or passed empty line:");
            return null;
        }
        return str1.append(num1).append(num2).append(str2);
    }


    /**
     * This method replaces spaces with newlines in String.
     *
     * @param str String str.
     * @return new already modified String.
     */
    public String newLineAfterWhiteSpace(String str) {
        if (isNullOrEmpty(str)) {
            System.out.println("Passed null value for String-type parameter or passed empty line:");
            return null;
        }

        char[] chars = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (chars[i] == ' ') {
                chars[i] = '\n';
            }
        }
        return String.valueOf(chars);
    }


    /**
     * This method reverses String.
     *
     * @param str String str.
     * @return new modified String.
     */
    public String reverse(String str) {
        if (isNullOrEmpty(str)) {
            System.out.println("Passed null value for String-type parameter or passed empty line:");
            return null;
        }

        char[] chars = str.toCharArray();
        for (int i = 0; i < str.length() / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[chars.length - i - 1];
            chars[chars.length - i - 1] = temp;
        }
        return String.valueOf(chars);
    }


    /**
     * This method counts how many times the given String occurs in the other given String.
     *
     * @param line  String line.
     * @param token String token.
     * @return counts of token in line.
     */
    public int countSubString(String line, String token) {
        if (isNullOrEmpty(line) || isNullOrEmpty(token)) {
            System.out.println("Passed null value for one or both of String-type parameters\n " +
                    "or passed empty lines for one or both of String-type parameters:");
            return -1;
        }
        if (token.length() > line.length()) {
            System.out.println("Length of parameter 'token' must be less or equal to length of parameter 'line':");
            return -1;
        }

        int count = 0;
        for (int i = 0; i <= line.length() - token.length(); i++) {
            if (token.equals(line.substring(i, token.length() + i))) {
                count++;
            }
        }
        return count;
    }


    /**
     * This method converts lowercase letters to uppercase in String.
     *
     * @param str String str.
     * @return new modified String.
     */
    public String toUpperCase(String str) {
        if (isNullOrEmpty(str)) {
            System.out.println("Passed null value for String-type parameter or passed empty line:");
            return null;
        }

        char[] chars = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (chars[i] >= 97 && chars[i] <= 122) {
                chars[i] -= 32;
            }
        }
        return String.valueOf(chars);
    }


    /**
     * This method converts lowercase letters to uppercase in StringBuilder.
     *
     * @param str StringBuilder str.
     * @return modified StringBuilder.
     */
    public StringBuilder toUpperCase(StringBuilder str) {
        if (isNullOrEmpty(String.valueOf(str))) {
            System.out.println("Passed null value for StringBuilder-type parameter or passed empty line:");
            return null;
        }

        for (int i = 0; i < str.length(); i++) {
            if (Character.isLowerCase(str.charAt(i))) {
                str.setCharAt(i, Character.toUpperCase(str.charAt(i)));
            }
        }
        return str;
    }


    // Գրել method,որը console-ից կարդում է 20 երկարությամբ սիմվոլների տող տպում այն, եթե տողի
    // երկարությունը պակաս է 20ից, ապա պետք է տողը լռացնենք պակաս սիմվոլների փոխարեն գրելով
    //«*» սիմվոլը
    public String method(String str) {
        if (isNullOrEmpty(str)) {
            System.out.println("Passed null value for String-type parameter or passed empty line:");
            return null;
        }
        if (str.length() >= 20) {
            return str.substring(0, 20);
        }

        String newStr = "";
        for (int i = str.length(); i < 20; i++) {
            str = str.concat("*");
            newStr = str;
        }
        return newStr;
    }


    /**
     * This method removes specified character from String.
     *
     * @param character char character.
     * @param str       String str.
     * @return new modified String.
     */
    public String removeCharacter(char character, String str) {
        if (isNullOrEmpty(str)) {
            System.out.println("Passed null value for String-type parameter or passed empty line:");
            return null;
        }

        int countNonCharacters = 0;
        char[] chars = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (chars[i] != character) {
                countNonCharacters++;
            }
        }

        char[] newChars = new char[countNonCharacters];
        for (int i = 0, j = 0; i < chars.length; i++) {
            if (chars[i] != character) {
                newChars[j] = chars[i];
                j++;
            }
        }
        return String.valueOf(newChars);
    }


    /**
     * This method removes specified character from StringBuilder.
     *
     * @param character char character.
     * @param str       String str.
     * @return modified StringBuilder.
     */
    public StringBuilder removeCharacter(char character, StringBuilder str) {
        if (isNullOrEmpty(String.valueOf(str))) {
            System.out.println("Passed null value for StringBuilder-type parameter or passed empty line:");
            return null;
        }

        for (int i = 0; i < str.length(); i++) {
            if (character == str.charAt(i)) {
                str.deleteCharAt(i);
            }
        }
        return str;
    }


    /**
     * This method replaces specified characters with specified character in String.
     *
     * @param str     String str.
     * @param oldChar char oldChar.
     * @param newChar char newChar.
     * @return new modified String.
     */
    public String replace(String str, char oldChar, char newChar) {
        if (isNullOrEmpty(str)) {
            System.out.println("Passed null value for String-type parameter or passed empty line:");
            return null;
        }

        char[] chars = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (chars[i] == oldChar) {
                chars[i] = newChar;
            }
        }
        return String.valueOf(chars);
    }


    /**
     * This method finds the longest word in the String.
     * In String a word is the set of characters between two spaces.
     * If there is two words with equal lengths, then will be returned first word.
     *
     * @param str String str.
     * @return the longest word in the String.
     */
    public String longestWord(String str) {
        if (isNullOrEmpty(str)) {
            System.out.println("Passed null value for String-type parameter or passed empty line:");
            return null;
        }

        List<String> listOfWords = new ArrayList<>(Arrays.asList(str.split(" ")));

        String longestWord = listOfWords.get(0);
        for (int i = 0; i < listOfWords.size(); i++) {
            if (longestWord.length() < listOfWords.get(i).length()) {
                longestWord = listOfWords.get(i);
            }
        }
        return longestWord;
    }


    /**
     * This method finds first index of a character in String.
     *
     * @param character char character.
     * @param str       String str.
     * @return first index of char, if str contains char, otherwise -1 .
     */
    public int firstIndexOf(char character, String str) {
        if (isNullOrEmpty(str)) {
            System.out.println("Passed null value for String-type parameter or passed empty line:");
            return -1;
        }

        int index = 0;
        boolean contains = false;
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == character) {
                index = i;
                contains = true;
                break;
            }
        }
        return contains ? index : -1;
    }


    /**
     * This method finds the specified subLine in String.
     *
     * @param str String str.
     * @param end int end. [0; str.length()).
     * @return the subLine.
     */
    public String subLine(String str, int end) {
        if (isNullOrEmpty(str)) {
            System.out.println("Passed null value for String-type parameter or passed empty line:");
            return null;
        }
        if (end < 0 || end >= str.length()) {
            System.out.println("Parameter end must be in range [0; str.length()):");
            return null;
        }

        char[] newChars = new char[end + 1];
        for (int i = 0; i < newChars.length; i++) {
            newChars[i] = str.charAt(i);
        }
        return String.valueOf(newChars);
    }


    /**
     * This method finds the specified subLine in StringBuilder.
     *
     * @param str String str.
     * @param end int end. [0; str.length()).
     * @return the subLine.
     */
    public StringBuilder subLine(StringBuilder str, int end) {
        if (isNullOrEmpty(String.valueOf(str))) {
            System.out.println("Passed null value for StringBuilder-type parameter or passed empty line:");
            return null;
        }
        if (end < 0 || end >= str.length()) {
            System.out.println("Parameter end must be in range [0; str.length()):");
            return null;
        }
        return str.delete(end + 1, str.length());
    }


    /**
     * This method finds the longest sentence in the String.
     * In String a word is the set of characters between two ','.
     * If there is two sentences with equal lengths, then will be returned first sentence..
     *
     * @param str String str
     * @return the longest word in the String.
     */
    public String longestSentence(String str) {
        if (isNullOrEmpty(str)) {
            System.out.println("Passed null value for String-type parameter or passed empty line:");
            return null;
        }

        List<String> listOfSentences = new ArrayList<>(Arrays.asList(str.split(",")));

        String longestSentence = listOfSentences.get(0);
        for (int i = 0; i < listOfSentences.size(); i++) {
            if (longestSentence.length() < listOfSentences.get(i).length()) {
                longestSentence = listOfSentences.get(i);
            }
        }
        return longestSentence;
    }


    /**
     * This method determines is the passed String null or empty.
     *
     * @param str String str.
     * @return true if str is null or empty, false otherwise.
     */
    public boolean isNullOrEmpty(String str) {
        return str == null || str.isEmpty();
    }
}