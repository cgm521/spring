package com.shiyanlou.spring.SpringAop.aop.advice;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * Created by cgm on 2017/10/12.
 */
public class HiBeforeMethod implements MethodBeforeAdvice {
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("HiBeforeMethod before!");
    }
}
