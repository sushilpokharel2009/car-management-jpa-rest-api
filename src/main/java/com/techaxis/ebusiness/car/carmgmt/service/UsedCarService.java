package com.techaxis.ebusiness.car.carmgmt.service;

import java.util.List;

import com.techaxis.ebusiness.car.carmgmt.model.NewCar;
import com.techaxis.ebusiness.car.carmgmt.model.UsedCar;

public interface UsedCarService {

	public List<UsedCar> getAllUsedCars();

	public UsedCar createUsedCar(UsedCar car);

	public UsedCar getUsedCarById(Long carId);

	public UsedCar updateCar(Long id, UsedCar car);

	public void deleteUsedCar(Long carId);

}
