package com.techaxis.ebusiness.car.carmgmt.service;

import java.util.List;

import com.techaxis.ebusiness.car.carmgmt.model.Customer;
import com.techaxis.ebusiness.car.carmgmt.model.CustomerOrder;

public interface CustomerOrderService {

	public List<CustomerOrder> getAllCustomerOrders();

	public CustomerOrder createCustomerOrder(CustomerOrder customerOrder);

	public CustomerOrder getCustomerOrderById(Long customerOrderId);

	public CustomerOrder updateCustomerOrder(Long id, CustomerOrder customerOrder);

	public void deleteCustomerOrder(Long customerOrderId);

}
