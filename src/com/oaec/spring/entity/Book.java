package com.oaec.spring.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value("2")
    private int bookId;
    @Value("Spring开发")
    private String name;
    @Value("于观旭")
    private String author;
    @Value("9.9")
    private double price;

    public Book() {
    }

    public Book(int bookId, String name, String author, double price) {
        this.bookId = bookId;
        this.name = name;
        this.author = author;
        this.price = price;
    }


    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }


    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
