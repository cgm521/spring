package com.shiyanlou.spring.innerBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by cgm on 2017/10/11.
 */
public class App {
    private static ApplicationContext context;

    public static void main(String[] args) {
        Person person = new Person("我","安徽",24);

        context = new ClassPathXmlApplicationContext("SpringBean.xml");
        Customer customer = (Customer) context.getBean("CustomerBean");

        Customer customer2 = (Customer) context.getBean("CustomerBean");
        customer.setPerson(person);
        System.out.println(customer.toString());
        System.out.println(customer2.toString());
    }
}
