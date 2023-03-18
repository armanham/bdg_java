package com.bdg.h10_enum.seasons;

public class Test {
    public static void main(String[] args) {
        SeasonsService service = new SeasonsService();
        System.out.println(service.getSeason(100));
    }
}
