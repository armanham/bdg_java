package com.bdg.h13_collections.libraryofbooks.model;

import java.time.LocalDate;

public class Book {

    private String tittle;
    private Author author;
    private String publisher;
    private LocalDate yearOfPublishing;
    private int ISBN;

    public Book(String tittle, Author author, String publisher, LocalDate yearOfPublishing, int ISBN) {
        if (!tittle.isEmpty()) {
            this.tittle = tittle;
        }
        if (author != null) {
            this.author = author;
        }
        if (!publisher.isEmpty()) {
            this.publisher = publisher;
        }
        if (LocalDate.now().isAfter(yearOfPublishing)) {
            this.yearOfPublishing = yearOfPublishing;
        }
        if (ISBN > 9999 && ISBN < 100000) {
            this.ISBN = ISBN;
        }
    }

    public String getTittle() {
        return tittle;
    }

    public Author getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public LocalDate getYearOfPublishing() {
        return yearOfPublishing;
    }

    public int getISBN() {
        return ISBN;
    }

    @Override
    public String toString() {
        return "Book{" +
                "tittle='" + tittle + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", yearOfPublishing=" + yearOfPublishing +
                ", ISBN=" + ISBN +
                '}';
    }
}