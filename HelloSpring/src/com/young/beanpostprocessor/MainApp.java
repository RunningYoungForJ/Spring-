package com.young.beanpostprocessor;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	/*
	 * BeanPostProcessor实现的Bean后置处理方法会在bean实例化之前和之后执行
	 * 只要定义了一个BeanPostProcessor接口的实现类，IOC容器就会在实例化任何一个Bean的时候都会在之前和之后调用该实现的后置处理器
	 * 后置处理器的执行与是否设置了bean的init方法并不关系
	 * BeanPostProcessor 接口定义回调方法，你可以实现该方法来提供自己的实例化逻辑，依赖解析逻辑等。你也可以在 Spring 容器通过插入一个或多个 BeanPostProcessor 的实现来完成实例化，配置和初始化一个bean之后实现一些自定义逻辑回调方法。
	 * 你可以配置多个 BeanPostProcessor接口，通过设置 BeanPostProcessor 实现的 Ordered 接口提供的 order 属性来控制这些 BeanPostProcessor 接口的执行顺序。
		
		BeanPostProcessor 可以对 bean（或对象）实例进行操作，这意味着 Spring IoC 容器实例化一个 bean 实例，然后 BeanPostProcessor 接口进行它们的工作。
		
		ApplicationContext 会自动检测由 BeanPostProcessor 接口的实现定义的 bean，注册这些 bean 为后置处理器，然后通过在容器中创建 bean，在适当的时候调用它。
			 
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/young/beanpostprocessor/Beans-postprocessor.xml");
		HelloWorld obj= (HelloWorld)context.getBean("helloWorld");
		obj.getMessage();
		//AbstractApplicationContext 类中声明的关闭 hook 的 registerShutdownHook() 方法。
		//它将确保正常关闭，并且调用相关的 destroy 方法。
		//如果没有调用这个方法，bean的destroy方法将不会被调用。
		context.registerShutdownHook();
	}

}
