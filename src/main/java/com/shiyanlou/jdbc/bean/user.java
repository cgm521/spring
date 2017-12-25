package com.shiyanlou.jdbc.bean;

import java.io.Serializable;
import java.util.List;

/**
 * @author cgm
 * @date 2017/12/20.
 */
public class user implements Serializable{
    private int id;
    private String name;
    private int age;
    private String birth;
    private List<order> orders;

    @Override
    public String toString() {
        return "user{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", birth='" + birth + '\'' +
                ", orders=" + orders +
                '}';
    }

    public List<order> getOrders() {
        return orders;
    }

    public void setOrders(List<order> orders) {
        this.orders = orders;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

}
