package com.shiyanlou.dome.spring3_Example;

import com.shiyanlou.dome.loosely_coupled.OutputHelper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by cgm on 2017/10/11.
 */
public class App {
    private static ApplicationContext context;

    public static void main(String[] args) {
//        context = new ClassPathXmlApplicationContext("SpringBean.xml");
//        HelloWorld helloworld = (HelloWorld)App.context.getBean("helloBean");
//        helloworld.print();
        context = new ClassPathXmlApplicationContext("Spring-OutPut.xml");
        OutputHelper outputHelper = (OutputHelper)context.getBean("OutputHelper");
        outputHelper.generateOutput();
    }
}
