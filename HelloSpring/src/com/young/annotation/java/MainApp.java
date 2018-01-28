package com.young.annotation.java;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

		/*
		 * 基于 Java 的配置			
			基于 Java 的配置选项，可以使你在不用配置 XML 的情况下编写大多数的 Spring，但是一些有帮助的基于 Java 的注解，解释如下：
			@Configuration 和 @Bean 注解
			带有 @Configuration 的注解类表示这个类可以使用 Spring IoC 容器作为 bean 定义的来源。
			@Bean 注解告诉 Spring，一个带有 @Bean 的注解方法将返回一个对象，该对象应该被注册为在 Spring 应用程序上下文中的 bean。
			
			带有 @Bean 注解的方法名称作为 bean 的 ID，它创建并返回实际的 bean。
			你的配置类可以声明多个 @Bean。一旦定义了配置类，你就可以使用 AnnotationConfigApplicationContext 来加载并把他们提供给 Spring 容器
			
			注入 Bean 的依赖性
				当 @Beans 依赖对方时，表达这种依赖性非常简单，只要有一个 bean 方法调用另一个
				在TextEditor和SpellChecker中说明了如何在具有依赖关系的Bean之间建立联系
			@import 注解允许从另一个配置类中加载 @Bean 定义。
			
			生命周期回调
				@Bean 注解支持指定任意的初始化和销毁的回调方法，就像在 bean 元素中 Spring 的 XML 的初始化方法和销毁方法的属性
				@Bean(initMethod = "init", destroyMethod = "cleanup" )
			指定 Bean 的范围：
				默认范围是单实例，但是你可以重写带有 @Scope 注解的该方法
				@Scope("prototype")
			*/
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context=new AnnotationConfigApplicationContext(HelloWorldConfig.class,TextEditorConfig.class);
		HelloWorld obj= (HelloWorld)context.getBean(HelloWorld.class);
		obj.setMessage("Hello World");
		obj.getMessage();
		TextEditor textEditor=context.getBean(TextEditor.class);
		textEditor.spellCheck();
	}

}
