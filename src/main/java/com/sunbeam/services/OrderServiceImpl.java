package com.sunbeam.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunbeam.daos.MenuDao;
import com.sunbeam.daos.OrderDao;
import com.sunbeam.entities.Item;

@Service
public class OrderServiceImpl implements OrderService{
	@Autowired
	private OrderDao orderDao;
	
	@Autowired
	private MenuDao menuDao;

	@Override
	public List<String> getAllVegCategories() {
		List<String> list= menuDao.findByCategory();
		return list;
	}
	
	@Override
	public List<String> getAllNonVegCategories() {
		List<String> list= menuDao.findByNonVegCategory();
		return list;
	
	
	}

	@Override
	public List<Object[]> getAllItems(String category, String type) {
		return menuDao.findByCategoryAndType(category, type);

	}

	

}
