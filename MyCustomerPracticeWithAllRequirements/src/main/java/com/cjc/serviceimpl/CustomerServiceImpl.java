package com.cjc.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.model.Customer;
import com.cjc.repository.CustomerRepository;
import com.cjc.servicei.CustomerServiceI;

@Service
public class CustomerServiceImpl implements CustomerServiceI{
	@Autowired
	CustomerRepository cr;

	@Override
	public void saveCustomer(Customer c) {
		cr.save(c);
		
	}

}
