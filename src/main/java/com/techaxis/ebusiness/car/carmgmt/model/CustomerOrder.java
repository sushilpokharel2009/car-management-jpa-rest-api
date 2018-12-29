package com.techaxis.ebusiness.car.carmgmt.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "customerOrder")
public class CustomerOrder {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int customerOrderId;

	@Column(name = "QUANTITY")
	private String quantity;

	@Column(name = "ORDER_DATE")
	private Date orderDate;

	@JoinColumn(name = "CUSTOMER_ID")
	@ManyToOne(cascade = CascadeType.ALL)
	private Customer customerId;

	@JoinColumn(name = "new_car_id")
	@OneToOne(cascade = CascadeType.ALL)
	private NewCar newCarId;

	@JoinColumn(name = "used_car_id")
	@OneToOne(cascade = CascadeType.ALL)
	private UsedCar usedCarId;

	public int getCustomerOrderId() {
		return customerOrderId;
	}

	public void setCustomerOrderId(int customerOrderId) {
		this.customerOrderId = customerOrderId;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Customer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Customer customerId) {

		this.customerId = customerId;
	}

	@Override
	public String toString() {
		return "CustomerOrderService [customerOrderId=" + customerOrderId + ", quantity=" + quantity + ", orderDate="
				+ orderDate + ", carRefrenceNumber= , customerId=" + customerId + "]";
	}

}
