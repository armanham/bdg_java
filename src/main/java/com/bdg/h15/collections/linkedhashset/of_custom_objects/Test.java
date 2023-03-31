package com.bdg.h15.collections.linkedhashset.of_custom_objects;

import com.bdg.h15.collections.linkedhashset.remover.RemoverOfHumansWithDuplicateName;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Test {

    public static void main(String[] args) {

        LinkedHashSet<Human> humans = new LinkedHashSet<>();
        humans.add(new Human("Bnay", 18));
        humans.add(new Human("Bobby", 90));
        humans.add(new Human("Patrick", 1));
        humans.add(new Human("Dummy", 20));
        humans.add(new Human("Reggie", 67));
        humans.add(new Human("Reggie", 8));
        humans.add(new Human("Fndo", 5));
        humans.add(new Human("Fndo", 5));
        humans.add(new Human("Fndo", 7));

        ArrayList<Human> humanArrayList = new ArrayList<>(humans);
        humanArrayList.sort(Human.AgeComparator);
        System.out.println(humanArrayList);

        //Object which is in TreeSet must implement Comparable interface.
        TreeSet<Human> humanTreeSet = new TreeSet<>(humans);
        System.out.println(humanTreeSet);

        RemoverOfHumansWithDuplicateName.of(humans);
        System.out.println(humans);
    }
}