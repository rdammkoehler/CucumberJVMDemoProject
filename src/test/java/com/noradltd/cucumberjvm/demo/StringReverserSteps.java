package com.noradltd.cucumberjvm.demo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.runtime.PendingException;

public class StringReverserSteps {

	private StringReverser reverser;
	
	@Given("^a String Reverser$")
	public void a_String_Reverser() throws Throwable {
		reverser = new StringReverser();
	}

	@When("^I reverse the string \"([^\"]*)\"$")
	public void I_reverse_the_string(String arg1) throws Throwable {
	    throw new PendingException();
	}

	@Then("^the result is \"([^\"]*)\"$")
	public void the_result_is(String arg1) throws Throwable {
	    throw new PendingException();
	}
	
}
