package com.cjc.servicei;

import java.util.List;

import com.cjc.model.Customer;

public interface CustomerServiceI {

	void saveCustomer(Customer c);

	List<Customer> getCustomers();

	
	


}
