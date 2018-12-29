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

import com.techaxis.ebusiness.car.carmgmt.model.UsedCar;
import com.techaxis.ebusiness.car.carmgmt.service.UsedCarService;
import com.techaxis.ebusiness.car.carmgmt.service.UsedCarServiceImpl;

@RestController
@RequestMapping("/api")
public class UsedCarController {
	
	@Autowired
	UsedCarService usedCarService;
	
//	public UsedCarController() {
//		this.usedCarService = new UsedCarServiceImpl();
//	}

	@GetMapping("/usedcars")
	public List<UsedCar> getAllUsedCars() {
		return usedCarService.getAllUsedCars();
	}

	@PostMapping("/usedcar")
	public UsedCar createCar(@Valid @RequestBody UsedCar car) {
		return usedCarService.createUsedCar(car);
	}

	@GetMapping("/usedcar/{id}")
	public UsedCar getUsedCarById(@PathVariable(value = "id") Long carId) {
		return usedCarService.getUsedCarById(carId);
		//.orElseThrow(() -> new RuntimeException("Car not found with id :" + carId));
	}

	@PutMapping("/usedcar/{id}")
	public UsedCar updateCar(@PathVariable(value = "id") Long carId, @Valid @RequestBody UsedCar carDetails) {

		UsedCar car = usedCarService.updateCar(carId, carDetails);
				//.orElseThrow(() -> new RuntimeException("Car not found with id :" + carId));

		

		//UsedCar updatedCar = usedCarRepository.save(car);
		return car;
	}

	@DeleteMapping("/usercar/{id}")
	public ResponseEntity<?> deleteUsedCar(@PathVariable(value = "id") Long carId) {
		 usedCarService.deleteUsedCar(carId);
				//.orElseThrow(() -> new RuntimeException("Car not found with id :" + carId));

		//usedCarRepository.delete(car);

		return ResponseEntity.ok().build();
	}

}
