package com.shiyanlou.spring.SpringAop.aop.advice;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by cgm on 2017/10/30.
 */
public class testmain {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        CustomerService customerService = new CustomerService();
        Method methods = CustomerService.class.getMethod("setName", String.class);
        methods.invoke(customerService, "12");
        System.out.println("+++"+customerService);
    }
}
