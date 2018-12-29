package com.techaxis.ebusiness.car.carmgmt.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techaxis.ebusiness.car.carmgmt.model.CustomerOrder;
import com.techaxis.ebusiness.car.carmgmt.service.CustomerOrderService;
import com.techaxis.ebusiness.car.carmgmt.service.CustomerOrderServiceImpl;
import com.techaxis.ebusiness.car.carmgmt.service.NewCarServiceImpl;

@RestController
@RequestMapping("/order")
public class CustomerOrderController {

	@Autowired
	CustomerOrderService customerOrderService;

	
	@GetMapping("/orders")
	public List<CustomerOrder> getAllOrders() {
		return customerOrderService.getAllCustomerOrders();

	}

	@PostMapping("/neworder")
	public CustomerOrder addOrder(@Valid @RequestBody CustomerOrder custOrder) {
		return customerOrderService.createCustomerOrder(custOrder);

	}

	@PutMapping("/order/{id}")
	public void updateOrder(@PathVariable(value = "id") Long id, CustomerOrder order) {
		customerOrderService.updateCustomerOrder(id, order);

	}
	
	@GetMapping("/order/{id}")
		public CustomerOrder gerOrder(@PathVariable(value = "id") @Valid  Long id) {
			return customerOrderService.getCustomerOrderById(id);
			
	}
	
	@DeleteMapping("/order/{id}")
	public void deleteOrder(@PathVariable(value = "id") Long orderId ) {
		customerOrderService.deleteCustomerOrder(orderId);
	}

}
