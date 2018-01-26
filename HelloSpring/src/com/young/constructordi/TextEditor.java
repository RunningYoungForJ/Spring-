package com.young.constructordi;

public class TextEditor {
	private SpellChecker spellChecker;
	public TextEditor(SpellChecker spellChecker) {
		// TODO Auto-generated constructor stub
		System.out.println("Inside TextEditor Constructor");
		this.spellChecker=spellChecker;
	}
	
	public void spellCheck() {
		spellChecker.checkSpelling();
	}
	
	
}
