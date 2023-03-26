package com.bdg.h13_collections.stack;

import java.util.ArrayList;

public class Stack<T> {

    private int capacity;
    private int top = -1;
    private ArrayList<T> stack = new ArrayList<>(capacity);

    public Stack(int capacity) {
        this.capacity = capacity;
    }

    /**
     * This method adds element on the top of stack.
     *
     * @param element T - type.
     * @return true, if element added successfully, false otherwise.
     */
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

    /**
     * This method removes element on the top of stack.
     *
     * @return true, if element removed successfully, false otherwise.
     */
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

    /**
     * This method gets element from the top of stack, but does not remove it.
     *
     * @return element from the top of stack.
     */
    public T peek() {
        if (top == -1) {
            System.out.println("Stack is empty: ");
            return null;
        }
        return stack.get(top);
    }

    /**
     * This method determines is the stack empty or not.
     *
     * @return true, if the stack is empty, false otherwise.
     */
    public boolean isEmpty() {
        return top == -1;
    }

    /**
     * This method increases capacity of stack.
     */
    public void ensureCapacity() {
        capacity += 10;
    }

    /**
     * This method decreases capacity of stack.
     */
    public void trimToSize() {
        capacity = stack.size();
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