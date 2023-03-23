package com.bdg.h13_collections.libraryofbooks.service;

import com.bdg.h13_collections.libraryofbooks.model.Book;
import com.bdg.h13_collections.libraryofbooks.model.Library;

import java.util.ArrayList;
import java.util.List;

public class LibraryService {

    private List<Library> libraries = new ArrayList<>();

    public Library add(String name, List<Book> books) {
        if (name == null || name.isEmpty() || books == null || books.isEmpty()) {
            throw new IllegalArgumentException("Passed null or empty value: ");
        }

        for (Library item : libraries) {
            if (item.getName().equals(name)) {
                System.out.println("Library with specified name already exists: ");
                return null;
            }
        }
        Library newLibrary = new Library(name, books);
        libraries.add(newLibrary);
        return newLibrary;
    }

    public Library searchBy(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Passed null or empty value: ");
        }

        for (Library item : libraries) {
            if (item.getName().equals(name)) {
                return item;
            }
        }
        return null;
    }

    public boolean deleteBy(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Passed null or empty value: ");
        }

        for (Library item : libraries) {
            if (item.getName().equals(name)) {
                return libraries.remove(item);
            }
        }
        return false;
    }

    public List<Library> getLibraries() {
        return libraries;
    }
}