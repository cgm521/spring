package com.shiyanlou.jdbc;

import com.shiyanlou.jdbc.Dao.UserDao;
import com.shiyanlou.jdbc.bean.user;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @author cgm
 * @date 2017/12/20.
 */
public class UserDaoImplTest {
    SqlSession session = null;

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

    //注解
    @Test
    public void findUserById() throws Exception {

        //根据session获取 UserMapper接口
        UserDao userDao = session.getMapper(UserDao.class);
        user user = userDao.findUserById(1);
        //执行同样的sql，在一级缓存sqlsession中查找，找到就不再执行sql
        System.out.println("2 "+user);

    }

    @Test
    public void findUserById2() throws Exception {

        //根据session获取 UserMapper接口
        UserDao userDao = session.getMapper(UserDao.class);
        user user = userDao.findUserById(1);
        //执行同样的sql，在一级缓存sqlsession中查找，找到就不再执行sql
        System.out.println("2 "+user);

    }

    //xml
    @Test
    public void findUser()throws Exception{
        /*这个字符串由 userMapper.xml 文件中 两个部分构成
            <mapper namespace="com.ys.po.userMapper"> 的 namespace 的值
            <select id="selectUserById" > id 值*/
        String statement = "findUser";
        List<user> list = session.selectList(statement);
        list.forEach(System.out::println);
    }

    @Test
    public void insertUser()throws Exception{
        String statement = "insert";
        user user = new user();
//        user.setId(2);
        user.setName("body");
        user.setAge(12);
        user.setBirth("2011-11-11");
        int insert = session.insert(statement, user);
        session.commit();
        System.out.println("insert" + user.getId());
    }

    @Test
    public void updateUser() {
        String statement = "update";
        user user = new user();
        user.setId(1);
        user.setName("bobo2");
        int update = session.update(statement, user);
        session.commit();
        System.out.println(update);
    }


    /**
     * choose选择第一个满足when条件的
     */
    @Test
    public void findUserByChoose() {
        String statement = "findUserByChoose";
        user user = new user();
        user.setId(2);
        user.setName("body");
        List<user> list = session.selectList(statement, user);
        session.commit();
        list.forEach(System.out::println);
    }

    @Test
    public void finUserByIds() {
        String statement = "finUserByIds";
        List<Object> ids = new ArrayList<>();
        ids.add(1);
        ids.add(2);
        ids.add(3);
        Object[] array = ids.toArray();
        List<user> list = session.selectList(statement,array);
        session.commit();
        list.forEach(System.out::println);
    }

    @Test
    public void findUserAndOrderById() {
        UserDao userDao = session.getMapper(UserDao.class);
        user user = userDao.findUserAndOrderById(1);
        System.out.println(user);
    }
    @After
    public void close() {
        session.flushStatements();
        session.close();
        System.out.println("close session");
    }

}