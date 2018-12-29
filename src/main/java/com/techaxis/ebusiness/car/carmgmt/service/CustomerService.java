package com.techaxis.ebusiness.car.carmgmt.service;

import java.util.List;

import com.techaxis.ebusiness.car.carmgmt.model.Customer;

public interface CustomerService {

	public List<Customer> getAllCustomers();

	public Customer createCustomer(Customer customer);

	public Customer getCustomerById(Integer customerId);

	public Customer updateCustomer(Integer id, Customer customer);

	public void deleteCustomer(Integer customerId);

}
