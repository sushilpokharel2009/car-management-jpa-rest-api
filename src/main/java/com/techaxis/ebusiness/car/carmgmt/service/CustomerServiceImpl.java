package com.techaxis.ebusiness.car.carmgmt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techaxis.ebusiness.car.carmgmt.model.Customer;
import com.techaxis.ebusiness.car.carmgmt.repository.CustomerRepository;


@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository customerRepository;

	@Override
	public List<Customer> getAllCustomers() {
		List<Customer> allcustomers = customerRepository.findAll();
		return allcustomers;
	}

	@Override
	public Customer createCustomer(Customer customer) {

		return customerRepository.save(customer);
	}

	@Override
	public Customer getCustomerById(Integer customerId) {
		Customer cust = customerRepository.findById(customerId).orElseThrow(() -> new RuntimeException("customer not fount with id :"+ customerId));
		return cust;
	}

	@Override
	public Customer updateCustomer(Integer custId, Customer updatedCustomer) {
		Customer customer = customerRepository.findById(custId).orElseThrow(() -> new RuntimeException("customer not fount with id :"+ custId));
		customer.setFirstName(updatedCustomer.getFirstName());
		customer.setLastName(updatedCustomer.getLastName());
		customer.setAddress(updatedCustomer.getAddress());

		Customer savedCustomer = customerRepository.save(customer);

		return savedCustomer;
	}

	@Override
	public void deleteCustomer(Integer customerId) {
		Customer customer = customerRepository.findById(customerId).orElseThrow(() -> new RuntimeException("customer not fount with id :"+ customerId));
		customerRepository.delete(customer);

	}

}
