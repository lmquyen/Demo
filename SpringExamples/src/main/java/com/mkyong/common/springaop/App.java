package com.mkyong.common.springaop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dt2.demo.User;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext appContext = new ClassPathXmlApplicationContext(
				new String[] { "Spring-Customer.xml","Spring-UserInfo.xml" });

		CustomerService cust = (CustomerService) appContext.getBean("customerService");

		System.out.println("*************************");
		cust.printName();
		System.out.println("*************************");
		cust.printURL();
		System.out.println("*************************");
		
		User user = (User) appContext.getBean("userService");
		user.printFullName();
		try {
			cust.printThrowException();
		} catch (Exception e) {

		}
    }
}
