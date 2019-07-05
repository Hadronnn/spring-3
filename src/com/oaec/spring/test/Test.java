package com.oaec.spring.test;

import com.oaec.spring.dao.BookDao;
import com.oaec.spring.entity.Book;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookDao bookDao = context.getBean(BookDao.class);
        Book book = bookDao.QueryById(8);
        System.out.println("book = " + book);
//        Book book = new Book(11, "余老板自传", "于观旭", 19.9);
//        int i = bookDao.doUpdate(book);
//        int i = bookDao.doDelete(11);
//        System.out.println("i = " + i);
    }
}
