package com.bdg.h13_collections.arraylist;

import java.util.*;

public class CustomArrayList<E> implements List<E> {

    private Object[] elements;
    private int capacity;
    private static final int DEFAULT_CAPACITY = 10;
    private int size;

    public CustomArrayList(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be in range [1; Integer.MAX_VALUE]");
        }
        this.capacity = capacity;
        this.elements = new Object[capacity];
    }

    public CustomArrayList() {
        this.elements = new Object[DEFAULT_CAPACITY];
    }

    public CustomArrayList(E... elements) {
        this.size = elements.length;
        this.elements = new Object[size];

        for (int i = 0; i < elements.length; i++) {
            this.elements[i] = elements[i];
        }
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public boolean contains(Object o) {
        if (size == 0) {
            return false;
        }

        if (o == null) {
            for (Object item : elements) {
                if (item == null) {
                    return true;
                }
            }
        }

        for (Object item : elements) {
            if (item.equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return Arrays.copyOf(elements, size);
    }

    @Override
    public <E> E[] toArray(E[] a) {
        return (E[]) elements;
    }

    @Override
    public boolean add(E e) {
        if (size == capacity) {
            ensureCapacity();
        }
        Object[] copy = copyOfCurrentElementsToCapacityEnsuredArray();
        size = size + 1;
        copy[size - 1] = e;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        if (!contains(o)) {
            return false;
        }
        int firstIndexOfO = indexOf(o);
        elements = shiftLeftFrom(firstIndexOfO);
        trimToSize();
        return true;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        if (c.size() > size) {
            return false;
        }

        return true;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {
        size = 0;
        trimToSize();
    }

    @Override
    public E get(int index) {
        if (!isInRange(index)) {
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds: ");
        }
        return (E) elements[index];
    }

    @Override
    public E set(int index, E element) {
        if (!isInRange(index)) {
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds: ");
        }

        for (int i = 0; i < size; i++) {
            if (i == index) {
                elements[i] = element;
            }
        }
        return element;
    }

    @Override
    public void add(int index, E element) {
        if (!isInRange(index)) {
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds: ");
        }

        if (size == capacity) {
            ensureCapacity();
        }

        elements = shiftRightFrom(index);
        elements[index] = element;
    }

    @Override
    public E remove(int index) {
        if (!isInRange(index)) {
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds: ");
        }

        E removedElement = get(index);
        elements = shiftLeftFrom(index);
        trimToSize();
        return removedElement;
    }

    @Override
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

    @Override
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

    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        if (fromIndex >= toIndex) {
            throw new IllegalArgumentException("toIndex must be larger than fromIndex: ");
        }
        if (!isInRange(fromIndex) || toIndex > size) {
            throw new IndexOutOfBoundsException("Index out of bounds: ");
        }

        List<E> subList = new CustomArrayList<>(toIndex - fromIndex);
        for (int i = fromIndex; i < toIndex; i++) {
            subList.add((E) elements[i]);
        }
        return subList;
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