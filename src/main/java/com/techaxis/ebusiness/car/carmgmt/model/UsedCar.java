package com.techaxis.ebusiness.car.carmgmt.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "usedCar")
public class UsedCar extends Car {


	@Column(name = "REG_NO")
	private int regNo;

	@Column(name = "ODOMETER")
	private int odometer;

	@Column(name = "REG_EXPIRY")
	private boolean regExpiry;

	@Column(name = "SERVICE_HISTORY")
	private String serviceHistory;


//	@OneToOne
//	@JoinColumn(name = "CUSTOMER_ID")
//	private CustomerOrder customerOrder;
	
	public UsedCar() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getRegNo() {
		return regNo;
	}

	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}

	public int getOdometer() {
		return odometer;
	}

	public void setOdometer(int odometer) {
		this.odometer = odometer;
	}

	public boolean isRegExpiry() {
		return regExpiry;
	}

	public void setRegExpiry(boolean regExpiry) {
		this.regExpiry = regExpiry;
	}

	public String getServiceHistory() {
		return serviceHistory;
	}

	public void setServiceHistory(String serviceHistory) {
		this.serviceHistory = serviceHistory;
	}

	@Override
	public String toString() {
		return "UsedCar [regNo=" + regNo + ", odometer=" + odometer + ", regExpiry=" + regExpiry + ", serviceHistory="
				+ serviceHistory + ", customerOrder]";
	}

}
