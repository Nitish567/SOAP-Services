package com.nitish.soap;

import java.util.List;

import javax.jws.WebService;

import com.nitish.DAO.CustomerDAO;
import com.nitish.DAO.CustomerDAOImpl;
import com.nitish.model.Customer;


@WebService(endpointInterface = "com.nitish.soap.CustomerInterface")
public class CustomerServiceImpl implements CustomerInterface{

	CustomerDAO customerDAO = new CustomerDAOImpl();
	
	@Override
	public boolean addCustomer(Customer customer) {
		
		return customerDAO.addCustomer(customer);
	}

	@Override
	public List<Customer> loadCustomer() {
		return customerDAO.loadCustomer();
	}

	@Override
	public boolean updateCustomer(Customer customer) {
		if (customerDAO.updateCustomer(customer)) {
			return true;
		} else
			return false;

	}

	@Override
	public boolean deleteCustomer(String id) {
		return customerDAO.deleteCustomer(id);
	}

}
