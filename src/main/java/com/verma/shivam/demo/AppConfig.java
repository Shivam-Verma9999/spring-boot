package com.verma.shivam.demo;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
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