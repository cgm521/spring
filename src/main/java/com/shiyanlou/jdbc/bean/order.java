package com.shiyanlou.jdbc.bean;

/**
 * @author cgm
 * @date 2017/12/22.
 */
public class order {
    private int id;
    private int userId;
    private String number;
    private user user;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public com.shiyanlou.jdbc.bean.user getUser() {
        return user;
    }

    public void setUser(com.shiyanlou.jdbc.bean.user user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "order{" +
                "id=" + id +
                ", userId=" + userId +
                ", number='" + number + '\'' +
                ", user=" + user +
                '}';
    }
}
