package com.shiyanlou.spring.SpringAop.aop.advice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;

/**
 * Created by cgm on 2017/10/12.
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "SpringAOPAdvice.xml" });
        CustomerService customerService = (CustomerService) context.getBean("customerService");
        System.out.println("--------------");
        customerService.printName();
        System.out.println("--------------");
        customerService.printUrl();
        System.out.println("--------------");
        HashMap hashMap = new HashMap();
        try {

            customerService.printThrowException();
        } catch (Exception e) {
//            e.printStackTrace();
        }
    }
}
