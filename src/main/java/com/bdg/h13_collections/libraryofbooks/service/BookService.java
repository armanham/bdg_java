package com.bdg.h13_collections.libraryofbooks.service;

import com.bdg.h13_collections.libraryofbooks.model.Author;
import com.bdg.h13_collections.libraryofbooks.model.Book;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BookService {

    private List<Book> books = new ArrayList<>();

    public Book add(String tittle, Author author, String publisher, LocalDate yearOfPublishing, int ISBN) {
        for (Book book : books) {
            if (book.getTittle().equals(tittle) && book.getAuthor().equals(author)) {
                System.out.println("Book with specified author and tittle already exists: ");
                return null;
            }
        }
        Book newBook = new Book(tittle, author, publisher, yearOfPublishing, ISBN);
        books.add(newBook);
        return newBook;
    }

    public List<Book> searchBy(Author author) {
        if (author == null) {
            throw new IllegalArgumentException("Passed null value: ");
        }
        if (!books.isEmpty()) {
            System.out.println("BookList is empty: ");
            return null;
        }

        List<Book> booksOfPassedAuthor = new ArrayList<>();
        for (Book item : books) {
            if (item.getAuthor().equals(author)) {
                booksOfPassedAuthor.add(item);
            }
        }
        return booksOfPassedAuthor;
    }

    public List<Book> searchBy(String tittle) {
        if (tittle == null || tittle.isEmpty()) {
            throw new IllegalArgumentException("Passed null or empty value: ");
        }
        if (!books.isEmpty()) {
            System.out.println("BookList is empty: ");
            return null;
        }

        List<Book> booksOfPassedTittle = new ArrayList<>();
        for (Book item : books) {
            if (item.getTittle().equals(tittle)) {
                booksOfPassedTittle.add(item);
            }
        }
        return booksOfPassedTittle;
    }

    public boolean deleteBy(String tittle, Author author) {
        if (tittle == null || tittle.isEmpty() || author == null) {
            throw new IllegalArgumentException("Passed null or empty value: ");
        }

        for (Book item : books) {
            if(item.getTittle().equals(tittle) && item.getAuthor().equals(author)){
                return books.remove(item);
            }
        }
        return false;
    }

    public List<Book> getBooks() {
        return books;
    }
}