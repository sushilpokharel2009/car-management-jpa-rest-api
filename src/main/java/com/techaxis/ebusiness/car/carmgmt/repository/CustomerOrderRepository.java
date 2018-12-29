package com.techaxis.ebusiness.car.carmgmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techaxis.ebusiness.car.carmgmt.model.Customer;
import com.techaxis.ebusiness.car.carmgmt.model.CustomerOrder;

@Repository
public interface CustomerOrderRepository extends JpaRepository<CustomerOrder, Long> {

}
