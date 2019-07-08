package com.oaec.spring.service.impl;

import com.oaec.spring.dao.AlipayDao;
import com.oaec.spring.service.AlipayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("alipayService")
public class AlipayServiceImpl implements AlipayService {
    @Autowired
    private AlipayDao alipayDao;
    @Transactional
    @Override
    public int tranfer(String fromAccount, String toAccount, Double amount) {
        int add = alipayDao.add(toAccount, amount);
        int sub = alipayDao.sub(fromAccount, amount);
        return sub+add;
    }
}