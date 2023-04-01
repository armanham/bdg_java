package com.bdg.h15.collections.hashmap.anagram_pairs;

public class Test {

    public static void main(String[] args) {
        String[] strings = {"dog", "god", "cat", "act", "mice", null};
        System.out.println(AnagramPairs.of(strings));
    }
}