package com.oaec.spring.dao;

public interface AlipayDao {
    int add(String account,Double amount);
    int sub(String account,Double amount);
}
