package com.oaec.spring.controller;

import com.oaec.spring.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

@Controller
public class BookController {
//    @Value("#{bookService}")
    @Autowired(required = false)
    private BookService bookService;

    public BookController() {
        System.out.println("BookController.BookController");
    }
    public void show(){
        System.out.println(bookService);
    }
}
