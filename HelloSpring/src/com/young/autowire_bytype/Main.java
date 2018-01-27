package com.young.autowire_bytype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	/*
	 * Spring 自动装配 ‘byType’
		这种模式由属性类型指定自动装配。Spring 容器看作 beans，在 XML 配置文件中 beans 的 autowire 属性设置为 byType。然后，
		如果它的 type 恰好与配置文件中 beans 名称中的一个相匹配，它将尝试匹配和连接它的属性。如果找到匹配项，它将注入这些 beans，否则，它将抛出异常。
	 * * * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/young/autowire_bytype/autowire-bytype.xml");
		TextEditor textEditor=(TextEditor)context.getBean("textEditor");
		textEditor.spellCheck();
	}

}
