package com.dt2.demo;

import com.mkyong.common.springaop.CustomerService;

public class Demo1 {

	public static void main(String[] args) {
		System.out.println("test1");
		CustomerService cust = new CustomerService();
		System.out.println("*************************");
		cust.printName();
		System.out.println("*************************");
		cust.printURL();
		System.out.println("*************************");

	}

}
