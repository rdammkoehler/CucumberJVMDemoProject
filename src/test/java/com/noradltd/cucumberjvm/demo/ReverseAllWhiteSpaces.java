package com.noradltd.cucumberjvm.demo;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ReverseAllWhiteSpaces {

	private String reverse(String input) {
		return new StringReverser().reverse(input);
	}

	@Test
	public void backspaceIsWhiteSpace() {
		assertThat(reverse("Hello\bWorld"), is("World\bHello"));
	}

	@Test
	public void formFeedIsWhiteSpace() {
		assertThat(reverse("Hello\fWorld"), is("World\fHello"));
	}

	@Test
	public void carraigeReturnIsWhiteSpace() {
		assertThat(reverse("Hello\rWorld"), is("World\rHello"));
	}
	
	@Test
	public void newLineIsWhiteSpace() {
		assertThat(reverse("Hello\nWorld"),is("World\nHello"));
	}
	
	@Test
	public void tabIsWhiteSpace() {
		assertThat(reverse("Hello\tWorld"),is("World\tHello"));
	}
	
	@Test
	public void mixedWhiteSpaceFidelity() {
		assertThat(reverse("Cat\tHat\fVat\nFat"), is("Fat\tVat\fHat\nCat"));
	}
	
	@Test
	public void dropsTrailingSpace() {
		assertThat(reverse("Hello World "), is("World Hello"));
	}
	
	@Test
	public void dropsTrailingNewLines() {
		assertThat(reverse("Hello World\n"), is("World Hello"));
	}
}
