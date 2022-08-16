package com.lc.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {
	
	@Before("execution (* add*())")
//	@Before("execution (public void add*())")

	public void beforeAddAccountAdvice() {
		
		System.out.println("\n ====> Executing @Before advice");
	}
}
