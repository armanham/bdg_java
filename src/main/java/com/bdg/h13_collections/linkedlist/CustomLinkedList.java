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
        return indexOf(o) >= 0;
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
        while (currentNode != null) {
            if (counter == index) {
                return currentNode.value;
            }
            currentNode = currentNode.next;
            counter++;
        }
        return null;
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
        while (currentNode != null) {
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
        checkIsInRange(index);
        return null;
    }

    @Override
    public int indexOf(Object o) {
        if (isEmpty()) {
            return -1;
        }

        int counter;
        if (o == null) {
            Node<E> currentNode = head;
            counter = 0;
            while (currentNode != null) {
                if (currentNode.value == null) {
                    return counter;
                }
                currentNode = currentNode.next;
                counter++;
            }
        } else {
            Node<E> currentNode = head;
            counter = 0;
            while (currentNode != null) {
                if (currentNode.value.equals(o)) {
                    return counter;
                }
                currentNode = currentNode.next;
                counter++;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        if (isEmpty()) {
            return -1;
        }

        int counter;
        if (o == null) {
            Node<E> currentNode = tail;
            counter = size - 1;
            while (currentNode != null) {
                if (currentNode.value == null) {
                    return counter;
                }
                currentNode = currentNode.prev;
                counter--;
            }
        } else {
            Node<E> currentNode = tail;
            counter = size - 1;
            while (currentNode != null) {
                if (currentNode.value.equals(o)) {
                    return counter;
                }
                currentNode = currentNode.prev;
                counter--;
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
        return null;
    }

    @Override
    public void addFirst(E e) {
        Node<E> newNode = new Node<>(e, null, head);

        if (head == null) {
            head = tail = newNode;
            size++;
            return;
        }
        head.prev = newNode;
        head = newNode;
        size++;
    }

    @Override
    public void addLast(E e) {
        Node<E> newNode = new Node<>(e, tail, null);

        if (head == null) {
            head = tail = newNode;
            size++;
            return;
        }
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    @Override
    public boolean offerFirst(E e) {
        addFirst(e);
        return true;
    }

    @Override
    public boolean offerLast(E e) {
        addLast(e);
        return false;
    }

    @Override
    public E removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("List is empty: ");
        }
        if (size == 1) {
            Node<E> currentHead = head;
            head = tail = null;
            size--;
            return currentHead.value;
        }
        Node<E> currentHead = head;
        head = head.next;
        size--;
        return currentHead.value;
    }

    @Override
    public E removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("List is empty: ");
        }
        if (size == 1) {
            Node<E> currentTail = tail;
            head = tail = null;
            size--;
            return currentTail.value;
        }

        Node<E> currentTail = tail;
        Node<E> temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        size--;
        return currentTail.value;
    }

    @Override
    public E pollFirst() {
        return isEmpty() ? null : removeFirst();
    }

    @Override
    public E pollLast() {
        return isEmpty() ? null : removeLast();
    }

    @Override
    public E getFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("List is empty: ");
        }
        return head.value;
    }

    @Override
    public E getLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("List is empty: ");
        }
        return tail.value;
    }

    @Override
    public E peekFirst() {
        return isEmpty() ? null : head.value;
    }

    @Override
    public E peekLast() {
        return isEmpty() ? null : tail.value;
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
        return add(e);
    }

    @Override
    public E remove() {
        return removeFirst();
    }

    @Override
    public E poll() {
        return pollFirst();
    }

    @Override
    public E element() {
        return getFirst();
    }

    @Override
    public E peek() {
        return peekFirst();
    }

    @Override
    public void push(E e) {
        addFirst(e);
    }

    @Override
    public E pop() {
        return removeFirst();
    }

    @Override
    public Iterator<E> descendingIterator() {
        return null;
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

    private void checkIsInRange(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds: ");
        }
    }
}