package com.young.event;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	/*
	 * Spring自定义事件*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/young/event/event.xml");
		CustomEventPublisher publisher=context.getBean(CustomEventPublisher.class);
		publisher.publish();
		publisher.publish();
	}

}
