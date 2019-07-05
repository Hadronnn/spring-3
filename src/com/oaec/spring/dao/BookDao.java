package com.oaec.spring.dao;



import com.oaec.spring.entity.Book;

import java.util.List;

public interface BookDao {
    int doInsert(Book book);
    int doDelete(Integer bookId);
    int doUpdate(Book book);
    List<Book> queryAll();
    Book QueryById(Integer bookId);
}