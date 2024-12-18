package com.sunbeam.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunbeam.daos.LoginDao;
import com.sunbeam.entities.Customer;
import com.sunbeam.models.Credentials;

@Service
public class LoginServiceImpl implements LoginService {
	@Autowired
	private LoginDao customerDao;

	@Override
	public Customer athenticate(Credentials cr) {
		Customer dbCust = customerDao.findByEmail(cr.getEmail());
		if (dbCust != null && dbCust.getPassword().equals(cr.getPassword())) {
			return dbCust;
		} else {
			return null;
		}

	}

	@Override
	public int saveUser(Customer cust) {
		customerDao.save(cust);
		return 1;
		
	}

}
