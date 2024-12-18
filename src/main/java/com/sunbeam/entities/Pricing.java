package com.sunbeam.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pizza_pricing")
public class Pricing {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	int intemId;
	String sizes;
	double price;
	
	public Pricing() {
	}

	public Pricing(int id, int intemId, String sizes, double price) {
		this.id = id;
		this.intemId = intemId;
		this.sizes = sizes;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIntemId() {
		return intemId;
	}

	public void setIntemId(int intemId) {
		this.intemId = intemId;
	}

	public String getSizes() {
		return sizes;
	}

	public void setSizes(String sizes) {
		this.sizes = sizes;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Pricing [id=" + id + ", intemId=" + intemId + ", sizes=" + sizes + ", price=" + price + "]";
	}
	
	
}
