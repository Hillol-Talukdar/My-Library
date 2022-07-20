package com.example.mylibrary;

import java.util.ArrayList;

public class Util {
    private static ArrayList<Book> allBooks;
    private static ArrayList<Book> currentlyReadingBooks;
    private static ArrayList<Book> wantToReadBooks;
    private static ArrayList<Book> alreadyReadBooks;

    public Util() {
        if (allBooks == null) {
            allBooks = new ArrayList<>();
            initAllBooks();
        }

        if (currentlyReadingBooks == null) {
            currentlyReadingBooks = new ArrayList<>();
        }

        if (wantToReadBooks == null) {
            wantToReadBooks = new ArrayList<>();
        }

        if (alreadyReadBooks == null) {
            alreadyReadBooks = new ArrayList<>();
        }
    }

    private void initAllBooks() {
         //TODO: initialize all books array list
    }

    public static ArrayList<Book> getAllBooks() {
        return allBooks;
    }

    public static ArrayList<Book> getCurrentlyReadingBooks() {
        return currentlyReadingBooks;
    }

    public static ArrayList<Book> getWantToReadBooks() {
        return wantToReadBooks;
    }

    public static ArrayList<Book> getAlreadyReadBooks() {
        return alreadyReadBooks;
    }

    public boolean addCurrentlyReadingBook (Book book){
       return currentlyReadingBooks.add(book);
    }

    public boolean addWantToReadBook (Book book){
        return wantToReadBooks.add(book);
    }

    public boolean addAlreadyReadBooks (Book book){
        return alreadyReadBooks.add(book);
    }

    public boolean removeCurrentlyReadingBook (Book book) {
        return currentlyReadingBooks.remove(book);
    }

    public boolean removeWantToReadBook (Book book) {
        return wantToReadBooks.remove(book);
    }

    public boolean removeAlreadyReadBooks (Book book) {
        return alreadyReadBooks.remove(book);
    }
}
