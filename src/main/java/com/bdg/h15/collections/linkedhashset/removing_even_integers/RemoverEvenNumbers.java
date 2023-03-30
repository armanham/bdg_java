package com.bdg.h15.collections.linkedhashset.removing_even_integers;

import java.util.LinkedHashSet;

public class RemoverEvenNumbers {

    public void of(LinkedHashSet<Integer> integers) throws IllegalArgumentException {
        if (integers == null || integers.isEmpty()) {
            throw new IllegalArgumentException("Passed null or empty value: ");
        }
        integers.removeIf(this::isEven);
    }

    private boolean isEven(Integer item) {
        if (item == null) {
            return false;
        }
        return item % 2 == 0;
    }
}