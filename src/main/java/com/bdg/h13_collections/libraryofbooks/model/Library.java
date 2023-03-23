package com.bdg.h13_collections.libraryofbooks.model;

import java.util.List;

public class Library {

    private String name;
    private List<Book> books;

    public Library(String name, List<Book> books) {
        setName(name);
        setBooks(books);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Passed null or empty value: ");
        }
        this.name = name;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        if (books == null || books.isEmpty()) {
            throw new IllegalArgumentException("Passed null or empty value: ");
        }
        this.books = books;
    }

    @Override
    public String toString() {
        return "Library{" +
                "name='" + name + '\'' +
                ", books=" + books +
                "}\n";
    }
}