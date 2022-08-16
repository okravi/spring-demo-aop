package com.lc.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;

	
public TrackCoach(FortuneService theFortuneService) {
		
		this.fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run 5k";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();

	}
	
	//add an init method
	public void doMyStartupStuff() {
		System.out.println("Track Coach: init method");
	}
	//add a destroy method
	public void doMyCleanupStuff() {
		System.out.println("Track Coach: destroy method");
	}
}
