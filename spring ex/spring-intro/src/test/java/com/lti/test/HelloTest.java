package com.lti.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.bank.HdfcAtm;
import com.lti.component.Calculator;
import com.lti.component.CurrencyConverter;
import com.lti.component.CurrencyConverterImpl;
import com.lti.component.HelloWorld;
import com.lti.component.TextEditor;

public class HelloTest {

	public static void main(String [] args) {
	
		//Loading Spring's IoC Container
	ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
	
	//accessing one of the bean
	HelloWorld hw=(HelloWorld) context.getBean("hw");  //bean 
    System.out.println(hw.sayHello("vijay"));	
	
    CurrencyConverter cc =(CurrencyConverter)  context.getBean("cc");
    System.out.println("currency to dollar :"+cc.convertDollarsToRupees(50));
    
    Calculator ca=(Calculator) context.getBean("ca");
    System.out.println("Add : "+ca.add(3,4));
    System.out.println("Sub :"+ca.sub(4,5));
    
    TextEditor tx=(TextEditor) context.getBean("txtEdtr");
    tx.load("abc.txt");
    
    CurrencyConverterImpl cv=(CurrencyConverterImpl) context.getBean("cc");
    cv.convertDollarsToRupees(12);
    
    HdfcAtm hd=(HdfcAtm) context.getBean("bb");
    System.out.println(hd.withDraw());
	}
	

}
