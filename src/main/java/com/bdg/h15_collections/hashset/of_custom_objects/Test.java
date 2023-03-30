package com.bdg.h15_collections.hashset.of_custom_objects;

import java.util.*;

import static com.bdg.h15_collections.hashset.of_custom_objects.Human.AgeComparator;

public class Test {

    public static void main(String[] args) {

        HashSet<Human> humans = new HashSet<>();
        humans.add(new Human("Bnay", 18));
        humans.add(new Human("Bobby", 90));
        humans.add(new Human("Patrick", 1));
        humans.add(new Human("Dummy", 20));
        humans.add(new Human("Reggie", 67));
        humans.add(new Human("Fndo", 5));

        ArrayList<Human> humanArrayList = new ArrayList<>(humans);
        Collections.sort(humanArrayList, AgeComparator);
        System.out.println(humanArrayList);

        //Object which is in TreeSet must implement Comparable interface.
        TreeSet<Human> humanTreeSet = new TreeSet<>(humans);
        System.out.println(humanTreeSet);
    }
}