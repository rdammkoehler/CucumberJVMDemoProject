package com.noradltd.cucumberjvm.demo;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ReverseAllWhiteSpaces {

	// \b\v\r\b\n\f\t

	private String reverse(String input) {
		return new StringReverser().reverse(input);
	}

	@Test
	public void backspaceIsWhiteSpace() {
		assertThat(reverse("Hello\\bWorld"), is("World\\bHello"));
	}

	@Test
	public void formFeedIsWhiteSpace() {
		assertThat(reverse("Hello\\fWorld"), is("World\\fHello"));
	}

	@Test
	public void verticalTabIsWhiteSpace() {
		assertThat(reverse("Hello\\vWorld"), is("World\\vHello"));
	}

	@Test
	public void carraigeReturnIsWhiteSpace() {
		assertThat(reverse("Hello\\rWorld"), is("World\\rHello"));
	}
	
	@Test
	public void newLineIsWhiteSpace() {
		assertThat(reverse("Hello\\nWorld"),is("World\\nHello"));
	}
	
	@Test
	public void tabIsWhiteSpace() {
		assertThat(reverse("Hello\\tWorld"),is("World\\tHello"));
	}
}
