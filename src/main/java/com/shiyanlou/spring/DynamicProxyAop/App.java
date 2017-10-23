package com.shiyanlou.spring.DynamicProxyAop;

/**
 * Created by cgm on 2017/10/17.
 */
public class App {
    public static void main(String[] args) {
        ProxyFactory pf = new ProxyFactory();
        UserDao userDao = (UserDao)pf.createUserDao(new UserDaoImpl());
        userDao.setName("123");
        userDao.save();
    }
}
