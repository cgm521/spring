package com.shiyanlou.jdbc.Dao;

import com.shiyanlou.jdbc.bean.user;

/**
 * @author cgm
 * @date 2017/12/20.
 * 基于xml
 */
public interface UserDao {
    user findUserById(int id);
}
