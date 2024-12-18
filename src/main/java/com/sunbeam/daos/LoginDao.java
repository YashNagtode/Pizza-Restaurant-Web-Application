package com.sunbeam.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunbeam.entities.Customer;

public interface LoginDao extends JpaRepository<Customer, Integer>{
	
	Customer findByEmail(String email);
}
