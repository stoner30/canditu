package com.fc.cmapweb.dao.impl;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.fc.cmapweb.dao.CmapBaseDao;
import com.fc.cmapweb.dao.ICustomerDao;
import com.fc.cmapweb.vo.Customer;

@Repository("customerDao")
public class CustomerDaoImpl extends CmapBaseDao implements ICustomerDao {

	@Override
	public void saveCustomer(Customer customer) {
		em.persist(customer);
	}

	@Override
    public Customer getCustomer(Integer customerId) {
		return em.find(Customer.class, customerId); 
    }

	@SuppressWarnings("unchecked")
    @Override
    public Customer getCustomerByEmail(String email) {
	    Query query = em.createQuery("from Customer where email = :email", Customer.class);
	    query.setParameter("email", email);
	    
	    List<Customer> result = query.getResultList();
	    if (result.isEmpty()) {
	    	return null;
	    }
	    return result.get(0);
    }

	@Override
    public void updateCustomer(Customer customer) {
	    em.merge(customer);
    }

}
