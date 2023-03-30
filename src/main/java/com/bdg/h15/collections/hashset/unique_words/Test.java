package com.bdg.h15.collections.hashset.unique_words;

import java.util.HashSet;

public class Test {

    public static void main(String[] args) {

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Arm");
        hashSet.add("arm");
        hashSet.add("m");
        hashSet.add("M");
        hashSet.add("arman");
        hashSet.add("ma");
        hashSet.add("Ma");
        hashSet.add("MA");
        hashSet.add("");
        hashSet.add(null);

        System.out.println(CollectorUniqueWordsIgnoringCase.isItemPresentIgnoreCaseIn(null, hashSet));
        System.out.println(CollectorUniqueWordsIgnoringCase.isItemPresentIgnoreCaseIn("", hashSet));
        System.out.println(hashSet);

        HashSet<String> strings = CollectorUniqueWordsIgnoringCase.of(hashSet);
        System.out.println(strings);
    }
}