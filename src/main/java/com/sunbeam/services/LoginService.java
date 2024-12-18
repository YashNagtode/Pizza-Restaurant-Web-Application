package com.sunbeam.services;

import com.sunbeam.entities.Customer;
import com.sunbeam.models.Credentials;

public interface LoginService {
	Customer athenticate(Credentials cr);

	int saveUser(Customer cust);
	
}
