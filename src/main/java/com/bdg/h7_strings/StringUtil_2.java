package com.bdg.h7_strings;

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


    /**
     * This method determines is possible to make passed string to palindrome.
     *
     * @param str String-type.
     * @return true if passed string possible to make palindrome, false otherwise.
     */
    public boolean isPossibleToMakePalindrome(String str) {
        if (util_1.isNullOrEmpty(str)) {
            System.out.println("Passed null or empty value:");
            return false;
        }
        if (isPalindrome(str)) {
            return true;
        }

        List<Character> characters = allCharacters(str);
        List<Integer> listOfCountsDiffCharsInString = new ArrayList<>();

        for (int i = 0; i < characters.size(); i++) {
            listOfCountsDiffCharsInString.add(countCharacterInString(characters.get(i), str));
        }
        return oddNumbersCount(listOfCountsDiffCharsInString) == 0 || oddNumbersCount(listOfCountsDiffCharsInString) == 1;
    }


    //Given a list of strings, write a method that returns a list of all strings that
    //start with the letter 'a' (lower case) and have exactly 3 letters.
    public List<String> method4(List<String> stringList) {
        if (stringList == null || stringList.isEmpty()) {
            System.out.println("Passed null or empty parameter:");
            return null;
        }

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
     * 8.98 -> i8e98.
     *
     * @param number double-type.
     * @return number in String.
     */
    public String presentFloatingPointNumber(double number) {
        String numStr = String.valueOf(number);
        String[] splitNum = numStr.split("\\.");
        return "i" + splitNum[0] + "e" + splitNum[1];
    }


    /**
     * This method determines is numbers in list of integers odd or even.
     * [5,2,31,0] -> [o5, e2, o31, e0].
     *
     * @param integers List<Integer>-type
     * @return String of numbers specified any number with 'e' or 'o'.
     */
    public String oddEvenNumbers(List<Integer> integers) {
        if (integers == null || integers.isEmpty()) {
            System.out.println("Passed null or empty value:");
            return null;
        }

        List<String> list = new ArrayList<>();
        for (int i = 0; i < integers.size(); i++) {
            if (integers.get(i) % 2 == 0) {
                list.add("e" + integers.get(i));
            } else {
                list.add("o" + integers.get(i));
            }
        }
        return String.valueOf(list);
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


    /**
     * This method finds common longest sequence in two Strings.
     *
     * @param str1 String-type.
     * @param str2 String-type.
     * @return the longest common sequence in two Strings.
     */
    public String longestCommonSubSequence(String str1, String str2) {
        if (util_1.isNullOrEmpty(str1) || util_1.isNullOrEmpty(str2)) {
            System.out.println("Passed null or empty value:");
            return "";
        }

        List<String> sequencesStr1 = allSequences(str1);
        List<String> sequencesStr2 = allSequences(str2);
        List<String> commonSequences = new ArrayList<>();

        for (int i = 0; i < sequencesStr1.size(); i++) {
            for (String item : sequencesStr2) {
                if (sequencesStr1.get(i).equals(item)) {
                    commonSequences.add(item);
                }
            }
        }

        int longestLength = commonSequences.get(0).length();
        int index = 0;
        for (int i = 0; i < commonSequences.size(); i++) {
            if (longestLength <= commonSequences.get(i).length()) {
                longestLength = commonSequences.get(i).length();
                index = i;
            }
        }
        return commonSequences.get(index);
    }


    /**
     * This method finds count of common characters in two Strings.
     * One character counts once.
     *
     * @param str1 String-type.
     * @param str2 String-type.
     * @return the longest common sequence in two Strings.
     */
    public int countCommonCharacters(String str1, String str2) {
        if (util_1.isNullOrEmpty(str1) || util_1.isNullOrEmpty(str2)) {
            System.out.println("Passed null or empty value:");
            return -1;
        }

        List<Character> charactersStr1 = allCharacters(str1);
        List<Character> charactersStr2 = allCharacters(str2);
        List<Character> commonCharacters = new ArrayList<>();

        for (int i = 0; i < charactersStr1.size(); i++) {
            for (Character item : charactersStr2) {
                if (charactersStr1.get(i).equals(item)) {
                    commonCharacters.add(item);
                }
            }
        }
        return commonCharacters.size();
    }


    public String parenthesesReverse(String str) {
        if (util_1.isNullOrEmpty(str)) {
            System.out.println("Passed null or empty value:");
            return null;
        }

//        int countOfOpenParentheses = 0;
//        int countOfCloseParentheses = 0;
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == '(') {
//                countOfOpenParentheses++;
//            }
//            if (str.charAt(i) == ')') {
//                countOfCloseParentheses++;
//            }
//        }
//        if (countOfOpenParentheses != countOfCloseParentheses) {
//            System.out.println("Counts of open and close parentheses in the String must be equal");
//            return null;
//        }

        //TODO APEEEEE   || str.indexOf('(') == -1
        //TODO EGHO PAKAGIC
        if (str.indexOf(')') < str.indexOf('(') ) {
            return null;
        }

        StringBuilder sb = new StringBuilder(str);

        for (int i = sb.indexOf("("); i < sb.lastIndexOf(")"); i++) {
            if (sb.charAt(i) == '(' && i < sb.indexOf(")")){
                sb.deleteCharAt(i);
            }

        }

//        for (int i = sb.lastIndexOf("("); i >= 0; i--) {
//            for (int j = sb.indexOf(")"); j <= sb.lastIndexOf(")"); j++) {
//                if (sb.charAt(i) == '(' && sb.charAt(j) == ')') {
//                    String reversedSubStr = util_1.reverse(sb.substring(i, j + 1));
//                    sb.replace(i, j + 1, reversedSubStr);
//                    sb.deleteCharAt(j);
//                    sb.deleteCharAt(i);
//                }
//            }
//        }
        return String.valueOf(sb);
    }


    /**
     * This method finds and collects all subStrings in String.
     * Duplicates not allowed.
     *
     * @param str String-type.
     * @return list of subStrings.
     */
    public List<String> allSequences(String str) {
        if (util_1.isNullOrEmpty(str)) {
            System.out.println("Passed null or empty value:");
            return null;
        }

        List<String> sequences = new ArrayList<>();
        for (int i = 0; i < str.length() - 1; i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (!sequences.contains(str.substring(i, j + 1))) {
                    sequences.add(str.substring(i, j + 1));
                }
            }
        }
        return sequences;
    }


    /**
     * This method finds and collects all characters in String.
     * Duplicates not allowed.
     *
     * @param str String-type.
     * @return list of characters.
     */
    public List<Character> allCharacters(String str) {
        if (util_1.isNullOrEmpty(str)) {
            System.out.println("Passed null or empty value:");
            return null;
        }

        List<Character> characters = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            if (!characters.contains(str.charAt(i))) {
                characters.add(str.charAt(i));
            }
        }
        return characters;
    }


    /**
     * This method counts how many times the given char occurs in the given string.
     *
     * @param character char-type.
     * @param str       String-type.
     * @return the number how many times the char occurs in the string.
     */
    public int countCharacterInString(char character, String str) {
        if (util_1.isNullOrEmpty(str)) {
            System.out.println("Passed null or empty value:");
            return -1;
        }

        if (!str.contains(String.valueOf(character))) {
            return -1;
        }

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (character == str.charAt(i)) {
                count++;
            }
        }
        return count;
    }


    /**
     * This method finds count of odd numbers in any integerList.
     *
     * @param integers List<Integer>-type.
     * @return count of odd numbers in list.
     */
    public int oddNumbersCount(List<Integer> integers) {
        if (integers == null || integers.isEmpty()) {
            System.out.println("Passed null or empty value");
            return -1;
        }

        int count = 0;
        for (int item : integers) {
            if (item % 2 != 0) {
                count++;
            }
        }
        return count;
    }


    /**
     * This method finds count of even numbers in any integerList.
     *
     * @param integers List<Integer>-type.
     * @return count of even numbers in list.
     */
    public int evenNumbersCount(List<Integer> integers) {
        if (integers == null || integers.isEmpty()) {
            System.out.println("Passed null or empty value");
            return -1;
        }

        int count = 0;
        for (int item : integers) {
            if (item % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}