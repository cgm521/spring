package com.shiyanlou.spring.SpringAop.aop.advice;

/**
 * Created by cgm on 2017/10/12.
 */
public class CustomerService {
    private String name;
    private String url;

    public void setName(String name) {
        this.name = name;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void printName() {
        System.out.println("Customer name:"+name);
    }

    public void printUrl() {
        System.out.println("Customer url:"+url);
    }

    public void printThrowException() {
        throw new IllegalArgumentException();
    }
}
