package com.spring.application.main;

import java.sql.DriverManager;
import java.util.Date;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.application.entity.JioOffice;
import com.spring.application.entity.Transaction;
import com.spring.application.entity.User;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext=null;
		try {
			applicationContext= new ClassPathXmlApplicationContext(
					"ApplicationContext.xml");
			Date date = applicationContext.getBean("date", Date.class);// GETTING THE DATE FROM THE SIMPLEDATEFORMAT
																		// USING FACTORY BEAN AND FACTORY METHOD
//			System.out.println(date);
			User simpleParamUser = applicationContext.getBean("simpleParamUser", User.class);//GETTING BEAN VALUE FOR SIMPLE PARAM CONST OF USER
//			System.out.println(simpleParamUser);
			Transaction transaction=applicationContext.getBean("simpleParamTransaction",Transaction.class);//getting bean for the transacation simple type
//			System.out.println(transaction);
			String dateInString=applicationContext.getBean("stringDate",String.class);//GETTING BEAN IN FORMATTER SDF
//			System.out.println(dateInString);
			JioOffice jioOfficeSimple=applicationContext.getBean("jioOfficeSimple",JioOffice.class);
//			System.out.println(jioOfficeSimple);
			
			JioOffice jioAutoWiringName=applicationContext.getBean("jioOffice",JioOffice.class);//FINDS THE BEAN TO INJECT THE VALUE WITH THE SAME NAME AS FIELD
//			System.out.println(jioAutoWiringName);
			JioOffice jioAutoConstructor=applicationContext.getBean("jioAutoConstructor",JioOffice.class);
//			System.out.println(jioAutoConstructor);
			
			JioOffice jioAutoTypeOffice=applicationContext.getBean("jioAutoTypeOffice",JioOffice.class);//by type
//			System.out.println(jioAutoTypeOffice);

			
			
			applicationContext.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
finally {
	
	
	
}
	}

}
