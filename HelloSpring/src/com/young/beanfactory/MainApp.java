package com.young.beanfactory;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.young.simple.HelloWorld;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*BeanFactory容器：主要功能是为依赖注入DI提供支持。
		 * XmlBeanFactory：这个容器从一个XML文件中读取配置元数据，由这些数据来生成一个被配置化的系统或者应用。
		 * 执行过程：
		 * 1. 利用框架的XmlBeanFactory（）API去生成工厂bean以及利用ClassPathResource（）API去加载在路径ClassPath下可用的bean配置文件
		 * 2. 利用第一步生成的bean工厂对象的getBean（）方法，得到所需要的bean。这个方法通过配置文件中的bean ID来返回一个真正的对象。
		 * */
		XmlBeanFactory factory=new XmlBeanFactory(new ClassPathResource("Beans-simple.xml"));
		HelloWorld obj= (HelloWorld)factory.getBean("helloWorld");
		obj.getMessage();
	}

}
