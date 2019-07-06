package com.lti.component;

import org.springframework.stereotype.Component;

@Component("hw")
public class HelloWorld implements HelloWorldInt {

	public String sayHello(String name) {
		return "Hello " + name;
	}
}
