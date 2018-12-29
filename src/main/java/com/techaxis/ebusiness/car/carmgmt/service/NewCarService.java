package com.techaxis.ebusiness.car.carmgmt.service;

import java.util.List;

import com.techaxis.ebusiness.car.carmgmt.model.NewCar;

public interface NewCarService {

	public List<NewCar> getAllNewCars();

	public NewCar createNewCar(NewCar car);

	public NewCar getNewCarById(Long carId);

	public NewCar updateCar(Long id, NewCar car);

	public void deleteNewCar(Long carId);

}
