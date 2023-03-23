package com.bdg.h13_collections.integer_sequence;

public class Test {

    public static void main(String[] args) {
        IntegerSequence integerSequence = new IntegerSequence(1,1, 0, 0, 2, 2, 2);
//        System.out.println(integerSequence.sum());
//        System.out.println(integerSequence.averageSum());
//        integerSequence.sort();
//        System.out.println(integerSequence.getSequence());
//        integerSequence.removeNegatives();
//        System.out.println(integerSequence.getSequence());
        integerSequence.removeMembersWithOddFrequency();
        System.out.println(integerSequence.getSequence());

    }
}
