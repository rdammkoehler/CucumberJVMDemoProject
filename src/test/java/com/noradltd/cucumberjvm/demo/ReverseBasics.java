package com.noradltd.cucumberjvm.demo;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ReverseBasics {

	private static final String EMPTY_STRING = "";

	@Test
	public void emptyStringIsReversedToEmptyString() {
		assertThat(new StringReverser().reverse(EMPTY_STRING), is(EMPTY_STRING));
	}

	@Test
	public void singleCharacterIsReversedToItself() {
		assertThat(new StringReverser().reverse("a"), is("a"));
	}
}
