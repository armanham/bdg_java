package com.bdg.h15.collections.linkedhashset.remover;

import com.bdg.h15.collections.linkedhashset.of_custom_objects.Human;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class RemoverOfHumansWithDuplicateName {

    public static void of(LinkedHashSet<Human> humans) {
        if (humans == null) {
            throw new NullPointerException("Passed null " + humans.getClass().getName());
        }

        if (humans.isEmpty()) {
            return;
        }

        HashSet<String> names = new HashSet<>(humans.size());
        for (Human item : humans) {
            names.add(item.getName());
        }

        for (String name : names) {
            int counter = 0;
            Iterator<Human> iterator = humans.iterator();
            while (iterator.hasNext()){
                if (name.equals(iterator.next().getName())){
                    counter++;
                    if (counter > 1){
                        iterator.remove();
                    }
                }
            }
        }
    }
}