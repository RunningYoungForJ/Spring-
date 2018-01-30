package com.young.aop.aspectJ;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	/*
	 *
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/young/aop/aspectJ/aspectj.xml");
		Student student=context.getBean(Student.class);
		student.getName();
		student.getAge();
		student.printThrowException();
	}

}
