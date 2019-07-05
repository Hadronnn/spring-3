package com.oaec.spring.service;

import com.oaec.spring.dao.BookDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    private BookDao bookDao;
    @Value("#{bookDao}")
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public BookService() {
        System.out.println("BookService.BookService");
    }
    public void show(){
        System.out.println(bookDao);
    }
}
