package com.sunbeam.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name= "pizza_items")
public class Item {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@NotBlank
	private String name;
	@NotBlank
	private String type;
	@NotBlank
	private String category;
	@NotBlank
	private String description;
	
	public Item() {
	}

	public Item(int id, @NotBlank String name, @NotBlank String type, @NotBlank String category,
			@NotBlank String description) {
		this.id = id;
		this.name = name;
		this.type = type;
		this.category = category;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", type=" + type + ", category=" + category + ", description="
				+ description + "]";
	}
	
	
	
	

	
	
}
