package com.young.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.young.simple.HelloWorld;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/young/bean/bean.xml");
	      HelloWorld objA = (HelloWorld) context.getBean("singletonHelloWorld");
	      objA.setMessage("I'm object A");
	      objA.getMessage();
	      HelloWorld objB = (HelloWorld) context.getBean("singletonHelloWorld");
	      objB.getMessage();
	      
	     HelloWorld objC = (HelloWorld) context.getBean("prototypeHelloWorld");
	     objC.setMessage("I'm object C");
	     objC.getMessage();
	     HelloWorld objD = (HelloWorld) context.getBean("prototypeHelloWorld");
	     objD.getMessage();
	}

}
