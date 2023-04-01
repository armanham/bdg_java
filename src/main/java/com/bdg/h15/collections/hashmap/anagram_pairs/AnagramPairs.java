package com.bdg.h15.collections.hashmap.anagram_pairs;

import java.util.Arrays;
import java.util.HashMap;

public class AnagramPairs {

    public static HashMap<String, String> of(String[] strings) {
        if (strings.length == 0) {
            return null;
        }

        HashMap<String, String> anagrams = new HashMap<>();
        for (int i = 0; i < strings.length - 1; i++) {
            for (int j = i + 1; j < strings.length; j++) {
                if (areAnagrams(strings[i], strings[j])) {
                    anagrams.put(strings[i], strings[j]);
                }
            }
        }
        return anagrams;
    }

    private static boolean areAnagrams(String str1, String str2) {
        if (str1 == null && str2 == null){
            return true;
        }
        if (str1 == null || str2 == null){
            return false;
        }
        if (str1.isEmpty() || str2.isEmpty()) {
            return false;
        }
        if (str1.length() != str2.length()) {
            return false;
        }

        char[] arrayStr1 = str1.toCharArray();
        char[] arrayStr2 = str2.toCharArray();
        Arrays.sort(arrayStr1);
        Arrays.sort(arrayStr2);

        return Arrays.equals(arrayStr1, arrayStr2);
    }
}