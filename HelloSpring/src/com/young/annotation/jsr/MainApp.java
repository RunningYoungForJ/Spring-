package com.young.annotation.jsr;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	/*
	 * Spring JSR-250 注释
		Spring还使用基于 JSR-250 注释，它包括 @PostConstruct， @PreDestroy 和 @Resource 注释。因为你已经有了其他的选择，尽管这些注释并不是真正所需要的，但是关于它们仍然让我给出一个简短的介绍。
		
		@PostConstruct 和 @PreDestroy 注释：
		为了定义一个 bean 的安装和卸载，我们使用 init-method 和/或 destroy-method 参数简单的声明一下 。init-method 属性指定了一个方法，该方法在 bean 的实例化阶段会立即被调用。同样地，destroy-method 指定了一个方法，该方法只在一个 bean 从容器中删除之前被调用。
		
		你可以使用 @PostConstruct 注释作为初始化回调函数的一个替代，@PreDestroy 注释作为销毁回调函数的一个替代
		
		@Resource 注释：
			你可以在字段中或者 setter 方法中使用 @Resource 注释，
			它和在 Java EE 5 中的运作是一样的。@Resource 注释使用一个 ‘name’ 属性，
			该属性以一个 bean 名称的形式被注入。你可以说，它遵循 by-name 自动连接语义
			如果没有明确地指定一个 ‘name’，默认名称源于字段名或者 setter 方法。
			在字段的情况下，它使用的是字段名；
			在一个 setter 方法情况下，它使用的是 bean 属性名称。
			具体用法见com.young.annotation.qualifier中Profile类
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/young/annotation/jsr/jsr250.xml");
		HelloWorld obj= (HelloWorld)context.getBean("helloWorld");
		obj.getMessage();
		//AbstractApplicationContext 类中声明的关闭 hook 的 registerShutdownHook() 方法。
		//它将确保正常关闭，并且调用相关的 destroy 方法。
		//如果没有调用这个方法，bean的destroy方法将不会被调用。
		context.registerShutdownHook();
	}

}
