package com.young.annotation.autowired;

import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor {
	@Autowired
	private SpellChecker spellChecker;
	
	/*@Autowired*/
	public TextEditor(SpellChecker spellChecker) {
		System.out.println("Inside TextEditor Constructor");
		this.spellChecker=spellChecker;
	}
	
	public TextEditor() {
		// TODO Auto-generated constructor stub
		System.out.println("Inside TextEditor Constructor");
	}
	
	/*@Autowired
	public void setSpellChecker(SpellChecker spellChecker) {
		System.out.println("Inside setSpellChecker");
		this.spellChecker=spellChecker;
	}*/
	
	public SpellChecker getSpellChecker() {
		return this.spellChecker;
	}

	public void spellCheck() {
		spellChecker.checkSpelling();
	}	
}
