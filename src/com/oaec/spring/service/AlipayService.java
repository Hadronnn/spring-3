package com.oaec.spring.service;

public interface AlipayService {
    int tranfer(String fromAccount,String toAccount,Double amount);
}
