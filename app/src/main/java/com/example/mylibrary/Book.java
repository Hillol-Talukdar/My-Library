package com.example.mylibrary;

public class Book {
    private String name;
    private String auther;
    private int pages;
    private String imageUrl;
    private String description;

    public Book(String name, String auther, int pages, String imageUrl, String description) {
        this.name = name;
        this.auther = auther;
        this.pages = pages;
        this.imageUrl = imageUrl;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuther() {
        return auther;
    }

    public void setAuther(String auther) {
        this.auther = auther;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", auther='" + auther + '\'' +
                ", pages='" + pages + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
