package com.lti.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("txtEdtr")
public class TextEditor {

	//DI
	//FIELD INJECTION '
	@Autowired
	private SpellChecker sp;     //point of the injection..... this type is known as  known as field injection
	public void load(String doc) {
		
		System.out.println(doc+"loader...");
      // SpellChecker sc=new SpellChecker();
		sp.spellCheck(doc);
		
	}
}
