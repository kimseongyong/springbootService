package com.skyair.webservice.customer.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerDao {

	@Autowired
	private SqlSession sqlSession;
	
	public List<HashMap> selectCustomerList(){
		return this.sqlSession.selectList("customerList");
	}
}
