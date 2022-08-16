package com.lc.springdemo;

public class RandomFortuneService implements FortuneService {
	
	String[] fortunes = new String[] {"It all passes",
			"This is the best day of your life",
			"Brace for impact"};

	@Override
	public String getFortune() {

		return fortunes[(int)(Math.random() * 3)];
	}

}
