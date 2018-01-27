package com.young.autowire_constructor;

public class TextEditor {
	private SpellChecker spellChecker;
	private String name;
	
	public TextEditor() {
		// TODO Auto-generated constructor stub
		System.out.println("Inside TextEditor Constructor");
	}
	
	public TextEditor(SpellChecker spellChecker,String name) {
		System.out.println("Inside TextEditor Constructor");
		this.spellChecker=spellChecker;
		this.name=name;
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
