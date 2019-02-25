package com.skyair.webservice.customer.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.skyair.webservice.customer.model.Customer;

@Mapper
public interface CustomerMapper {
    List<Customer> selectCustomerList();
}
