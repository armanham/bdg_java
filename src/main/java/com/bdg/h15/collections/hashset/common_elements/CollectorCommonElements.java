package com.bdg.h15.collections.hashset.common_elements;

import java.util.HashSet;

public class CollectorCommonElements {

    /**
     * This method finds and collects common elements of two HashSets of Integers.
     *
     * @param hashSet1 HashSet<Integer> - type.
     * @param hashSet2 HashSet<Integer> - type.
     * @return new HashSet<Integer> of common elements.
     * @throws IllegalArgumentException if passed null or empty value as an argument.
     */
    public static HashSet<Integer> of(HashSet<Integer> hashSet1,
                                      HashSet<Integer> hashSet2) throws IllegalArgumentException {
        if (hashSet1 == null || hashSet1.isEmpty() || hashSet2 == null || hashSet2.isEmpty()) {
            throw new IllegalArgumentException("Passed null or empty value: ");
        }

        HashSet<Integer> commonElements = new HashSet<>();

        for (Integer itemOfHashSet1 : hashSet1) {
            if (hashSet2.contains(itemOfHashSet1)) {
                commonElements.add(itemOfHashSet1);
            }
        }
        return commonElements;
    }
}