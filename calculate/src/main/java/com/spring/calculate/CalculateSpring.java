package com.spring.calculate;

/**
 * Created by y.voytovich on 18.12.2014.
 */
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class CalculateSpring {
    private Operation ops;
    private ResultWriter wtr;
    public void setOps(Operation ops) {
        this.ops = ops;
    }
    public void setWriter(ResultWriter writer) {
        this.wtr = writer;
    }

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beanscalculate.xml");
        BeanFactory factory = (BeanFactory) context;
        CalculateSpring calc =(CalculateSpring) factory.getBean("opsbean");
        calc.execute(args);
    }
    public void execute(String [] args) {
        long op1 = Long.parseLong("3000");
        long op2 = Long.parseLong("3");
        wtr.showResult("The result of " + op1 + ops.getOpsName() + op2 + " is " + ops.operate(op1, op2) + "!");
    }

}
