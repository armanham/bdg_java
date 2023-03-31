package com.bdg.h15.generics.specific_property;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        CounterWithSpecificProperty counterWithSpecificProperty = new CounterWithSpecificProperty();

        List<String> strings = new ArrayList<>();
        strings.add("ArarA");
        strings.add("A");
        strings.add("AmmA");
        strings.add("Ar");
        strings.add("AA");

        System.out.println(counterWithSpecificProperty.countOfPalindromesIn(strings));
    }
}