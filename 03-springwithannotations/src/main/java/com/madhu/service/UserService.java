package com.madhu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.madhu.dao.UserDao;

@Service
public class UserService {
	@Autowired
	private UserDao userdao;
	public UserService() {
System.out.println("Use service object is created....");
	}
	
	public void storeInDB() {
		boolean status=userdao.save();
		if(status) {
			System.out.println("Storing success");
		}else {
			System.out.println("Storing failed");
		}
	}

}
