package com.young.annotation.applicationlistener;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class HelloWorld {
	
	private String message;

	/**
	 * @return the message
	 */
	public void getMessage() {
		System.out.println("Your Message: "+message);
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Bean is going through init");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Bean is destroy now");
	}
	

}
