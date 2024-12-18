package com.sunbeam.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pizza_orders")
public class Orders {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	int customerId;
	Date orderTime;
	String status;
	
	public Orders() {
	}

	public Orders(int id, int customerId, Date orderTime, String status) {
		this.id = id;
		this.customerId = customerId;
		this.orderTime = orderTime;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public Date getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Orders [id=" + id + ", customerId=" + customerId + ", orderTime=" + orderTime + ", status=" + status
				+ "]";
	}
	
	
}
