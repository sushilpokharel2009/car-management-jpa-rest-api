package com.techaxis.ebusiness.car.carmgmt.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "newCar")
public class NewCar extends Car {

	

	@Column(name = "WARRANTY")
	private String warranty;

	@Column(name = "EXTENDED__SIDE_ASSISTANCE")
	private boolean hasRoadSideAssistance;

//
//	public CustomerOrder getCustomerOrderId() {
//		return customerOrderId;
//	}
//
//	public void setCustomerOrderId(CustomerOrder customerOrderId) {
//		this.customerOrderId = customerOrderId;
//	}

//	@OneToOne
//	@JoinColumn(name = "CUSTOMER_ORDER_ID")
//	private CustomerOrder customerOrderId;


	public String getWarranty() {
		return warranty;
	}

	public void setWarranty(String warranty) {
		this.warranty = warranty;
	}

	public boolean isHasRoadSideAssistance() {
		return hasRoadSideAssistance;
	}

	public void setHasRoadSideAssistance(boolean hasRoadSideAssistance) {
		this.hasRoadSideAssistance = hasRoadSideAssistance;
	}

	@Override
	public String toString() {
		return "NewCar [warranty=" + warranty + ", hasRoadSideAssistance=" + hasRoadSideAssistance
				+ ", customerOrderId=]";
	}



}
