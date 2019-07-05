package com.oaec.spring.service;

import com.oaec.spring.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class BookService {
//    @Value("#{bookDao}")
    //使用Autowired注解完成自动注入
    @Autowired(required = false)
    private BookDao bookDao;

    public BookService() {
        System.out.println("BookService.BookService");
    }
    public void show(){
        System.out.println(bookDao);
    }
}
