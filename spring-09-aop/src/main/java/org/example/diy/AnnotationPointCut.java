package org.example.diy;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AnnotationPointCut {

    @Before("execution(* org.example.service.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("方法执行前=========");
    }

    @After("execution(* org.example.service.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("方法执行后=========");
    }


}
