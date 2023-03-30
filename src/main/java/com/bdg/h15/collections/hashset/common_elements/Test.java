package com.bdg.h15.collections.hashset.common_elements;

import java.util.HashSet;

public class Test {

    public static void main(String[] args) {
        HashSet<Integer> integers1 = new HashSet<>();
        integers1.add(1);
        integers1.add(2);
        integers1.add(3);
        integers1.add(44);
        integers1.add(55);
        integers1.add(0);
        integers1.add(1);
        integers1.add(77);
        integers1.add(7);
        System.out.println(integers1);

        HashSet<Integer> integers2 = new HashSet<>();
        integers2.add(1);
        integers2.add(2);
        integers2.add(3);
        integers2.add(444);
        integers2.add(55);
        integers2.add(6);
        integers2.add(1);
        integers2.add(777);
        integers2.add(7);
        System.out.println(integers2);

        HashSet<Integer> commonEl = CollectorCommonElements.of(integers1, integers2);
        System.out.println(commonEl);
    }
}