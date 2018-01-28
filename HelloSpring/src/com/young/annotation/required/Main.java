package com.young.annotation.required;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	/*
	 * 基于注解的配置
		从 Spring 2.5 开始就可以使用注解来配置依赖注入。而不是采用 XML 来描述一个 bean 连线，你可以使用相关类，方法或字段声明的注解，将 bean 配置移动到组件类本身。
		
		在 XML 注入之前进行注解注入，因此后者的配置将通过两种方式的属性连线被前者重写。
		
		注解连线在默认情况下在 Spring 容器中不打开。因此，在可以使用基于注解的连线之前，我们将需要在我们的 Spring 配置文件中启用它。
		所以如果你想在 Spring 应用程序中使用的任何注解，可以考虑到下面的配置文件。
		<?xml version="1.0" encoding="UTF-8"?>

<beans xmlns="http://www.springframework.org/schema/beans"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xmlns:context="http://www.springframework.org/schema/context"
    xsi:schemaLocation="http://www.springframework.org/schema/beans
    http://www.springframework.org/schema/beans/spring-beans-3.0.xsd
    http://www.springframework.org/schema/context
    http://www.springframework.org/schema/context/spring-context-3.0.xsd">

   <context:annotation-config/>
   <!-- bean definitions go here -->

</beans>
注意，使用<context：annotation-config／>在配置文件中打开注解

一旦 被配置后，你就可以开始注解你的代码，表明 Spring 应该自动连接值到属性，方法和构造函数。让我们来看看几个重要的注解，并且了解它们是如何工作的：

序号	注解 & 		描述
1	@Required	@Required 注解应用于 bean 属性的 setter 方法。

2	@Autowired	@Autowired 注解可以应用到 bean 属性的 setter 方法，非 setter 方法，构造函数和属性。

3	@Qualifier	通过指定确切的将被连线的 bean，@Autowired 和 @Qualifier 注解可以用来删除混乱。

4	JSR-250 Annotations	Spring 支持 JSR-250 的基础的注解，其中包括了 @Resource，@PostConstruct 和 @PreDestroy 注解。



	 * 
	 * @Required 注释应用于 bean 属性的 setter 方法，它表明受影响的 bean 属性在配置时必须放在 XML 配置文件中，
	 * 否则容器就会抛出一个 BeanInitializationException 异常。
	 * 
	 * 使用@Required注解标记的setter方法，表明该bean必须通过setter方法实现依赖注入，因此在xml中，或者对应的依赖对象中，必须能够已经创建了一个依赖对象的bean，
	 * 无论是通过xml中的显性配置，还是通过@Autowired注解配置，必须保证在IOC容器中有@Required需要的bean。
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/young/annotation/required/required.xml");
		Student student=context.getBean("student", Student.class);
		System.out.println("Name: "+student.getName());
		System.out.println("Age: "+student.getAge());

	}

}
