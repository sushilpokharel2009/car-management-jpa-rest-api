package com.techaxis.ebusiness.car.carmgmt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techaxis.ebusiness.car.carmgmt.model.NewCar;
import com.techaxis.ebusiness.car.carmgmt.repository.NewCarRepository;


@Service
public class NewCarServiceImpl implements NewCarService {

	@Autowired
	NewCarRepository newCarRepository;

	@Override
	public List<NewCar> getAllNewCars() {
		List<NewCar> allCars = newCarRepository.findAll();
		return allCars;
	}
	
	@Override
	public NewCar createNewCar(NewCar car) {
		
		System.out.println(newCarRepository);

		return newCarRepository.save(car);
	}

	@Override
	public NewCar getNewCarById(Long carId) {
		NewCar car = newCarRepository.findById(carId).orElseThrow(() -> new RuntimeException("customer not fount with id :"+ carId));
		return car;
	}

	@Override
	public NewCar updateCar(Long carId, NewCar updateNewCar) {
		NewCar newCar = newCarRepository.findById(carId).orElseThrow(() -> new RuntimeException("customer not fount with id :"+ carId));
		newCar.setCarNo(updateNewCar.getCarNo());
		newCar.setCarDescription(updateNewCar.getCarDescription());
		newCar.setColor(updateNewCar.getColor());
		newCar.setDoors(updateNewCar.getDoors());
		newCar.setDriveType(updateNewCar.getDriveType());
		newCar.setEngine(updateNewCar.getEngine());
		newCar.setFuelType(updateNewCar.getFuelType());
		newCar.setMake(updateNewCar.getMake());
		newCar.setModel(updateNewCar.getModel());
		newCar.setSeats(updateNewCar.getSeats());
		newCar.setTransimission(updateNewCar.getTransimission());

		NewCar updatedCar = newCarRepository.save(newCar);

		return updatedCar;
	}

	@Override
	public void deleteNewCar(Long carId) {
		NewCar car = newCarRepository.findById(carId).orElseThrow(() -> new RuntimeException("customer not fount with id :"+ carId));
		newCarRepository.delete(car);

	}

}
