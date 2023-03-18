package com.bdg.h7_strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringAdditionalEx {

    private StringUtil_1 util_1 = new StringUtil_1();

    /**
     * This method reverses String.
     *
     * @param str String-type.
     * @return new modified String.
     */
    public String reverse(String str) {
        if (util_1.isNullOrEmpty(str)) {
            System.out.println("Passed null or empty values:");
            return null;
        }

        char[] chars = str.toCharArray();
        char[] newChars = new char[str.length()];

        for (int i = newChars.length - 1, j = 0; i >= 0; i--) {
            newChars[j] = chars[i];
            j++;
        }
        return String.valueOf(newChars);
    }


    /**
     * This method counts sum of digits in String.
     *
     * @param str String-type.
     * @return sum of digits.
     */
    public long sumOfDigits(String str) {
        if (util_1.isNullOrEmpty(str)) {
            System.out.println("Passed null or empty values:");
            return 0L;
        }

        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                sum += Character.getNumericValue(str.charAt(i));
            }
        }
        return sum;
    }


    /**
     * This method converts lowercase letters to uppercase in String.
     *
     * @param str String-type.
     * @return new modified String.
     */
    public String toUpperCase(String str) {
        if (util_1.isNullOrEmpty(str)) {
            System.out.println("Passed null or empty values:");
            return null;
        }

        char[] chars = str.toCharArray();

        for (int i = 0; i < str.length(); i++) {
            if (Character.isLowerCase(chars[i])) {
                chars[i] = Character.toUpperCase(chars[i]);
            }
        }
        return String.valueOf(chars);
    }


    /**
     * This method converts odd lowercase letters to uppercase in String.
     *
     * @param str String-type.
     * @return new modified String.
     */
    public String toUpperCaseOddLetters(String str) {
        if (util_1.isNullOrEmpty(str)) {
            System.out.println("Passed null or empty values:");
            return null;
        }

        char[] chars = str.toCharArray();

        for (int i = 0; i < str.length(); i++) {
            if (Character.isLowerCase(chars[i]) && i % 2 == 0) {
                chars[i] = Character.toUpperCase(chars[i]);
            }
        }
        return String.valueOf(chars);
    }


    /**
     * This method combines two Strings.
     * mix("aaa", "BBB") → "aBaBaB"
     * mix("good one", "111") → "g1o1o1d one"
     *
     * @param str1 String-type.
     * @param str2 String-type.
     * @return new mixed String.
     */
    public String mix(String str1, String str2) {
        if (util_1.isNullOrEmpty(str1) || util_1.isNullOrEmpty(str2)) {
            System.out.println("Passed null or empty values:");
            return null;
        }

        String mixedString = "";
        int longestLength;

        if (str1.length() >= str2.length()) {
            longestLength = str1.length();
        } else {
            longestLength = str2.length();
        }

        for (int i = 0; i < longestLength; i++) {
            if (i < str1.length()) {
                mixedString += str1.charAt(i);
            }
            if (i < str2.length()) {
                mixedString += str2.charAt(i);
            }
        }
        return mixedString;
    }


    /**
     * This method counts quantity of words in String.
     * In String a word is the set of characters between two spaces.
     *
     * @param str String-type.
     * @return number of words.
     */
    public int numberOfWords(String str) {
        if (util_1.isNullOrEmpty(str)) {
            System.out.println("Passed null or empty values:");
            return -1;
        }

        List<String> stringList = new ArrayList<>(Arrays.asList(str.split(" ")));
        return stringList.size();
    }


    public String[] revertWords(String str) {
        if (util_1.isNullOrEmpty(str)) {
            System.out.println("Passed null or empty values:");
            return null;
        }
        //TODO revertWords Brat jan

        StringBuilder sb = new StringBuilder();
        String[] words = str.split(" ");
        for (int i = 0; i < words.length / 2; i++) {
            if (words[i].endsWith(".")) {
                words[i] = words[i].substring(words[i].charAt(0), words[i].length() - 1);
                String temp = words[i];
                words[i] = words[words.length - i - 1] + ".";
                words[words.length - i - 1] = temp;
            } else if (words[words.length - i - 1].endsWith(".")) {
                words[words.length - i - 1] = words[words.length - i - 1].substring(words[i].charAt(0), words[words.length - i - 1].length() - 1);
                String temp = words[i];
                words[i] = words[words.length - i - 1];
                words[words.length - i - 1] = temp + ".";
            } else {
                String temp = words[i];
                words[i] = words[words.length - i - 1];
                words[words.length - i - 1] = temp;
            }
        }

        return words;
    }


    /**
     * This method counts how many times the given String occurs in the other given String.
     *
     * @param str    String-type.
     * @param subStr String-type.
     * @return counts of subStr in str.
     */
    public int howManyOccurrences(String str, String subStr) {
        if (util_1.isNullOrEmpty(str) || util_1.isNullOrEmpty(subStr)) {
            System.out.println("Passed null or empty values:");
            return -1;
        }
        if (subStr.length() > str.length()) {
            System.out.println("Length of sunStr must be less or equal to length of str");
            return -1;
        }

        List<String> subStringsList = new ArrayList<>();
        int count = 0;

        for (int i = 0; i <= str.length() - subStr.length(); i++) {
            subStringsList.add(str.substring(i, i + subStr.length()));
        }
        for (String item : subStringsList) {
            if (subStr.equals(item)) {
                count++;
            }
        }
        return count;
    }


    /**
     * This method returns new String sorted in descending order(ASCII).
     *
     * @param str String-type.
     * @return new modified String sorted in descending order(ASCII).
     */
    public String descendingOrderASCII(String str) {
        if (util_1.isNullOrEmpty(str)) {
            System.out.println("Passed null or empty values:");
            return null;
        }

        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length - 1; i++) {
            for (int j = 0; j < chars.length - i - 1; j++) {
                if (chars[j] < chars[j + 1]) {
                    char temp = chars[j];
                    chars[j] = chars[j + 1];
                    chars[j + 1] = temp;
                }
            }
        }
        return String.valueOf(chars);
    }


    /**
     * This method compresses a String.
     * compressString("kkkktttrrrrrrrrrr") → "k4t3r10"
     * compressString("p555ppp7www") → "p153p371w3"
     *
     * @param str String-type.
     * @return new modified String.
     */
    public String compressString(String str) {
        if (util_1.isNullOrEmpty(str)) {
            System.out.println("Passed null or empty values:");
            return null;
        }

        char[] chars = str.toCharArray();
        int count = 0;
        char currentChar = str.charAt(0);
        String newStr = "";

        for (char character : chars) {
            if (character == currentChar) {
                count++;
            } else {
                newStr += String.valueOf(currentChar) + count;
                currentChar = character;
                count = 1;
            }
        }
        newStr += String.valueOf(currentChar) + count;
        return newStr;
    }
}