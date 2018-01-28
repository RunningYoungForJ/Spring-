package com.young.annotation.qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	/*
	 *Spring @Qualifier 注释
		可能会有这样一种情况，当你创建多个具有相同类型的 bean 时，
		并且想要用一个属性只为它们其中的一个进行装配，在这种情况下，你可以使用 @Qualifier 注释和 @Autowired 注释通过指定哪一个真正的 bean 将会被装配来消除混乱。
	 
	 使用@Qualifier用来指定注入相同类型的多个bean中的一个，通常搭配@Autowired来使用
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/young/annotation/qualifier/qualifier.xml");
		Profile profile=context.getBean("profile", Profile.class);
		profile.printName();
		profile.printAge();

	}

}
