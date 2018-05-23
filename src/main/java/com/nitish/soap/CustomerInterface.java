package com.nitish.soap;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import com.nitish.model.Customer;

@WebService
@SOAPBinding(style = Style.DOCUMENT)
public interface CustomerInterface {

	@WebMethod
	public boolean addCustomer(Customer customer);

	@WebMethod
	public List<Customer> loadCustomer();

	@WebMethod
	public boolean updateCustomer(Customer customer);

	@WebMethod
	public boolean deleteCustomer(String id);

}
