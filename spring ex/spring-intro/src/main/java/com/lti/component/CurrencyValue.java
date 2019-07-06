package com.lti.component;

import org.springframework.stereotype.Component;

@Component("cv")
public class CurrencyValue {

	
	public void currencyValue(double dollars) {
		dollars=dollars*68.44;
		System.out.println(" dollar value :"+dollars);
	}
}
