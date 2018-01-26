package com.young.setterdi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	/*
	 * Spring 基于设值函数的依赖注入
		当容器调用一个无参的构造函数或一个无参的静态 factory 方法来初始化你的 bean 后，
		通过容器在你的 bean 上调用设值函数，基于设值函数的 DI 就完成了。
		
		基于构造函数注入和基于设值函数注入中的 Beans.xml 文件的区别。唯一的区别就是在基于构造函数注入中，我们使用的是子标签<coonstructor-arg>元素，
		而在基于设值函数的注入中，我们使用的是<property>子标签。

		第二个你需要注意的点是，如果你要把一个引用传递给一个对象，那么你需要使用标签的 ref 属性，
		而如果你要直接传递一个值，那么你应该使用 value 属性。
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/young/setterdi/di-setter.xml");
		
	TextEditor textEditor=(TextEditor)context.getBean("textEditor");
	textEditor.spellCheck();
	}

}
