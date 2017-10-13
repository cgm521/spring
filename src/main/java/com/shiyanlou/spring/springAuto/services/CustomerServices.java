package com.shiyanlou.spring.springAuto.services;

import com.shiyanlou.spring.springAuto.dao.CustomerDao;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by cgm on 2017/10/11.
 */
//@Service
public class CustomerServices {
    @Autowired
    private CustomerDao customerDao;

    public void setCustomerDao(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    @Override
    public String toString() {
        return "CustomerServices{" +
                "customerDao=" + customerDao +
                '}';
    }
}
