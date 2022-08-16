package com.lc.springdemo;

public class BaseballCoach implements Coach{
	
	private FortuneService fortuneService;

	public BaseballCoach(FortuneService theFortuneService) {
		
		this.fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Spend 30 min playing baseball";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}
	
	
}
