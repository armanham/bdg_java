package com.bdg.h13_collections.linkedlist;

import java.util.*;

public class CustomLinkedList<E> implements List<E>, Deque<E> {

    private int size = 0;
    private Node<E> head;
    private Node<E> tail;

    public CustomLinkedList() {
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(E e) {
        Node<E> currentTail = tail;
        Node<E> newNode = new Node<>(e, currentTail, null);
        tail = newNode;
        if (currentTail == null) {
            head = newNode;
        } else {
            currentTail.next = newNode;
        }
        size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
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
        for (Node<E> currentNode = head; currentNode != null; ) {
            Node<E> next = currentNode.next;
            currentNode.value = null;
            currentNode.next = null;
            currentNode.prev = null;
            currentNode = next;
        }
        head = tail = null;
        size = 0;
    }

    @Override
    public E get(int index) {
        checkIsInRange(index);

        if (index == 0) {
            return head.value;
        }
        if (index == size - 1) {
            return tail.value;
        }

        Node<E> currentNode = head;
        int counter = 0;
        while (currentNode.next != null) {
            if (counter == index) {
                return currentNode.value;
            }
            currentNode = currentNode.next;
            counter++;
        }
        return null;
    }

    private void checkIsInRange(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds: ");
        }
    }

    @Override
    public E set(int index, E element) {
        checkIsInRange(index);

        if (index == 0) {
            return head.value = element;
        }
        if (index == size - 1) {
            return tail.value = element;
        }

        Node<E> currentNode = head;
        int counter = 0;
        while (currentNode.next != null) {
            if (counter == index) {
                return currentNode.value = element;
            }
            currentNode = currentNode.next;
            counter++;
        }
        return null;
    }

    @Override
    public void add(int index, E element) {
        checkIsInRange(index);


    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
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
        return null;
    }

    @Override
    public void addFirst(E e) {

    }

    @Override
    public void addLast(E e) {

    }

    @Override
    public boolean offerFirst(E e) {
        return false;
    }

    @Override
    public boolean offerLast(E e) {
        return false;
    }

    @Override
    public E removeFirst() {
        return null;
    }

    @Override
    public E removeLast() {
        return null;
    }

    @Override
    public E pollFirst() {
        return null;
    }

    @Override
    public E pollLast() {
        return null;
    }

    @Override
    public E getFirst() {
        return null;
    }

    @Override
    public E getLast() {
        return null;
    }

    @Override
    public E peekFirst() {
        return null;
    }

    @Override
    public E peekLast() {
        return null;
    }

    @Override
    public boolean removeFirstOccurrence(Object o) {
        return false;
    }

    @Override
    public boolean removeLastOccurrence(Object o) {
        return false;
    }

    @Override
    public boolean offer(E e) {
        return false;
    }

    @Override
    public E remove() {
        return null;
    }

    @Override
    public E poll() {
        return null;
    }

    @Override
    public E element() {
        return null;
    }

    @Override
    public E peek() {
        return null;
    }

    @Override
    public void push(E e) {

    }

    @Override
    public E pop() {
        return null;
    }

    @Override
    public Iterator<E> descendingIterator() {
        return null;
    }

    private static class Node<E> {
        E value;
        Node<E> prev;
        Node<E> next;

        public Node(E value, Node<E> prev, Node<E> next) {
            this.value = value;
            this.prev = prev;
            this.next = next;
        }
    }

    public void show() {
        Node<E> currentNode = head;
        System.out.print("[ ");
        while (currentNode != null) {
            System.out.print(currentNode.value + ", ");
            currentNode = currentNode.next;
        }
        System.out.print("]");
        System.out.println();
    }
}