package com.bdg.h15.generics.max_of_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxFounder {

    public static <T> T maxOf(List<T> list) {
        List<T> sorted = new ArrayList<>(list);
        sorted.sort(Collections.reverseOrder());

        return sorted.get(0);
    }
}