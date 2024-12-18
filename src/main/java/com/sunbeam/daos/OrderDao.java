package com.sunbeam.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunbeam.entities.Orders;

public interface OrderDao extends JpaRepository<Orders, Integer>{
	
	
	
}
