package com.madhu.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

	public UserDao() {
		System.out.println("UserDao object is created..");
	}
	public boolean save() {
		System.out.println("user dao object is saved...");
		return true;
	}
	
}
