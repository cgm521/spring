package com.shiyanlou.jdbc.Dao;

import com.shiyanlou.jdbc.bean.user;
import org.springframework.stereotype.Component;

/**
 * @author cgm
 * @date 2017/12/20.
 * 基于xml
 */
@Component
public interface UserDao {

    user findUserById(int id);

    user findUserAndOrderById(int id);
}
