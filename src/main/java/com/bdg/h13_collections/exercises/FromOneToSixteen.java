package com.bdg.h13_collections.exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class FromOneToSixteen {

    public static void main(String[] args) {

        //1. Write a Java program to iterate through all elements in an array list.
        List<String> stringList = new ArrayList<>(List.of("A", "B", "C", "D", "E"));
        for (String item : stringList) {
            System.out.print(item + " ");
        }
        System.out.println();

        //2. Write a Java program to insert an element into the array list at the first position.
        stringList.add(0, "F");
        for (String item : stringList) {
            System.out.print(item + " ");
        }
        System.out.println();

        //3. Write a Java program to update specific array element by given element.
        stringList.set(2, "S");
        for (String item : stringList) {
            System.out.print(item + " ");
        }
        System.out.println();

        //4. Write a Java program to search an element in an array list.
        int indexOfA = stringList.indexOf("A");
        System.out.println("Index of specified element is: (if =-1, element not found) " + indexOfA);
        boolean containsJ = stringList.contains("J");
        System.out.println("Contains specified element: " + containsJ);

        //5. Write a Java program to copy one array list into another.
        List<String> copyOfStringList = new ArrayList<>(stringList);
        System.out.println(copyOfStringList);

        //6. Write a Java program to reverse elements in an array list.
        Collections.reverse(stringList);
        System.out.println(stringList);

        //7. Write a Java program of swap two elements in an array list.
        Collections.swap(stringList, 1, 4);
        System.out.println(stringList);

        //8. Write a Java program to test an array list is empty or not.
        if (stringList.isEmpty()) {
            System.out.println("Specified list is empty: ");
        } else {
            System.out.println("Specified list is not empty: ");
        }

        //9. Write a Java program to increase the size of an array list.
        ArrayList<String> automobiles = new ArrayList<>(3);
        automobiles.add("Audi");
        automobiles.add("BMW");
        automobiles.add("Bugatti");
        System.out.println("Original array list: " + automobiles);
        automobiles.ensureCapacity(7);
        automobiles.add("Ford");
        automobiles.add("Mercedes");
        automobiles.add("Hyundai");
        automobiles.add("Ferrari");
        System.out.println("New Increased array list: " + automobiles);

        //10. Write a Java program to iterate through all elements in a linked list.
        LinkedList<Integer> integerList = new LinkedList<>(List.of(1, 3, 5, 7, 9));
        for (int item : integerList) {
            System.out.print(item + " ");
        }
        System.out.println();

        //11. Write a Java program to iterate a linked list in reverse order.
        Collections.reverse(integerList);
        for (int item : integerList) {
            System.out.print(item + " ");
        }
        System.out.println();

//        for (int i = integerList.size() - 1; i >= 0; i--) {
//            System.out.print(integerList.get(i) + " ");
//        }
//        System.out.println();

        //12. Write a Java program to insert elements into the linked list
        // at the first and last position.
        integerList.addFirst(77);
        integerList.add(88);
        System.out.println(integerList);

        //13. Write a Java program to insert the specified element at the end of a linked list.
        integerList.addLast(99);
        System.out.println(integerList);

        //14. Write a Java program to remove first and last element from a linked list.
        integerList.remove(integerList.getFirst());
        integerList.remove(integerList.getLast());
        System.out.println(integerList);

        //15. Write a Java program to clone a linked list to another linked list.
        LinkedList<Integer> newIntegerList = (LinkedList<Integer>) integerList.clone();
        System.out.println(newIntegerList);

        //Բացատրել differences between copy and clone, կարդացել եմ ընդհանուր, կան նաև copy-ների
        //տարատեսակներ, եթե հետո անցնելու ենք դրանց մասին, կարանք բաց թողնենք:


        //16. Write a Java program to test a linked list is empty or not.
        if (integerList.isEmpty()) {
            System.out.println("Specified list is empty: ");
        } else {
            System.out.println("Specified list is not empty: ");
        }
    }
}