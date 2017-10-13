package com.shiyanlou.spring.SpringAop.aop.advice;


import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import java.util.Arrays;

/**
 * Created by cgm on 2017/10/12.
 */
public class HiAroundMethod implements MethodInterceptor {
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("Method Name:" + methodInvocation.getMethod().getName());
        System.out.println("Method arguments :"+ Arrays.toString(methodInvocation.getArguments()));
        try {
            System.out.println("HiAroundMethod Before");
            Object proceed = methodInvocation.proceed();

            System.out.println("HiAroundMethod afert");
            return proceed;
        } catch (IllegalArgumentException e) {
            System.out.println("HiAroundMethod throws");
            throw e;
        }
    }
}
