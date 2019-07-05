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
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//       //获取JdbcTemplate
        JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);
        String sql = "SELECT * FROM book";
//       //使用JdbcTemplate查询BOOK表中的全部数据
        /*List<Map<String, Object>> books = jdbcTemplate.queryForList(sql);
        for (Map<String, Object> book : books) {
            System.out.println("book = " + book);
        }*/

//
//        List<Book> books = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Book.class));
        //如果实体属性名和数据库中的字段名不一致，需要手动使用mapRow方法，完成由结果集转换为实体对象
        List<Book> books = jdbcTemplate.query(sql, new RowMapper<Book>() {

            @Override
            public Book mapRow(ResultSet rs, int i) throws SQLException {
                Book book = new Book();
                book.setBookId(rs.getInt("book_id"));
                book.setPrice(rs.getDouble("price"));
                book.setAuthor(rs.getString("author"));
                book.setName(rs.getString("name"));
                return book;
            }
        });
        for (Book book : books) {
            System.out.println("book = " + book);
        }

        context.close();
    }
}
