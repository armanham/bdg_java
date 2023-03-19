package com.bdg.h12.complexity;

public class Complexity {

    //n^n complexity
    public void print(int repeat_nEXPn, String text) {
        for (int i = 1; i <= Math.pow(repeat_nEXPn, repeat_nEXPn); i++) {
            System.out.println(i + " " + text);
        }
    }
}