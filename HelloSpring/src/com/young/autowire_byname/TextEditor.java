package com.young.autowire_byname;

public class TextEditor {
	private SpellChecker spellChecker;
	private String name;
	
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
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void spellCheck() {
		System.out.println(name);
		spellChecker.checkSpelling();
	}	
}
