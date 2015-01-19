package com.springinaction.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by y.voytovich on 18.12.2014.
 */



public class Juggler implements Performer {
    private int beanBags = 3;
    public Juggler() {

    }
    public Juggler(int beanBags) {
        this.beanBags = beanBags;
    }

    public void perform() throws PerformanceException {
        System.out.println("JUGGLING " + beanBags + " BEANBAGS");
    }
    public static void main(String[] args) throws PerformanceException{
//        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-idol.xml");
//        Performer performer = (Performer) ctx.getBean("duke");
//        performer.perform();
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-idol.xml");
        Performer performer = (Performer) ctx.getBean("kenny");
        performer.perform();


    }

}
