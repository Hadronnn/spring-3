package com.oaec.spring.dao;

import org.springframework.stereotype.Repository;

@Repository
public class BookDao {
    public BookDao() {
        System.out.println("BookDao.BookDao");
    }
}
