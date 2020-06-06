package com.verma.shivam.demo;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class ImplemenetingAOPs {

    @Pointcut("execution(* com.verma.shivam.demo.*.*(..))")
    public void anyExecPointcut(){}

    @Pointcut("@annotation(Loggable)")
    public void loggerPointcut(){}

    @Before("anyExecPointcut()")
    public void exec(){
        System.out.println("Executing a function");
    }

    @Before("loggerPointcut()")
    public void logit(){

        System.out.println("Logger function executed");
    }
}
