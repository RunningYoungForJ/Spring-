package com.young.innerbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	/*
	 * 注入内部 Beans
		正如你所知道的 Java 内部类是在其他类的范围内被定义的，
		同理，inner beans 是在其他 bean 的范围内定义的 bean。
		因此在 或 元素内 元素被称为内部bean，如下所示。
		<bean id="outerBean" class="...">
      		<property name="target">
         		<bean id="innerBean" class="..."/>
      		</property>
   		</bean>
   		注意在di-innerbean.xml中，TextEditor需要注入SpellChecker，但不同于基于构造器或者setter方法注入，
   		而是将SpellChecker的bean放在TextEditor内部，即<property>子标签的内部来实现注入。
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/young/innerbean/di-innerbean.xml");
		
	TextEditor textEditor=(TextEditor)context.getBean("textEditor");
	textEditor.spellCheck();
	}

}
