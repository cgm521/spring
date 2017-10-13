package com.shiyanlou.spring.innerBean;

/**
 * Created by cgm on 2017/10/11.
 */
public class Person {
    private String name;

    private String address;

    private int arg;

    public Person() {
    }

    public Person(String name, String address, int arg) {
        this.name = name;
        this.address = address;
        this.arg = arg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getArg() {
        return arg;
    }

    public void setArg(int arg) {
        this.arg = arg;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", arg=" + arg +
                '}';
    }
}
