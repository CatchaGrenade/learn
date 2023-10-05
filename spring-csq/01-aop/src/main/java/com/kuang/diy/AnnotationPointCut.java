package com.kuang.diy;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect //标注这个类为切面类
public class AnnotationPointCut {

    @Before("execution(* com.kuang.service.UserServiceImpl.*(..))")
    public void befroe(){
        System.out.println("注解形式===方法执行前");
    }
}
