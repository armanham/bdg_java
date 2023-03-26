package com.bdg.h13_collections.replacer;

import java.util.ArrayList;

public class Replacer<T> {

    /**
     * This method replaces elements of specified list with new specified element.
     *
     * @param list        ArrayList<T> - type.
     * @param oldElements T - type.
     * @param newElement  T - type.
     * @throws IllegalArgumentException if passed list is null or empty.
     */
    public void replaceAll(ArrayList<T> list, T oldElements, T newElement) throws IllegalArgumentException {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("Passed null or empty value: ");
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == null && oldElements == null) {
                list.set(i, newElement);
            }
            if (list.get(i) != null && list.get(i).equals(oldElements)) {
                list.set(i, newElement);
            }
        }
    }
}