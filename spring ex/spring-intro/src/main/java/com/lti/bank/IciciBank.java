package com.lti.bank;

import org.springframework.stereotype.Component;
@Component("ba")


public class IciciBank implements Bank {


	public String communicate() {
		return "Success";
	}

}
