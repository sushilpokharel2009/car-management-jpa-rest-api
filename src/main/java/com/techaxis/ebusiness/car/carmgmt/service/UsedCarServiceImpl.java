package com.techaxis.ebusiness.car.carmgmt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techaxis.ebusiness.car.carmgmt.model.UsedCar;
import com.techaxis.ebusiness.car.carmgmt.repository.UsedCarRepository;
@Service
public class UsedCarServiceImpl implements UsedCarService {

	@Autowired
	UsedCarRepository usedCarRepository;

	@Override
	public List<UsedCar> getAllUsedCars() {
		List<UsedCar> allCars = usedCarRepository.findAll();
		return allCars;
	}

	@Override
	public UsedCar createUsedCar(UsedCar car) {

		return usedCarRepository.save(car);
	}

	@Override
	public UsedCar getUsedCarById(Long carId) {
		UsedCar car = usedCarRepository.findById(carId).orElseThrow(() -> new RuntimeException("customer not fount with id :"+ carId));
		return car;
	}

	@Override
	public UsedCar updateCar(Long carId, UsedCar updateNewCar) {
		UsedCar usedCar = usedCarRepository.getOne(carId);
		usedCar.setCarNo(updateNewCar.getCarNo());
		usedCar.setCarDescription(updateNewCar.getCarDescription());
		usedCar.setColor(updateNewCar.getColor());
		usedCar.setDoors(updateNewCar.getDoors());
		usedCar.setDriveType(updateNewCar.getDriveType());
		usedCar.setEngine(updateNewCar.getEngine());
		usedCar.setFuelType(updateNewCar.getFuelType());
		usedCar.setMake(updateNewCar.getMake());
		usedCar.setModel(updateNewCar.getModel());
		usedCar.setSeats(updateNewCar.getSeats());
		usedCar.setTransimission(updateNewCar.getTransimission());
		usedCar.setServiceHistory(updateNewCar.getServiceHistory());
		usedCar.setRegNo(updateNewCar.getRegNo());
		usedCar.setOdometer(updateNewCar.getOdometer());
		//usedCar.setRegExpiry(updateNewCar.getRegExpiry);

		UsedCar updatedCar = usedCarRepository.save(usedCar);

		return updatedCar;
	}

	@Override
	public void deleteUsedCar(Long carId) {
		UsedCar car = usedCarRepository.findById(carId).orElseThrow(() -> new RuntimeException("customer not fount with id :"+ carId));
		usedCarRepository.delete(car);

	}

}
