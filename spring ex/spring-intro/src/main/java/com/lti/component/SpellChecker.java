package com.lti.component;

import org.springframework.stereotype.Component;

@Component("splChckr")
public class SpellChecker {

	public void spellCheck(String doc) {
		System.out.println("spell check done for "+doc);
	}
}
