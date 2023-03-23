package com.bdg.h13_collections.replacer;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {
        Replacer<String> replacer = new Replacer<>();
        ArrayList<String> strings = new ArrayList<>();
        strings.add("A");
        strings.add("A");
        strings.add(null);
        strings.add("B");
        strings.add("C");
        strings.add(null);
        strings.add("A");
        System.out.println(strings);

        replacer.replaceAll(strings, "B", null);
        System.out.println(strings);

    }
}
