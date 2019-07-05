package com.oaec.spring.test;


import com.oaec.spring.entity.Book;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class HelloWorld {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContent.xml");
        Book bean = context.getBean(Book.class);
        System.out.println("bean = " + bean);
        context.close();
    }
}
