package com.shiyanlou.spring.springAuto.controller;

import com.shiyanlou.spring.springAuto.services.CustomerServices;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by cgm on 2017/10/11.
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringCustomer.xml");
        CustomerServices customerServices = (CustomerServices) context.getBean("customerServices");
        System.out.println(customerServices);
    }
}
