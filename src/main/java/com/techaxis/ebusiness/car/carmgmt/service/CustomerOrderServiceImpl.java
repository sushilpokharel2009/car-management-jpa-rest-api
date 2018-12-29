package com.techaxis.ebusiness.car.carmgmt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techaxis.ebusiness.car.carmgmt.model.CustomerOrder;
import com.techaxis.ebusiness.car.carmgmt.repository.CustomerOrderRepository;

@Service
public class CustomerOrderServiceImpl implements CustomerOrderService {

	@Autowired
	CustomerOrderRepository customerOrderRepository;

	@Override
	public List<CustomerOrder> getAllCustomerOrders() {
		List<CustomerOrder> order = customerOrderRepository.findAll();
		System.out.println("I got ------------------------------------:" + order);
		return order;
	}

	@Override
	public CustomerOrder createCustomerOrder(CustomerOrder customerOrder) {
		CustomerOrder order = customerOrderRepository.save(customerOrder);
		System.out.println("I got ------------------------------------:" + order);
		return order;
	}

	@Override
	public CustomerOrder getCustomerOrderById(Long customerOrderId) {
		CustomerOrder order = customerOrderRepository.findById(customerOrderId).orElseThrow(() -> new RuntimeException("customer not fount with id :"+ customerOrderId));
		return order;
	}

	@Override
	public CustomerOrder updateCustomerOrder(Long id, CustomerOrder customerOrder) {
		CustomerOrder order = customerOrderRepository.getOne(id);
		order.setOrderDate(customerOrder.getOrderDate());
		order.setQuantity(customerOrder.getQuantity());
		order.setCustomerId(customerOrder.getCustomerId());
		order.setCustomerOrderId(customerOrder.getCustomerOrderId());
		System.out.println("I got ------------------------------------:" + order);
		return customerOrderRepository.save(order);

	}

	@Override
	public void deleteCustomerOrder(Long customerOrderId) {

		CustomerOrder order = customerOrderRepository.findById(customerOrderId).orElseThrow(() -> new RuntimeException("customer not fount with id :"+ customerOrderId));
		customerOrderRepository.delete(order);
	}

}
