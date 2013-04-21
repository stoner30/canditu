package com.fc.cmapweb.mgr;

import com.fc.cmapweb.vo.Customer;

public interface ICustomerMgr {

	void saveCustomer(Customer customer);
	Customer queryCustomer(Integer customerId);
	Customer queryCustomerByEmail(String email);
	void updateCustomer(Customer customer);
	
}
