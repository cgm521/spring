package com.shiyanlou.dome.helloworld;

/**
 * Created by cgm on 2017/10/11.
 */
public class HelloWorld {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println("The first Spring 3:hello"+name);
    }
}
