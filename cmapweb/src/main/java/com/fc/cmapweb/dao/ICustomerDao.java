package com.fc.cmapweb.dao;

import com.fc.cmapweb.vo.Customer;

public interface ICustomerDao {

	void saveCustomer(Customer customer);
	Customer getCustomer(Integer customerId);
	Customer getCustomerByEmail(String email);
	void updateCustomer(Customer customer);

}
