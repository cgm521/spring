package com.shiyanlou.spring.innerBean;

/**
 * Created by cgm on 2017/10/11.
 */
public class Customer {
    private Person person;

    public Customer(Person person) {
        this.person = person;
    }

    public Customer() {
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "person=" + person +
                '}';
    }
}
