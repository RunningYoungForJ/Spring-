package com.young.aop.aspectJ;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Logging {
	
	@Pointcut("execution(* com.young.aop.aspectJ.*.*(..))")
	private void selectAll() {
		
	}
	
	@Before("selectAll()")
	public void beforeAdvice() {
		System.out.println("going to setup student profile");
	}
	
	@After("selectAll()")
	public void afterAdvice() {
		System.out.println("student profile has been setup");
	}
	
	@AfterReturning(pointcut="selectAll()",returning="retVal")
	public void afterReturningAdvice(Object retVal) {
		System.out.println("returning: "+retVal.toString());
	}
	
	@AfterThrowing(pointcut="selectAll()",throwing="ex")
	public void afterThrowingAdvice(IllegalArgumentException ex) {
		System.out.println("there has been an exception: "+ex.toString());
	}
}
