package com.young.autowire_constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	/*
	 * Spring 由构造函数自动装配
		这种模式与 byType 非常相似，但它应用于构造器参数。Spring 容器看作 beans，在 XML 配置文件中 beans 的 autowire 属性设置为 constructor。
		然后，它尝试把它的构造函数的参数与配置文件中 beans 名称中的一个进行匹配和连线。如果找到匹配项，它会注入这些 bean，否则，它会抛出异常。
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/young/autowire_constructor/autowire-constructor.xml");
		TextEditor textEditor=(TextEditor)context.getBean("textEditor");
		textEditor.spellCheck();
	}

}
