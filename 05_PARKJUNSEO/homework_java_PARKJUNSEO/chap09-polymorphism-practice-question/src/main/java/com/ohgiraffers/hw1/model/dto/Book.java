package com.ohgiraffers.hw1.model.dto;

public class Book {

    private String title;
    private String author;
    private String publisher;

    public Book() {}
    public Book(String title, String author, String publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "책{" +
                "제목='" + title + '\'' +
                ", 저자='" + author + '\'' +
                ", 출판사='" + publisher + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
