package com.nitish.DAO;

import java.util.List;

import com.nitish.model.Customer;

public interface CustomerDAO {

	public boolean addCustomer(Customer customer);

	public List<Customer> loadCustomer();

	public boolean updateCustomer(Customer customer);

	public boolean deleteCustomer(String id);

}
