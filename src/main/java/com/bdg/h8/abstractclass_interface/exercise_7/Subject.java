package com.bdg.h8.abstractclass_interface.exercise_7;

public class Subject {

    private String name;

    private int mark;

    public Subject(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }

    public void setMark(int mark) {
        if (mark >= 0 && mark <= 100) {
            this.mark = mark;
        }
    }

    public int getMark() {
        return mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
