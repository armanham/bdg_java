package com.bdg.h15.collections.treeset.notcommon_elements;

import java.util.TreeSet;

public class Test {

    public static void main(String[] args) {
        TreeSet<Integer> treeSet1 = new TreeSet<>();
        treeSet1.add(1);
        treeSet1.add(3);
        treeSet1.add(2);
        treeSet1.add(5);
        treeSet1.add(6);

        TreeSet<Integer> treeSet2 = new TreeSet<>();
        treeSet2.add(1);
        treeSet2.add(3);
        treeSet2.add(2);
        treeSet2.add(5);
        treeSet2.add(9);

        System.out.println(CollectorNotCommonElements.of(treeSet1, treeSet2));
    }
}
