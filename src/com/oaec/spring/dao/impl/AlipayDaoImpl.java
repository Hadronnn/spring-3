package com.oaec.spring.dao.impl;

import com.oaec.spring.dao.AlipayDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

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
        String sql = "UPDATE alipay SET balance = balance - ? WHERE account = ?";
        return jdbcTemplate.update(sql,amount,account);
    }
}
