package com.techaxis.ebusiness.car.carmgmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techaxis.ebusiness.car.carmgmt.model.NewCar;

@Repository
public interface NewCarRepository extends JpaRepository<NewCar, Long> {
	
}


