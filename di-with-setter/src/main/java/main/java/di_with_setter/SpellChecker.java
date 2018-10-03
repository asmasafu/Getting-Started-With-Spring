package main.java.di_with_setter;

public class SpellChecker {
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void checkSpelling() {
		System.out.println("Spell check completed");
	}
}
