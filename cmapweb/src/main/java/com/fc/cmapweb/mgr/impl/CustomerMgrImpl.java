package com.fc.cmapweb.mgr.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fc.cmapweb.dao.ICustomerDao;
import com.fc.cmapweb.mgr.ICustomerMgr;
import com.fc.cmapweb.vo.Customer;

@Service("customerMgr")
public class CustomerMgrImpl implements ICustomerMgr {

	@Autowired
	private ICustomerDao customerDao;
	
	@Override
	public void saveCustomer(Customer customer) {
		customerDao.saveCustomer(customer);
	}

	@Override
    public Customer queryCustomer(Integer customerId) {
	    return customerDao.getCustomer(customerId);
    }

	@Override
    public Customer queryCustomerByEmail(String email) {
	    return customerDao.getCustomerByEmail(email);
    }

}
