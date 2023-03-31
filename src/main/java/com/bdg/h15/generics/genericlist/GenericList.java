package com.bdg.h15.generics.genericlist;

public class GenericList<E> {

    private Object[] elements;
    private int size;
    private final static int DEFAULT_CAPACITY = 10;
    private int capacity;

    public GenericList(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be in range [1; Integer.MAX_VALUE]");
        }
        this.capacity = capacity;
        elements = new Object[capacity];
    }

    public GenericList(E... elements) {
        this.size = elements.length;
        this.capacity = size;
        this.elements = new Object[size];

        for (int i = 0; i < elements.length; i++) {
            this.elements[i] = elements[i];
        }
    }

    public GenericList() {
        capacity = DEFAULT_CAPACITY;
        elements = new Object[DEFAULT_CAPACITY];
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public boolean contains(Object o) {
        return indexOf(o) >= 0;
    }

    public boolean add(E e) {
        if (size == capacity) {
            ensureCapacity();
        }
        Object[] copy = copyOfCurrentElementsToCapacityEnsuredArray();
        size = size + 1;
        copy[size - 1] = e;
        return true;
    }

    public boolean remove(Object o) {
        int firstIndexOfO = indexOf(o);

        if (firstIndexOfO == -1) {
            return false;
        }

        elements = shiftLeftFrom(firstIndexOfO);
        trimToSize();
        return true;
    }

    public void clear() {
        size = 0;
        trimToSize();
    }

    public E get(int index) {
        if (!isInRange(index)) {
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds: ");
        }
        return (E) elements[index];
    }

    public E set(int index, E element) {
        if (!isInRange(index)) {
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds: ");
        }

        elements[index] = element;
        return element;
    }

    public void add(int index, E element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds: ");
        }

        if (size == capacity) {
            ensureCapacity();
        }

        if (index == size){
            add(element);
            return;
        }

        elements = shiftRightFrom(index);
        elements[index] = element;
    }

    public E remove(int index) {
        if (!isInRange(index)) {
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds: ");
        }

        E removedElement = get(index);
        elements = shiftLeftFrom(index);
        trimToSize();
        return removedElement;
    }

    public int indexOf(Object o) {
        if (o == null) {
            for (int i = 0; i < size; i++) {
                if (elements[i] == null) {
                    return i;
                }
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (o.equals(elements[i])) {
                    return i;
                }
            }
        }
        return -1;
    }

    public int lastIndexOf(Object o) {
        if (o == null) {
            for (int i = size - 1; i >= 0; i--) {
                if (elements[i] == null) {
                    return i;
                }
            }
        } else {
            for (int i = size - 1; i >= 0; i--) {
                if (o.equals(elements[i])) {
                    return i;
                }
            }
        }
        return -1;
    }

    private void ensureCapacity() {
        capacity = capacity * 2;
    }

    private void trimToSize() {
        capacity = size;
    }

    private Object[] copyOfCurrentElementsToCapacityEnsuredArray() {
        Object[] copy = new Object[capacity];
        for (int i = 0; i < elements.length; i++) {
            copy[i] = elements[i];
        }
        elements = copy;
        return elements;
    }


    private Object[] shiftLeftFrom(int index) {
        if (!isInRange(index)) {
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds: ");
        }

        Object[] copy = elements;
        for (int i = index; i < size; i++) {
            if (i != size - 1) {
                copy[i] = elements[i + 1];
            } else {
                copy[i] = 0;
            }
        }
        size = size - 1;
        return copy;
    }

    private Object[] shiftRightFrom(int index) {
        if (!isInRange(index)) {
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds: ");
        }

        Object[] copy = new Object[size + 1];
        for (int i = 0; i < size; i++) {
            copy[i] = elements[i];
        }

        for (int i = index; i < size + 1; i++) {
            if (i <= size - 1) {
                copy[i + 1] = elements[i];
            }
        }
        copy[copy.length - 1] = elements[size - 1];
        size = size + 1;
        return copy;
    }

    private boolean isInRange(int index) {
        return index >= 0 && index < size;
    }
}