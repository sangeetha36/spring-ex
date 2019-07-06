package com.lti.bank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("bb")
public class HdfcAtm implements Atm {

	
	@Autowired
	@Qualifier("ba")
	private IciciBank  ib;
	
	public String withDraw () {
	return "In process" +  ib.communicate();
	}
	

}
