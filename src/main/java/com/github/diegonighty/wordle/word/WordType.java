package com.github.diegonighty.wordle.word;

public enum WordType {

	INCORRECT("incorrect"),
	KEYBOARD("keyboard"),
	CORRECT("correct"),
	BAD_POSITION("bad-position"),
	MISC("misc");

	String configurationPath;

	WordType(String configurationPath) {
		this.configurationPath = configurationPath;
	}

	public String path() {
		return configurationPath;
	}
}
