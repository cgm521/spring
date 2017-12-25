package com.shiyanlou.jdbc.Dao;

import com.shiyanlou.jdbc.bean.order;

import java.util.List;

/**
 * @author cgm
 * @date 2017/12/22.
 */
public interface orderDaoMapper {
    List<order> findOrder();
}
