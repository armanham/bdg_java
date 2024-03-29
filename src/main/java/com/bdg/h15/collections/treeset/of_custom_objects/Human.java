package com.bdg.h15.collections.treeset.of_custom_objects;

import java.util.Comparator;
import java.util.Objects;

public class Human implements Comparable<Human>{

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

    public static Comparator<Human> AgeComparator = new Comparator<Human>() {
        @Override
        public int compare(Human human1, Human human2) {
            return human1.getAge() - human2.getAge();
        }
    };

    public static Comparator<Human> NameComparator = new Comparator<Human>() {
        @Override
        public int compare(Human human1, Human human2) {
            return human1.getName().compareTo(human2.getName());
        }
    };

    @Override
    public int compareTo(Human o) {
        return this.getAge() - o.getAge();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return age == human.age && Objects.equals(name, human.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}