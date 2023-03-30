package com.bdg.h15_collections.linkedhashset.removing_even_integers;

import java.util.LinkedHashSet;

public class Test {

    public static void main(String[] args) {
        LinkedHashSet<Integer> integers = new LinkedHashSet<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);
        integers.add(6);
        integers.add(null);
        System.out.println(integers);

        RemoverEvenNumbers removerEvenNumbers = new RemoverEvenNumbers();
        removerEvenNumbers.of(integers);
        System.out.println(integers);
    }
}