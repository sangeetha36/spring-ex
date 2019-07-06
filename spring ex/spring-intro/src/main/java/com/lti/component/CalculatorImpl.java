 package com.lti.component;

import org.springframework.stereotype.Component;

@Component("ca")
public class CalculatorImpl implements Calculator {

	public  int add(int a,int b) {
		 return a+b;
	 }
	public  int sub(int  a,int b) {
		 return a-b;
	 }
}
