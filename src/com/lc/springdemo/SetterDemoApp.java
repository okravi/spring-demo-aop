package com.lc.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {

	//load the Spring configuration file
	ClassPathXmlApplicationContext context = 
			new ClassPathXmlApplicationContext("applicationContext.xml");
	//retrieve bean from Spring container
	CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);	
	//call methods on the bean
	System.out.println(theCoach.getDailyFortune());
	System.out.println(theCoach.getDailyWorkout());
	//call methods to get injected literal values
	System.out.println(theCoach.getEmailAddress());
	System.out.println(theCoach.getTeam());
	//close the Sprint context
	context.close();
	}

}
