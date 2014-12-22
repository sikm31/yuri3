package com.spring.calculate.aspects;

/**
 * Created by y.voytovich on 18.12.2014.
 */
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
@Aspect
public class LoggingAspect {
    @Before("execution(* com.spring.calculate.Operation.*(..))")
    public void logMethodExecution(JoinPoint jp) {
        System.out.println("AOP logging ->"
                + jp.toShortString());
    }
}
