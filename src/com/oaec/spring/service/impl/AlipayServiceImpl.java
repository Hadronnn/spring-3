package com.oaec.spring.service.impl;

import com.oaec.spring.dao.AlipayDao;
import com.oaec.spring.service.AlipayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("alipayService")
public class AlipayServiceImpl implements AlipayService {
    @Autowired
    private AlipayDao alipayDao;
    @Override
    public int tranfer(String fromAccount, String toAccount, Double amount) {
        int sub = alipayDao.sub(fromAccount, amount);
        int add = alipayDao.add(toAccount, amount);
        return sub+add;
    }
}
