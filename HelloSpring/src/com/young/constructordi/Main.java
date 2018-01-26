package com.young.constructordi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	/*
	 * 依赖注入
		每个基于应用程序的 java 都有几个对象，这些对象一起工作来呈现出终端用户所看到的工作的应用程序。
		当编写一个复杂的 Java 应用程序时，应用程序类应该尽可能独立于其他 Java 类来增加这些类重用的可能性，
		并且在做单元测试时，测试独立于其他类的独立性。依赖注入（或有时称为布线）有助于把这些类粘合在一起，同时保持他们独立。
		
		在这里，TextEditor 不应该担心 SpellChecker 的实现。SpellChecker 将会独立实现，并且在 TextEditor 实例化的时候将提供给 TextEditor，整个过程是由 Spring 框架的控制。
		在这里，我们已经从 TextEditor 中删除了全面控制，并且把它保存到其他地方（即 XML 配置文件），且依赖关系（即 SpellChecker 类）通过类构造函数被注入到 TextEditor 类中。
		因此，控制流通过依赖注入（DI）已经“反转”，因为你已经有效地委托依赖关系到一些外部系统。
		依赖注入的第二种方法是通过 TextEditor 类的 Setter 方法，我们将创建 SpellChecker 实例，该实例将被用于调用 setter 方法来初始化 TextEditor 的属性。

		基于构造函数和基于 setter 方法的 DI，然而使用有强制性依存关系的构造函数和有可选依赖关系的 sette r是一个好的做法。
	 
	 	Spring 基于构造函数的依赖注入
			当容器调用带有一组参数的类构造函数时，基于构造函数的 DI 就完成了，其中每个参数代表一个对其他类的依赖。
			在配置文件中，每一个bean使用子标签<constructor-arg>来实现构造器注入
			如果在bean的构造方法中存在多个参数，那么，在使用子标签<constructor-arg>的时候，需要bean定义中对象顺序与代码构造函数中的参数类型顺序一致，当然也可以通过index属性来定位参数位置
			如果构造函数需要的是一个基本数据类型，不是一个对象的引用，那么，在子标签<constructor-arg>中使用type+value属性，其中，type指明参数类型，value指明参数值
			
			总之：如果你想要向一个对象传递一个引用，你需要使用 标签的 ref 属性，如果你想要直接传递值，那么你应该使用如上所示的 value 属性。
			
	 
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/young/constructordi/di-constructor.xml");
		
	TextEditor textEditor=(TextEditor)context.getBean("textEditor");
	textEditor.spellCheck();
	}

}
