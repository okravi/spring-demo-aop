package com.lc.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.lc.aopdemo.dao.AccountDAO;

public class MainDemoApp {

	public static void main(String[] args) {

		//read spring config
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(DemoConfig.class);
		
		//get the bean from container
		AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);
		
		//call business method
		theAccountDAO.addAccount();
		
		//close the context
		context.close();
	}

}
