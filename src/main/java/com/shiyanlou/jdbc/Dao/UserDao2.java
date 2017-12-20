package com.shiyanlou.jdbc.Dao;

import com.shiyanlou.jdbc.bean.user;
import org.apache.ibatis.annotations.Select;

/**
 * @author cgm
 * @date 2017/12/20.
 * 基于注解
 */
public interface UserDao2 {
    @Select("SELECT * FROM bas_user WHERE id = #{id}")
    user findUserById(int id);
}
