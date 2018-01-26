package com.young.setterdi;

public class TextEditor {
	private SpellChecker spellChecker;
	
	public TextEditor() {
		// TODO Auto-generated constructor stub
		System.out.println("Inside TextEditor Constructor");
	}
	
	public void setSpellChecker(SpellChecker spellChecker) {
		System.out.println("Inside setSpellChecker");
		this.spellChecker=spellChecker;
	}
	
	public SpellChecker getSpellChecker() {
		return this.spellChecker;
	}
	
	public void spellCheck() {
		spellChecker.checkSpelling();
	}
	
	
}
