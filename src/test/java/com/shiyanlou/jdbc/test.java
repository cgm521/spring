package com.shiyanlou.jdbc;

import com.shiyanlou.jdbc.Dao.UserDao;
import com.shiyanlou.jdbc.bean.user;
import com.shiyanlou.jdbc.dataSource.DataSourceInstances;
import com.shiyanlou.jdbc.dataSource.DataSourceSwitch;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author cgm
 * @date 2018/1/3.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-applicationContext.xml")
public class test {
    @Autowired
    private UserDao userDao;

    @Test
    public void test() {
        DataSourceSwitch.setDataSourceType(DataSourceInstances.MYSQL);
        user user = userDao.findUserById(1);
        System.out.println(user);
    }

}
