package com.noradltd.cucumberjvm.demo;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StringReverserSteps {

	private StringReverser reverser;
	private String actual;

	@Given("^a String Reverser$")
	public void a_String_Reverser() throws Throwable {
		reverser = new StringReverser();
	}

	@When("^I reverse the string \"([^\"]*)\"$")
	public void I_reverse_the_string(String input) throws Throwable {
		actual = reverser.reverse(input);
	}

	@Then("^the result is \"([^\"]*)\"$")
	public void the_result_is(String expected) throws Throwable {
		assertThat(actual, is(expected));
	}

}
