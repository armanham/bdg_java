package com.bdg.h14_collections.exercise6;

import java.util.Comparator;

public class Human implements Comparable<Human> {

    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public int compare(Human o1, Human o2) {
        return o1.getAge() - o2.getAge();
    }

    @Override
    public int compareTo(Human o) {
        return this.getAge() - o.getAge();
    }
}