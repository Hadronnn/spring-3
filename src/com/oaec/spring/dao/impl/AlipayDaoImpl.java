package com.oaec.spring.dao.impl;

import com.oaec.spring.dao.AlipayDao;
import com.oaec.spring.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("alipayDao")
public class AlipayDaoImpl implements AlipayDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int add(String account, Double amount) {
        String sql = "UPDATE alipay SET balance = balance + ? WHERE account = ?";
        return jdbcTemplate.update(sql,amount,account);
    }

    @Override
    public int sub(String account, Double amount) {
        Double balance = getBalanceByAccount(account);
        if (balance < amount){
            //余额不足
            throw new RuntimeException("余额不足");
        }
        String sql = "UPDATE alipay SET balance = balance - ? WHERE account = ?";
        return jdbcTemplate.update(sql,amount,account);
    }

    private Double getBalanceByAccount(String account) {
        String sql = "SELECT balance FROM alipay WHERE account = ?";
        return jdbcTemplate.queryForObject(sql,Double.class,account);
    }

}
