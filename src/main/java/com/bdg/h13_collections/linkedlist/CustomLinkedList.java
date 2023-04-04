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
        if (isEmpty() || !contains(o)) {
            return false;
        }

        if (indexOf(o) == 0) {
            removeFirst();
            return true;
        }
        if (indexOf(o) == size - 1) {
            removeLast();
            return true;
        }

        if (o == null) {
            for (Node<E> prev = null, currentNode = head; currentNode != null; prev = currentNode, currentNode = currentNode.next) {
                if (currentNode.value == null) {
                    unlink(prev, currentNode);
                    return true;
                }
            }
        } else {
            for (Node<E> prev = null, currentNode = head; currentNode != null; prev = currentNode, currentNode = currentNode.next) {
                if (o.equals(currentNode.value)) {
                    unlink(prev, currentNode);
                    return true;
                }
            }
        }
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
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds: ");
        }

        if (index == 0) {
            addFirst(element);
            return;
        }
        if (index == size) {
            addLast(element);
            return;
        }

        Node<E> currentNode = head;
        int counter = 0;
        while (index - 1 != counter) {
            currentNode = currentNode.next;
            counter++;
        }

        Node<E> newNode = new Node<>(element, currentNode, currentNode.next);
        newNode.next = currentNode.next;
        currentNode.next = newNode;
        size++;
    }

    @Override
    public E remove(int index) {
        checkIsInRange(index);

        if (index == 0) {
            return removeFirst();
        }
        if (index == size - 1) {
            return removeLast();
        }

        E removed = get(index);
        remove(removed);
        return removed;
    }

    @Override
    public int indexOf(Object o) {
        if (isEmpty() || !contains(o)) {
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
        if (isEmpty() || !contains(o)) {
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
        return true;
    }

    @Override
    public E removeFirst() {
        throwsExceptionIfListIsEmpty();

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
        throwsExceptionIfListIsEmpty();

        if (size == 1) {
            Node<E> currentTail = tail;
            head = tail = null;
            size--;
            return currentTail.value;
        }

        Node<E> currentTail = tail;
        Node<E> currentNode = head;
        while (currentNode.next.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = null;
        tail = currentNode;
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
        throwsExceptionIfListIsEmpty();
        return head.value;
    }

    @Override
    public E getLast() {
        throwsExceptionIfListIsEmpty();
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
        return remove(o);
    }

    @Override
    public boolean removeLastOccurrence(Object o) {
        int lastIndexOfO = lastIndexOf(o);
        if (lastIndexOfO < 0){
            return false;
        }

        remove(lastIndexOfO);
        return true;
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

        public E getValue() {
            return value;
        }

        public void setValue(E value) {
            this.value = value;
        }

        public Node<E> getPrev() {
            return prev;
        }

        public void setPrev(Node<E> prev) {
            this.prev = prev;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }

    }

    private void unlink(Node<E> prevNode, Node<E> currentNode) {
        if (prevNode == null) {
            head = currentNode.next;
        } else {
            prevNode.next = currentNode.next;
        }
        if (currentNode == tail) {
            tail = prevNode;
        }
        size--;
    }

    private void checkIsInRange(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds: ");
        }
    }

    private void throwsExceptionIfListIsEmpty() {
        if (isEmpty()) {
            throw new NoSuchElementException("List is empty: ");
        }
    }
}