package com.noradltd.cucumberjvm.demo;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ReverseBasics {

	private static final String EMPTY_STRING = "";
	
	private String reverse(String input) {
		return new StringReverser().reverse(input);
	}

	@Test
	public void emptyStringIsReversedToEmptyString() {
		assertThat(reverse(EMPTY_STRING), is(EMPTY_STRING));
	}

	@Test
	public void singleCharacterIsReversedToItself() {
		assertThat(reverse("a"), is("a"));
	}
	
	@Test
	public void singleWordIsReversedToItself() {
		assertThat(reverse("werd"), is("werd"));
	}
}
