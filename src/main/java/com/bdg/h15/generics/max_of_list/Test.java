package com.bdg.h15.generics.max_of_list;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(23);
        integers.add(54);
        integers.add(0);
        integers.add(2);

        System.out.println(MaxFounder.maxOf(integers));
        System.out.println(integers);
    }
}