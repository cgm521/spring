package com.shiyanlou.jdbc;

import com.shiyanlou.jdbc.Dao.orderDaoMapper;
import com.shiyanlou.jdbc.bean.order;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author cgm
 * @date 2017/12/22.
 */
public class orderTest {
    SqlSession session = null;
    private static final Logger log = LoggerFactory.getLogger(orderTest.class);

    @Before
    public void init() {
        //定义mybatis全局配置文件
        String resourse = "Mybatis-config.xml";
        InputStream inputStream = null;
        try {
            //加载 mybatis 全局配置文件
            inputStream = Resources.getResourceAsStream(resourse);
            //UserDaoImplTest.class.getClassLoader().getResourceAsStream(resourse);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (inputStream == null) {
            System.out.println("xml is null");
        }
        System.out.println("build session");
        //构建sqlSession的工厂
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //根据 sqlSessionFactory 产生 session
        session = sqlSessionFactory.openSession();
    }

    @Test
    public void finOrderById(){
        String statement = "finOrderById";
        orderDaoMapper orderDaoMapper = session.getMapper(orderDaoMapper.class);
        log.info("查询账单");
        List<order> list = orderDaoMapper.findOrder();
        for (order order : list) {
            System.out.println(order.getUser());
        }

    }


    @After
    public void close() {
        session.flushStatements();
        session.close();
        System.out.println("close session");
    }
}
