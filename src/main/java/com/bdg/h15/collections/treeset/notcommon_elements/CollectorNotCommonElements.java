package com.bdg.h15.collections.treeset.notcommon_elements;

import java.util.TreeSet;

public class CollectorNotCommonElements {

    /**
     * This method find and collect the elements of first argument in new TreeSet,
     * when elements contained in first TreeSet, but not in second.
     *
     * @param treeSet1 - TreeSet<E> - type.
     * @param treeSet2 - TreeSet<E> - type.
     * @param <E>      - Must be Comparable.
     * @return new TreeSet which contains elements only of first argument.
     * @throws NullPointerException, if passed null value as an argument.
     */
    public static <E extends Comparable<E>> TreeSet<E> of(TreeSet<E> treeSet1,
                                                          TreeSet<E> treeSet2) throws NullPointerException {
        if (treeSet1 == null || treeSet2 == null) {
            throw new NullPointerException("Passed null TreeSet: ");
        }

        if (treeSet1.isEmpty() && treeSet2.isEmpty()) {
            return treeSet1;
        }
        if (treeSet1.isEmpty()) {
            return treeSet2;
        }
        if (treeSet2.isEmpty()) {
            return treeSet1;
        }

        TreeSet<E> notCommonElements = new TreeSet<>();
        for (E item : treeSet1) {
            if (!treeSet2.contains(item)) {
                notCommonElements.add(item);
            }
        }
        return notCommonElements;
    }
}