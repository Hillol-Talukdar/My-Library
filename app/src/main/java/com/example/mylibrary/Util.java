package com.example.mylibrary;

import java.util.ArrayList;

public class Util {
    private static ArrayList<Book> allBooks;
    private static ArrayList<Book> currentlyReadingBooks;
    private static ArrayList<Book> wantToReadBooks;
    private static ArrayList<Book> alreadyReadBooks;

    private static int id = 0;

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

    private void initAllBooks() {
        String name = "";
        String author = "";
        int pages = 0;
        String imageUrl = "";
        String description = "";

        id++;
        name = "Pride and Prejudice";
        author = "Jane Austen";
        pages = 279;
        imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTkx0KFwfwYQjA9n-5oKDJNSTqYDIV7-CsvPg&usqp=CAU";
        description = "Since its immediate success in 1813, Pride and Prejudice has remained one of the most populer novels";
        allBooks.add(new Book(id, name, author, pages,imageUrl,description));

        id++;
        name = "1Q84";
        author = "Haruki Murakami";
        pages = 1350;
        imageUrl = "https://images-na.ssl-images-amazon.com/images/S/compressed.photo.goodreads.com/books/1483103331i/10357575.jpg";
        description = "A work of maddening brilliance";
        allBooks.add(new Book(id, name, author, pages,imageUrl,description));

        id++;
        name = "Iliad";
        author = "Homer";
        pages = 1000;
        imageUrl = "https://images-na.ssl-images-amazon.com/images/S/compressed.photo.goodreads.com/books/1625333695i/1371.jpg";
        description = "Greak heroes and Tragedies";
        allBooks.add(new Book(id, name, author, pages,imageUrl,description));


        id++;
        name = "Beyond good and evil";
        author = "Nietzsche";
        pages = 350;
        imageUrl = "https://upload.wikimedia.org/wikipedia/en/c/ce/BGE-cover.jpg";
        description = "The Philosophy";
        allBooks.add(new Book(id, name, author, pages,imageUrl,description));





        id++;
        name = "Pride and Prejudice";
        author = "Jane Austen";
        pages = 279;
        imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTkx0KFwfwYQjA9n-5oKDJNSTqYDIV7-CsvPg&usqp=CAU";
        description = "Since its immediate success in 1813, Pride and Prejudice has remained one of the most populer novels";
        allBooks.add(new Book(id, name, author, pages,imageUrl,description));

        id++;
        name = "1Q84";
        author = "Haruki Murakami";
        pages = 1350;
        imageUrl = "https://images-na.ssl-images-amazon.com/images/S/compressed.photo.goodreads.com/books/1483103331i/10357575.jpg";
        description = "A work of maddening brilliance";
        allBooks.add(new Book(id, name, author, pages,imageUrl,description));

        id++;
        name = "Iliad";
        author = "Homer";
        pages = 1000;
        imageUrl = "https://images-na.ssl-images-amazon.com/images/S/compressed.photo.goodreads.com/books/1625333695i/1371.jpg";
        description = "Greak heroes and Tragedies";
        allBooks.add(new Book(id, name, author, pages,imageUrl,description));


        id++;
        name = "Beyond good and evil";
        author = "Nietzsche";
        pages = 350;
        imageUrl = "https://upload.wikimedia.org/wikipedia/en/c/ce/BGE-cover.jpg";
        description = "The Philosophy";
        allBooks.add(new Book(id, name, author, pages,imageUrl,description));

        id++;
        name = "Pride and Prejudice";
        author = "Jane Austen";
        pages = 279;
        imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTkx0KFwfwYQjA9n-5oKDJNSTqYDIV7-CsvPg&usqp=CAU";
        description = "Since its immediate success in 1813, Pride and Prejudice has remained one of the most populer novels";
        allBooks.add(new Book(id, name, author, pages,imageUrl,description));

        id++;
        name = "1Q84";
        author = "Haruki Murakami";
        pages = 1350;
        imageUrl = "https://images-na.ssl-images-amazon.com/images/S/compressed.photo.goodreads.com/books/1483103331i/10357575.jpg";
        description = "A work of maddening brilliance";
        allBooks.add(new Book(id, name, author, pages,imageUrl,description));

        id++;
        name = "Iliad";
        author = "Homer";
        pages = 1000;
        imageUrl = "https://images-na.ssl-images-amazon.com/images/S/compressed.photo.goodreads.com/books/1625333695i/1371.jpg";
        description = "Greak heroes and Tragedies";
        allBooks.add(new Book(id, name, author, pages,imageUrl,description));


        id++;
        name = "Beyond good and evil";
        author = "Nietzsche";
        pages = 350;
        imageUrl = "https://upload.wikimedia.org/wikipedia/en/c/ce/BGE-cover.jpg";
        description = "The Philosophy";
        allBooks.add(new Book(id, name, author, pages,imageUrl,description));

        id++;
        name = "Pride and Prejudice";
        author = "Jane Austen";
        pages = 279;
        imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTkx0KFwfwYQjA9n-5oKDJNSTqYDIV7-CsvPg&usqp=CAU";
        description = "Since its immediate success in 1813, Pride and Prejudice has remained one of the most populer novels";
        allBooks.add(new Book(id, name, author, pages,imageUrl,description));

        id++;
        name = "1Q84";
        author = "Haruki Murakami";
        pages = 1350;
        imageUrl = "https://images-na.ssl-images-amazon.com/images/S/compressed.photo.goodreads.com/books/1483103331i/10357575.jpg";
        description = "A work of maddening brilliance";
        allBooks.add(new Book(id, name, author, pages,imageUrl,description));

        id++;
        name = "Iliad";
        author = "Homer";
        pages = 1000;
        imageUrl = "https://images-na.ssl-images-amazon.com/images/S/compressed.photo.goodreads.com/books/1625333695i/1371.jpg";
        description = "Greak heroes and Tragedies";
        allBooks.add(new Book(id, name, author, pages,imageUrl,description));


        id++;
        name = "Beyond good and evil";
        author = "Nietzsche";
        pages = 350;
        imageUrl = "https://upload.wikimedia.org/wikipedia/en/c/ce/BGE-cover.jpg";
        description = "The Philosophy";
        allBooks.add(new Book(id, name, author, pages,imageUrl,description));

        id++;
        name = "Pride and Prejudice";
        author = "Jane Austen";
        pages = 279;
        imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTkx0KFwfwYQjA9n-5oKDJNSTqYDIV7-CsvPg&usqp=CAU";
        description = "Since its immediate success in 1813, Pride and Prejudice has remained one of the most populer novels";
        allBooks.add(new Book(id, name, author, pages,imageUrl,description));

        id++;
        name = "1Q84";
        author = "Haruki Murakami";
        pages = 1350;
        imageUrl = "https://images-na.ssl-images-amazon.com/images/S/compressed.photo.goodreads.com/books/1483103331i/10357575.jpg";
        description = "A work of maddening brilliance";
        allBooks.add(new Book(id, name, author, pages,imageUrl,description));

        id++;
        name = "Iliad";
        author = "Homer";
        pages = 1000;
        imageUrl = "https://images-na.ssl-images-amazon.com/images/S/compressed.photo.goodreads.com/books/1625333695i/1371.jpg";
        description = "Greak heroes and Tragedies";
        allBooks.add(new Book(id, name, author, pages,imageUrl,description));


        id++;
        name = "Beyond good and evil";
        author = "Nietzsche";
        pages = 350;
        imageUrl = "https://upload.wikimedia.org/wikipedia/en/c/ce/BGE-cover.jpg";
        description = "The Philosophy";
        allBooks.add(new Book(id, name, author, pages,imageUrl,description));
    }
}
