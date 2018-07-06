package com.demo.spring.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.spring.configs.Start;
import com.demo.spring.entity.Address;
import com.demo.spring.entity.Person;

public class MainClass {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		AnnotationConfigApplicationContext classConfig = new AnnotationConfigApplicationContext(Start.class);
		Address a = classConfig.getBean("address", Address.class);
		System.out.println(a);
		 Person p=context.getBean("person",Person.class);

		 System.out.println(p);

		 ((AbstractApplicationContext)context).close();
		 ((AbstractApplicationContext)classConfig).close();
		 
	}
}
