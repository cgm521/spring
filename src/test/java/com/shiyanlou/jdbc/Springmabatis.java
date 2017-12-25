package com.shiyanlou.jdbc;

import com.shiyanlou.jdbc.Dao.UserDao;
import com.shiyanlou.jdbc.bean.user;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author cgm
 * @date 2017/12/25.
 */
public class Springmabatis {
    private ApplicationContext applicationContext;

    @Before
    public void setUp() throws Exception {
        applicationContext = new ClassPathXmlApplicationContext("classpath:spring-applicationContext.xml");//得到spring容器
    }

    @Test
    public void testSelectUserById() throws Exception {
        UserDao userMapper = (UserDao) applicationContext.getBean("userDao");
        user user = userMapper.findUserById(1);
        System.out.println(user);

    }
}
