package com.oaec.spring.dao.impl;


import com.oaec.spring.dao.BookDao;
import com.oaec.spring.entity.Book;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class BookDaoImpl implements BookDao {
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int doInsert(Book book) {
        String sql = "INSERT INTO book (book_id,name,author,price) VALUES(?,?,?,?)";
        int i = jdbcTemplate.update(sql,book.getBookId(),book.getName(),book.getAuthor(),book.getPrice());
        return i;
    }

    @Override
    public int doDelete(Integer bookId) {
        String sql = "DELETE FROM book WHERE book_id = ?";
        int i = jdbcTemplate.update(sql, bookId);
        return i;
    }

    @Override
    public int doUpdate(Book book) {
        String sql = "UPDATE book SET name=?,author=?,price=? WHERE book_id=?";
        return jdbcTemplate.update(sql,book.getName(),book.getAuthor(),book.getPrice(),book.getBookId());
    }

    @Override
    public List<Book> queryAll() {
        String sql = "SELECT * FROM book";
        return jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(Book.class));
    }

    @Override
    public Book QueryById(Integer bookId) {
        String sql = "SELECT * FROM book WHERE book_id = ?";
        List<Book> query = jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(Book.class), bookId);
        return query.get(0);
    }

}