package com.bdg.h13_collections.stack;

import java.util.ArrayList;

public class Stack<T> {

    private int capacity;
    private int top = -1;
    private ArrayList<T> stack = new ArrayList<>(capacity);

    public Stack(int capacity) {
        this.capacity = capacity;
    }

    public boolean push(T element) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow: ");
            return false;
        } else {
            top++;
            stack.add(element);
            return true;
        }
    }

    public boolean pop() {
        if (top == -1) {
            System.out.println("Stack Underflow: ");
            return false;
        } else {
            System.out.println("Item popped: " + stack.remove(top));
            top--;
            return true;
        }
    }

    public T peek() {
        if (top == -1){
            System.out.println("Stack is empty: ");
            return null;
        }
        return stack.get(top);
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int ensureCapacity() {
        return capacity += 10;
    }

    public int trimToSize() {
        capacity = stack.size();
        return capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getTop() {
        return top;
    }

    public ArrayList<T> getStack() {
        return stack;
    }
}