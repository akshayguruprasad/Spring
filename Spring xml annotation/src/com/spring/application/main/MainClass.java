package com.spring.application.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
public static void main(String[] args) {
try {
	ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
			"ApplicationContext.xml");
} catch (Exception e) {
e.printStackTrace();
}
}
}
