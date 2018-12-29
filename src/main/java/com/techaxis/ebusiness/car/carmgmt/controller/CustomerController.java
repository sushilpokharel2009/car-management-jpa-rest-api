package com.techaxis.ebusiness.car.carmgmt.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techaxis.ebusiness.car.carmgmt.model.Customer;
import com.techaxis.ebusiness.car.carmgmt.service.CustomerService;

@RestController
@RequestMapping("/customerapi")
public class CustomerController {

	@Autowired
	CustomerService customerService;
	
	
	@GetMapping("/customers")
	public List<Customer> getAllCustomers() {
		return customerService.getAllCustomers();
	}

	@PostMapping("/newcustomer")
	public Customer createNewCustomer(@Valid @RequestBody Customer cus) {
		return customerService.createCustomer(cus);
	}

	@GetMapping("/newcustomer/{id}")
	public Customer getCustomerById(@PathVariable(value = "id") Integer customerId) {
		return customerService.getCustomerById(customerId);
				//.orElseThrow(() -> new RuntimeException("Car not found with id :" + carId));
	}

	@PutMapping("/newcust/{id}")
	public Customer updateCustomer(@PathVariable(value = "id") Integer custId, Customer customerDetails) {

		return customerService.updateCustomer(custId, customerDetails);
				//.orElseThrow(() -> new RuntimeException("Car not found with id :" + carId));


	}

	@DeleteMapping("/newcustomer/{id}")
	public ResponseEntity<?> deleteCustomer(@PathVariable(value = "id") Integer customerId) {
		customerService.deleteCustomer(customerId);
				//.orElseThrow(() -> new RuntimeException("Car not found with id :" + carId));

		//newCarService.delete(car);

		return ResponseEntity.ok().build();
	}

}
