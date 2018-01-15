package com.young.applicationcontext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.young.simple.HelloWorld;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*ApplicationContext是Spring中的高级容器，和BeanFactory类似，可以加载配置文件中定义的bean，将所有的bean集中在一起，当有请求的时候分配bean。
		 * ApplicationContext包含了BeanFactory的所有功能，一般情况下，相对于BeanFactory，ApplicationContext推荐使用。而BeanFactory推荐在轻量级应用中使用。
		 * 最常被使用的ApplicationContext接口实现：
		 * 1. FileSystemXmlApplicationContext：该容器从XML文件中加载已定义的bean，需要在构造器中给出XML文件的完整路径。
		 * 2. ClassPathXmlApplicationContext：该容器从 XML 文件中加载已被定义的 bean。在这里，你不需要提供 XML 文件的完整路径，只需正确配置 CLASSPATH 环境变量即可，因为，容器会从 CLASSPATH 中搜索 bean 配置文件。
		 * 3. WebXmlApplicationContext：该容器会在一个 web 应用程序的范围内加载在 XML 文件中已被定义的 bean。
		 * 执行过程：
		 * 1. 第一步生成工厂对象。加载完指定路径下 bean 配置文件后，利用框架提供的 FileSystemXmlApplicationContext API 去生成工厂 bean。FileSystemXmlApplicationContext 负责生成和初始化所有的对象，比如，所有在 XML bean 配置文件中的 bean。
		 * 2. 第二步利用第一步生成的上下文中的 getBean() 方法得到所需要的 bean。 这个方法通过配置文件中的 bean ID 来返回一个真正的对象。一旦得到这个对象，就可以利用这个对象来调用任何方法。
		 * */
		ApplicationContext context=new FileSystemXmlApplicationContext("/src/Beans-simple.xml");
		HelloWorld obj= (HelloWorld)context.getBean("helloWorld");
		obj.getMessage();
	}

}
