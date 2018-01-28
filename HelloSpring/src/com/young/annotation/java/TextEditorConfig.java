package com.young.annotation.java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TextEditorConfig {

	@Bean
	public TextEditor TextEditor() {
		return new TextEditor(spellChecker());
	}
	
	@Bean
	public SpellChecker spellChecker() {
		return new SpellChecker();
	}
}
