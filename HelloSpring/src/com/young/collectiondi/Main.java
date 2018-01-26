package com.young.collectiondi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.young.constructordi.TextEditor;

public class Main {

	/*
	 * Spring 提供了四种类型的集合的配置元素，如下所示：

		元素		描述
		<list>	它有助于连线，如注入一列值，允许重复。
		<set>	它有助于连线一组值，但不能重复。
		<map>	它可以用来注入名称-值对的集合，其中名称和值可以是任何类型。
		<props>	它可以用来注入名称-值对的集合，其中名称和值都是字符串类型。
		你可以使用<list>或<set>来连接任何 java.util.Collection 的实现或数组。
		
		你会遇到两种情况（a）传递集合中直接的值（b）传递一个 bean 的引用作为集合的元素
		在XML中，这四种集合配置元素都是位于bean的子标签<property>下，对于每一个集合对象，都要单独新建一个<property>子标签来管理
		具体的格式如下：
		<property name="addressList">
	         <list>
	            <value>INDIA</value>
	            <value>Pakistan</value>
	            <value>USA</value>
	            <value>USA</value>
	         </list>
	      </property>
	
	      <!-- results in a setAddressSet(java.util.Set) call -->
	      <property name="addressSet">
	         <set>
	            <value>INDIA</value>
	            <value>Pakistan</value>
	            <value>USA</value>
	            <value>USA</value>
	        </set>
	      </property>
	
	      <!-- results in a setAddressMap(java.util.Map) call -->
	      <property name="addressMap">
	         <map>
	            <entry key="1" value="INDIA"/>
	            <entry key="2" value="Pakistan"/>
	            <entry key="3" value="USA"/>
	            <entry key="4" value="USA"/>
	         </map>
	      </property>
	
	      <!-- results in a setAddressProp(java.util.Properties) call -->
	      <property name="addressProp">
	         <props>
	            <prop key="one">INDIA</prop>
	            <prop key="two">Pakistan</prop>
	            <prop key="three">USA</prop>
	            <prop key="four">USA</prop>
	         </props>
	      </property>
	      其中，<property>中的name用来指定需要被注入的bean中的集合对象，然后通过Spring提供的四种集合配置元素进行注入。
	      上述方式是给bean的集合对象中直接注入基本数据类型，如果集合元素是对象引用，则应该如下注入：
	      <property name="addressList">
         <list>
            <ref bean="address1"/>
            <ref bean="address2"/>
            <value>Pakistan</value>
         </list>
      </property>

      <!-- Passing bean reference  for java.util.Set -->
      <property name="addressSet">
         <set>
            <ref bean="address1"/>
            <ref bean="address2"/>
            <value>Pakistan</value>
         </set>
      </property>

      <!-- Passing bean reference  for java.util.Map -->
      <property name="addressMap">
         <map>
            <entry key="one" value="INDIA"/>
            <entry key ="two" value-ref="address1"/>
            <entry key ="three" value-ref="address2"/>
         </map>
      </property>
      其中，ref属性来指定注入元素是一个引用，value属性说明注入元素是一个基本数据类型
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/young/collectiondi/di-collection.xml");
		JavaCollection collection=(JavaCollection)context.getBean("javaCollection");
		collection.getAddressList();
		collection.getAddressSet();
		collection.getAddressMap();
		collection.getAddressProp();

	}

}
