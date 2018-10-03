package main.java.di_with_setter;

public class TextEditor {
private SpellChecker spellChecker;

public SpellChecker getSpellChecker() {
	return spellChecker;
}

public void setSpellChecker(SpellChecker spellChecker) {
	this.spellChecker = spellChecker;
}

public void spellChecking() {
	spellChecker.checkSpelling();
}
}
