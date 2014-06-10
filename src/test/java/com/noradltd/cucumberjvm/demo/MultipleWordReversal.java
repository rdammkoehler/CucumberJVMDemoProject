package com.noradltd.cucumberjvm.demo;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class MultipleWordReversal {

	private String reverse(String input) {
		return new StringReverser().reverse(input);
	}
	
	@Test
	public void helloWorldReversesToWorldHello() {
		assertThat(reverse("Hello World"), is("World Hello"));
	}
	
	@Test
	public void handlesMultipleWhitespaces() {
		assertThat(reverse("Hello  World"), is("World  Hello"));
	}
	
	@Test
	public void handlesSeveralWords() {
		assertThat(reverse("Bacon is the life blood of Agile Software Development"), is("Development Software Agile of blood life the is Bacon"));
	}
}
