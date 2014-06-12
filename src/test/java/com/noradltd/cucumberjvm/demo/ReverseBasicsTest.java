package com.noradltd.cucumberjvm.demo;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ReverseBasicsTest {

	private static final String SINGLE_WORD = "werd";
	private static final String SINGLE_CHARACTER = "a";
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
		assertThat(reverse(SINGLE_CHARACTER), is(SINGLE_CHARACTER));
	}

	@Test
	public void singleWordIsReversedToItself() {
		assertThat(reverse(SINGLE_WORD), is(SINGLE_WORD));
	}

	@Test
	public void nullIsReversedToNull() {
		assertThat(reverse(null), is(nullValue()));
	}
}
