package com.young.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

import com.sun.accessibility.internal.resources.accessibility;

import sun.net.www.content.text.plain;

public class CustomEventPublisher implements ApplicationEventPublisherAware {

	private ApplicationEventPublisher publisher;

	@Override
	public void setApplicationEventPublisher(
			ApplicationEventPublisher applicationEventPublisher) {
		// TODO Auto-generated method stub
		this.publisher=applicationEventPublisher;
	}
	
	public void publish() {
		CustomEvent cEvent=new CustomEvent(this);
		publisher.publishEvent(cEvent);
	}

}
