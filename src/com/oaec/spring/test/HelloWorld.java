package com.oaec.spring.test;


import com.oaec.spring.controller.BookController;
import com.oaec.spring.entity.Book;
import com.oaec.spring.service.BookService;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class HelloWorld {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContent.xml");
        /*BookService bookService = context.getBean(BookService.class);
        bookService.show();*/
        BookController bookController = context.getBean(BookController.class);
        bookController.show();
        context.close();
    }
}
