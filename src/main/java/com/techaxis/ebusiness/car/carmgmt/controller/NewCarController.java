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

import com.techaxis.ebusiness.car.carmgmt.model.NewCar;
import com.techaxis.ebusiness.car.carmgmt.service.NewCarService;
import com.techaxis.ebusiness.car.carmgmt.service.NewCarServiceImpl;

@RestController
@RequestMapping("/admin/api")
public class NewCarController {

	@Autowired
	NewCarService newCarService;
	
//	public NewCarController() {
//		this.newCarService = new NewCarServiceImpl();
//	}
	
	@GetMapping("/newcars")
	public List<NewCar> getAllUsedCars() {
		return newCarService.getAllNewCars();
	}

	@PostMapping("/newcar")
	public NewCar createNewCar(@Valid @RequestBody NewCar car) {
		System.out.println("This is car--------:"+car);
		return newCarService.createNewCar(car);
	}

	@GetMapping("/newcar/{id}")
	public NewCar getNewCarById(@PathVariable(value = "id") Long carId) {
		return newCarService.getNewCarById(carId);
				//.orElseThrow(() -> new RuntimeException("Car not found with id :" + carId));
	}

	@PutMapping("/newcar/{id}")
	public NewCar updateCar(@PathVariable(value = "id") Long carId, @Valid @RequestBody NewCar carDetails) {

		return newCarService.updateCar(carId, carDetails);
				//.orElseThrow(() -> new RuntimeException("Car not found with id :" + carId));


	}

	@DeleteMapping("/newcar/{id}")
	public ResponseEntity<?> deleteNewCar(@PathVariable(value = "id") Long carId) {
		 newCarService.deleteNewCar(carId);
				//.orElseThrow(() -> new RuntimeException("Car not found with id :" + carId));

		//newCarService.delete(car);

		return ResponseEntity.ok().build();
	}

}
