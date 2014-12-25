package com.springinaction.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by y.voytovich on 25.12.2014.
 */
public class MainSI {
    public static void main(String[] args) throws PerformanceException{
//        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-idol.xml");
//        Performer performer = (Performer) ctx.getBean("duke");
//        performer.perform();
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-idol.xml");
        Performer performer = (Performer) ctx.getBean("kenny");
        performer.perform();


    }
}
