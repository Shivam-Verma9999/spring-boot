package com.verma.shivam.demo;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class AppConfig {

    @Pointcut(value = "execution( public String getHome())")
    public void getHomePointcut() {
    }

    @Before("getHomePointcut()")
    public void hh() throws Throwable {
        System.out.println("EXECUTING GETMAPPING");
    }

}