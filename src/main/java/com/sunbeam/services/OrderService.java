package com.sunbeam.services;

import java.util.List;

import com.sunbeam.entities.Item;

public interface OrderService {
	
	List<String> getAllVegCategories();
	
	List<String> getAllNonVegCategories();

	List<Object[]> getAllItems(String category, String type);
	
}
