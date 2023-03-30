package com.bdg.h15.generics.swapper_of_elements_of_array;

import com.bdg.h15.generics.swapper_of_elements_of_array.Swapper;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        Integer[] array = new Integer[]{1, 2, 3, 4, null, 10};
        System.out.println(Arrays.toString(array));


        Swapper.swap(array, null, 1);
        System.out.println(Arrays.toString(array));
    }
}