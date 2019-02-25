package com.skyair.webservice.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.skyair.webservice.customer.mapper.CustomerMapper;
import com.skyair.webservice.customer.model.Customer;

@RestController
@RequestMapping("/customers")
public class CustomerController {
	@Autowired
	private CustomerMapper customerMapper;

	@RequestMapping("/list")
	@ResponseBody
    public List<Customer> customersList() {
        return customerMapper.selectCustomerList();
    }
}
