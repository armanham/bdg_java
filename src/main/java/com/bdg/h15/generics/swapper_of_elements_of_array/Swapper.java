package com.bdg.h15.generics.swapper_of_elements_of_array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Swapper {

    public static <T> void swap(T[] array, T element1, T element2) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Passed null or empty value: ");
        }

        List<T> arrayList = Arrays.asList(array);
        int indexOfE1 = arrayList.indexOf(element1);
        int indexOfE2 = arrayList.indexOf(element2);

        if (indexOfE1 == -1 || indexOfE2 == -1){
            System.out.println("One of or both of passed elements not found in passed array: ");
            return;
        }

        Collections.swap(arrayList, indexOfE1, indexOfE2);
        array = (T[]) arrayList.toArray();
    }
}