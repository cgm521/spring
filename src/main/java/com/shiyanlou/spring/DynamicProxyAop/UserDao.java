package com.shiyanlou.spring.DynamicProxyAop;

/**
 * Created by cgm on 2017/10/17.
 */
public interface UserDao {

    void save();
    public void setName(String name);
}

class UserDaoImpl implements UserDao
{
    private String name;

    public void save() {
        System.out.println("save() is called for " + name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
