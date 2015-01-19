//<start id="juggler_java" /> 
package com.springinaction.springidol;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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

    public static void main(String[] args) throws PerformanceException {
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("com/springinaction/springidol/spring-idol.xml");
        Performer performer = (Performer) ctx.getBean("kenny2");
        performer.perform();

    }
}
//<end id="juggler_java" />
