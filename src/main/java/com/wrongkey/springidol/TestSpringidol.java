package com.wrongkey.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *@author wrongkey
 *@description 测试
 *@date 2014/10/31
 *@version v1.0
 *
 */
public class TestSpringidol {

    public static void main(String[] args)throws PerformanceException{
        ApplicationContext ctx = new ClassPathXmlApplicationContext("com.wrongkey.springdidol/springidol.xml");

        Performer performer = (Instrumentalist)ctx.getBean("instrumentalist");
        performer.perform();
    }



}
