 package com.lti.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("cc")  //alternative to <bean id=".." class="..">
public class CurrencyConverterImpl implements CurrencyConverter {

	@Autowired
	private CurrencyValue cv;
	  public double convertDollarsToRupees(double dollars) {
		  cv.currencyValue(dollars);
		 // return dollars*currency;
		return dollars;
		  
		  
	  }
}
