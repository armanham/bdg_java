package com.bdg.h13_collections.stack;

public class Test {
    public static void main(String[] args) {
        Stack<String> stringStack = new Stack<>(5);
        stringStack.push("a");
        stringStack.push("b");
        stringStack.push("c");
        stringStack.push("d");
        stringStack.push("e");
        System.out.println(stringStack.peek());

        stringStack.ensureCapacity();
        System.out.println(stringStack.getCapacity());
        stringStack.push("f");
        System.out.println(stringStack.peek());

        stringStack.pop();
        stringStack.pop();
        stringStack.pop();
        stringStack.pop();
        stringStack.pop();

        System.out.println(stringStack.getStack());
        System.out.println(stringStack.getTop());
        System.out.println(stringStack.getCapacity());

        stringStack.trimToSize();
        System.out.println(stringStack.getCapacity());

        System.out.println(stringStack.isEmpty());
        stringStack.pop();

        System.out.println(stringStack.isEmpty());
        System.out.println(stringStack.peek());
    }
}