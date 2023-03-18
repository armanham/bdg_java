package com.bdg.h8.abstractclass_interface.exercise_5;

public class ChildFirst extends Parent{

    public int countOfBros(){
        return countOfChild - 1;
    }

    public int parentAge(){
        return super.getAge();
    }
}
