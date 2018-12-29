package com.techaxis.ebusiness.car.carmgmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techaxis.ebusiness.car.carmgmt.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
