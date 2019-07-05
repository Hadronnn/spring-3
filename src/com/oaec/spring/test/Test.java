package com.oaec.spring.test;

import com.oaec.spring.dao.AlipayDao;
import com.oaec.spring.dao.impl.AlipayDaoImpl;
import com.oaec.spring.service.AlipayService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContent.xml");
        AlipayService alipayService = context.getBean(AlipayService.class);
        int tranfer = alipayService.tranfer("1002", "1001", 100d);
        System.out.println("tranfer = " + tranfer);
        context.close();

    }
}
