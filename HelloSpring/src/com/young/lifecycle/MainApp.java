package com.young.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	/*
	 * Bean 的生命周期
		理解 Spring bean 的生命周期很容易。当一个 bean 被实例化时，它可能需要执行一些初始化使它转换成可用状态。同样，当 bean 不再需要，并且从容器中移除时，可能需要做一些清除工作。
		尽管还有一些在 Bean 实例化和销毁之间发生的活动，但是本章将只讨论两个重要的生命周期回调方法，它们在 bean 的初始化和销毁的时候是必需的。
		为了定义安装和拆卸一个 bean，我们只要声明带有 init-method 和/或 destroy-method 参数的 。
		init-method 属性指定一个方法，在实例化 bean 时，立即调用该方法。
		同样，destroy-method 指定一个方法，只有从容器中移除 bean 之后，才能调用该方法。
		
		可以通过实现org.springframework.beans.factory.InitializingBean接口或者org.springframework.beans.factory.DisposableBean 接口来创建相应Bean的init初始化方法和destroy销毁方法
		但这种方式不提倡，通常在在Bean中单独定义init和destroy方法，并在XML配置中使用Bean的init-method和destroy-method属性配置初始化和销毁方法。
	默认的初始化和销毁方法
		如果你有太多具有相同名称的初始化或者销毁方法的 Bean，那么你不需要在每一个 bean 上声明初始化方法和销毁方法。框架使用 元素中的 default-init-method 和 default-destroy-method 属性提供了灵活地配置这种情况
		default-init-method="init" 
	    default-destroy-method="destroy"
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/young/lifecycle/Beans-lifecycle.xml");
		HelloWorld obj= (HelloWorld)context.getBean("helloWorld");
		obj.getMessage();
		//AbstractApplicationContext 类中声明的关闭 hook 的 registerShutdownHook() 方法。
		//它将确保正常关闭，并且调用相关的 destroy 方法。
		//如果没有调用这个方法，bean的destroy方法将不会被调用。
		context.registerShutdownHook();
	}

}
