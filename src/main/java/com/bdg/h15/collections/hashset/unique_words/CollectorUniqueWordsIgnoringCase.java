package com.bdg.h15.collections.hashset.unique_words;

import java.util.HashSet;

public class CollectorUniqueWordsIgnoringCase {

    public static HashSet<String> of(HashSet<String> strings) throws IllegalArgumentException {
        if (strings == null || strings.isEmpty()) {
            throw new IllegalArgumentException("Passed null or empty value: ");
        }

        HashSet<String> uniqueWords = new HashSet<>();

        for (String item : strings) {
            if (uniqueWords.isEmpty()) {
                uniqueWords.add(item);
            }
            if (item == null || item.isEmpty()) {
                uniqueWords.add(item);
            }
            if (!isItemPresentIgnoreCaseIn(item, uniqueWords)) {
                uniqueWords.add(item);
            }
        }

        return uniqueWords;
    }

    public static boolean isItemPresentIgnoreCaseIn(String item, HashSet<String> hashSet) {
        if (hashSet == null || hashSet.isEmpty()) {
            throw new IllegalArgumentException("Passed null or empty value: ");
        }
        for (String itemHashSet : hashSet) {
            if (itemHashSet == null && item == null) {
                return true;
            }
            if (itemHashSet != null && itemHashSet.equalsIgnoreCase(item)) {
                return true;
            }
        }
        return false;
    }
}