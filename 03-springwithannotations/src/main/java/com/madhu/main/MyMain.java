package com.madhu.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.madhu.service.UserService;

public class MyMain {

	public static void main(String[] args) {
ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
UserService service=(UserService) context.getBean(UserService.class);
service.storeInDB();
	}

}
