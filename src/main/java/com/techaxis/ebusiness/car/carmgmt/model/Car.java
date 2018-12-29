package com.techaxis.ebusiness.car.carmgmt.model;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotBlank;


@MappedSuperclass
public class Car {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank
	private String carNo;

	@NotBlank
	private String carDescription;

	// @Column(name = "MAKE")
	private String make;

	// @Column(name = "MODEL")
	private String model;

	// @Column(name = "DRIVE_TYPE")
	private String driveType;

	// @Column(name = "COLOR")
	private String color;

	// @Column(name = "TRANSIMISSION")
	private String transimission;

	// @Column(name = "ENGINE")
	private String engine;

	// @Column(name = "FUEL_TYPE")
	private String fuelType;

	// @Column(name = "DOORS")
	private int doors;

	// @Column(name = "SEATS")
	private int seats;
	
	private Date createdDate;

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCarNo() {
		return carNo;
	}

	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}

	public String getCarDescription() {
		return carDescription;
	}

	public void setCarDescription(String carDescription) {
		this.carDescription = carDescription;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getDriveType() {
		return driveType;
	}

	public void setDriveType(String driveType) {
		this.driveType = driveType;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTransimission() {
		return transimission;
	}

	public void setTransimission(String transimission) {
		this.transimission = transimission;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", carNo=" + carNo + ", carDescription=" + carDescription + ", make=" + make
				+ ", model=" + model + ", driveType=" + driveType + ", color=" + color + ", transimission="
				+ transimission + ", engine=" + engine + ", fuelType=" + fuelType + ", doors=" + doors + ", seats="
				+ seats + "]";
	}

}
